package kr.co.mediazen.tts.service;

import java.util.Optional;

import kr.co.mediazen.tts.dto.request.UserJoinRequestDto;
import kr.co.mediazen.tts.model.User;

public interface UserService {

	/**
	 * 회원 가입 요청을 처리하는 메서드
	 * 사원번호 중복 체크가 선행되며, 신규 등록일 경우 회원 가입 진행
	 * 
	 * @param user 회원 가입 정보
	 * @throws NullPointerException   {@code dto}가 null일 경우
	 * @throws DuplicationIdException 기 등록된 사원번호일 경우
	 * @author minji
	 * @since 2024.06.24
	 */
	void join(UserJoinRequestDto dto);
	
}