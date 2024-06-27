package kr.co.mediazen.tts.config.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mediazen.tts.mapper.UserMapper;
import kr.co.mediazen.tts.model.UserVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class PrincipalDetailsService implements UserDetailsService {
	
	private final UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Long userId = Long.parseLong(username);
		UserVO userVO = userMapper.findByUsername(userId);
		if (userVO == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		} else {
			return new PrincipalDetails(userVO);
		}
	}
}
