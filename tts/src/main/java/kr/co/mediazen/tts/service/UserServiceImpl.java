package kr.co.mediazen.tts.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mediazen.tts.dto.request.UserJoinRequestDto;
import kr.co.mediazen.tts.mapper.UserMapper;
import kr.co.mediazen.tts.model.User;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {
	
	private final UserMapper userMapper;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Transactional
	@Override
	public void join(UserJoinRequestDto dto) {

		// 비밀번호 암호화
		String rawPassword = dto.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		
		User user = User.builder()
				.id(dto.getId())
				.password(encPassword)
				.username(dto.getUsername())
				.department(dto.getDepartment())
				.phone(dto.getPhone())
				.role(dto.getRole())
				.build();
		
		userMapper.join(user);
	}
}
