package kr.co.mediazen.tts.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mediazen.tts.model.UserVO;

@Mapper
public interface UserMapper {
	
	/* 로그인 */
	UserVO findByUsername(String id);
	
	/* 회원가입 */
	void join(UserVO userVO);
}