package kr.co.mediazen.tts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/notices")
@Controller
public class NoticeController {
	
	@GetMapping
	public String getNoticePage() {
        return "noticeList";
    }
	
	@GetMapping("/post-form")
	public String getPostPage(Model model) {
		model.addAttribute("post-form", "post-value");
		return "postNotice";
	}
	
	@PostMapping
	public String insertNotice() {
		return "post";
	}
}
