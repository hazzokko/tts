package kr.co.mediazen.tts.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import kr.co.mediazen.tts.dto.response.UserLoginResponseDto;

public class PrincipalDetails implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	private UserLoginResponseDto dto;
	
	public PrincipalDetails(UserLoginResponseDto dto) {
		this.dto = dto;
	}
	
	public UserLoginResponseDto getUser() {
		return dto;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collect = new ArrayList<GrantedAuthority>();
		collect.add(() -> { return dto.getRole().toString(); });
		return collect;
	}

	@Override
	public String getPassword() {
		return dto.getPassword();
	}

	// User Table PK
	@Override
	public String getUsername() {
		return dto.getId();
	}
	
	// 사용자에게 보여줄 실제 사원명을 반환
	public String getDisplayName() {
        return dto.getUsername();
    }

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
