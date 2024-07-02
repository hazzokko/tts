package kr.co.mediazen.tts.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mediazen.tts.dto.request.UserJoinRequestDto;
import kr.co.mediazen.tts.dto.response.UserLoginResponseDto;

@Mapper
public interface UserMapper {
	
	/* 로그인 */
	UserLoginResponseDto findByUsername(String id);
	
	/* 회원가입 */
	void join(UserJoinRequestDto dto);
}