package kr.co.mediazen.tts.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mediazen.tts.dao.request.UserDAO;
import kr.co.mediazen.tts.model.UserVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {
	
	private final UserDAO userDAO;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Transactional
	@Override
	public void join(UserVO userVO) {
		String rawPassword = userVO.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		userVO.setPassword(encPassword);
		
		userDAO.join(userVO);
	}
}
