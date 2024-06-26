package kr.co.mediazen.tts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mediazen.tts.dto.request.UserJoinRequestDto;
import kr.co.mediazen.tts.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Controller
public class MainController {
	
	private final UserService userService;
	
	@GetMapping
	public String mainPage() {
		return "index";
	}
	
	/* 로그인 폼으로 이동 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
