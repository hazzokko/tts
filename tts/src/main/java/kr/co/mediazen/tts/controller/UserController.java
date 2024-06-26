package kr.co.mediazen.tts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@Controller
public class UserController {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
}
