package kr.co.mediazen.tts.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kr.co.mediazen.tts.config.auth.PrincipalDetails;
import kr.co.mediazen.tts.dto.request.UserJoinRequestDto;
import kr.co.mediazen.tts.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@Controller
public class AuthController {
	
	private final UserService userService;
	
	// 로그인 폼으로 이동
	@GetMapping("/login")
	public String login(Model model) {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        
		if (authentication != null && authentication.isAuthenticated()) {
			
            Object principal = authentication.getPrincipal();
            
            if (principal instanceof PrincipalDetails) {
            	
                PrincipalDetails userDetails = (PrincipalDetails) principal;
                model.addAttribute("displayName", userDetails.getDisplayName()); // 로그인한 사용자명을 JSP로 전달
            }
        }
        
		return "login";
	}
	
	// 회원가입 폼으로 이동
	@GetMapping("/join")
	public String Join() {
		return "join";
	}
	
	// 회원가입
	@PostMapping("/join")
	public String join(@RequestBody UserJoinRequestDto dto) {
		userService.join(dto);
		return "redirect:/api/v1/auth/login";
	}
	
	// 로그아웃
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		
		if (authentication != null) {
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		
		return "redirect:/api/v1/auth/login";
	}
}
