package kr.co.mediazen.tts.dto.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import kr.co.mediazen.tts.model.NoticeType;
import lombok.Data;

@Data
public class NoticeListResponseDto {

	// 게시글 번호
	private Long id;
	
	// 사원번호
	private String userId;
	
	// 사원명
	private String username;
	
	// 제목
	private String title;
	
	// 게시글 타입
	private NoticeType noticeType;
	
	// 등록일
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDateTime createdAt;
}
