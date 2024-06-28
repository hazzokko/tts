package kr.co.mediazen.tts.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import kr.co.mediazen.tts.model.UserVO;

public class PrincipalDetails implements UserDetails {
	
	private UserVO userVO;
	
	public PrincipalDetails(UserVO userVO) {
		this.userVO = userVO;
	}
	
	public UserVO getUser() {
		return userVO;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> collect = new ArrayList<GrantedAuthority>();
		collect.add(() -> { return userVO.getRole().toString(); });
		return collect;
	}

	@Override
	public String getPassword() {
		return userVO.getPassword();
	}

	// User Table PK
	@Override
	public String getUsername() {
		return userVO.getId();
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
