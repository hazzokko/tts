package kr.co.mediazen.tts.config.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mediazen.tts.dto.response.UserLoginResponseDto;
import kr.co.mediazen.tts.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class PrincipalDetailsService implements UserDetailsService {
	
	private final UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		
		UserLoginResponseDto dto = userMapper.findByUsername(id);
		
		if (dto == null) {
			throw new UsernameNotFoundException("User not found with username: " + id);
		} else {
			return new PrincipalDetails(dto);
		}
	}
}
