package kr.co.mediazen.tts.dao.request;

import org.springframework.stereotype.Repository;

import kr.co.mediazen.tts.mapper.UserMapper;
import kr.co.mediazen.tts.model.UserVO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class UserDAO {

	private final UserMapper userMapper;
	
	public void join(UserVO userVO) {
		userMapper.join(userVO);
	}
}
