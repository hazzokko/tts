package kr.co.mediazen.tts.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {

	// 글 목록 조회
	List<Map<String, Object>> getNoticeList(Map<String, Object> paramMap);
	
	// 총 게시글 개수 조회
	int getNoticeCount(Map<String, Object> paramMap);
}