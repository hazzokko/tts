package kr.co.mediazen.tts.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mediazen.tts.dto.response.NoticeListResponseDto;
import kr.co.mediazen.tts.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class NoticeServiceImpl implements NoticeService {
	
	private final NoticeMapper noticeMapper;

	// 글 목록 조회 (페이징)
	@Override
	public Page<Map<String, Object>> getNoticeList(Map<String, Object> paramMap, Pageable page) {

		paramMap.put("offset", page.getOffset());
		paramMap.put("pageSize", page.getPageSize());
		
		List<Map<String, Object>> contents = noticeMapper.getNoticeList(paramMap);
		int count = noticeMapper.getNoticeCount(paramMap);
		
		return new PageImpl<>(contents, page, count);
	}
}
