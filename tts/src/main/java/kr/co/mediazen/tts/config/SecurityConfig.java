package kr.co.mediazen.tts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http
				.csrf().disable()
				.httpBasic().disable()
				.formLogin().disable()

				.authorizeHttpRequests()
					.antMatchers("/api/v1/users/**").authenticated()
					.anyRequest().permitAll()

				.and()
					.formLogin()
					.loginPage("/api/v1/login")
					.loginProcessingUrl("/login")
					.defaultSuccessUrl("/");

//				.and()
//					.sessionManagement()
//					.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		return http.build();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
