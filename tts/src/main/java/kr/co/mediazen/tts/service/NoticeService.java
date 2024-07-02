package kr.co.mediazen.tts.service;

import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NoticeService {

	/**
	 * 공지사항 목록 조회 요청을 처리하는 메서드
	 * 
	 * @return 게시글번호, 사원번호, 사원명, 제목, 게시글타입, 등록일
	 * @author minji
	 * @since  2024.06.28
	 */
	Page<Map<String, Object>> getNoticeList(Map<String, Object> paramMap, Pageable page);
}
