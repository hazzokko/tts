package kr.co.mediazen.tts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class SecurityConfig {
	
	private final AuthenticationFailureHandler customAuthenticationFailureHandler;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http	
				.csrf().disable()
				
				.authorizeHttpRequests()
					.antMatchers("/resources/css/**", "/resources/js/**", "/resources/images/**", "/resources/fonts/**").permitAll()
					.antMatchers("/", "/api/v1/auth/**").permitAll()
					.anyRequest().authenticated()
				
				.and()
					.formLogin()
					.loginPage("/api/v1/auth/login")
					.loginProcessingUrl("/login")
					.usernameParameter("id")
					.failureHandler(customAuthenticationFailureHandler)
					.defaultSuccessUrl("/api/v1/users")
					
				.and()
					.logout().logoutRequestMatcher(new AntPathRequestMatcher("/api/v1/auth/logout"))
					.logoutSuccessUrl("/api/v1/auth/login")
					.deleteCookies("JSESSIONID")
					.invalidateHttpSession(true); // 로그아웃 시 사용자 세션 삭제

		return http.build();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		return authenticationConfiguration.getAuthenticationManager();
	}
}