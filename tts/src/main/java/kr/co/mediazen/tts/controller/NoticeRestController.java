package kr.co.mediazen.tts.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mediazen.tts.controller.response.CommonApiResponse;
import kr.co.mediazen.tts.controller.response.SuccessApiResponse;
import kr.co.mediazen.tts.service.NoticeService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/notices")
@RestController
public class NoticeRestController {
	
	private final NoticeService noticeService;

	@GetMapping("/ajax")
	public CommonApiResponse getNoticeList(@RequestParam Map<String, Object> paramMap, 
										   @PageableDefault(value = 10) Pageable page) {
		
		int httpStatus = HttpStatus.OK.value();
		String message = "공지사항 목록 조회 성공";
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Page<Map<String, Object>> result = noticeService.getNoticeList(paramMap, page);
		
		resultMap.put("pages", result);
		resultMap.put("size", page.getPageSize());
		
		return new SuccessApiResponse<>(httpStatus, message, resultMap);
	}
}
