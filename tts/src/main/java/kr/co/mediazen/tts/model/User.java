package kr.co.mediazen.tts.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
public class User {
	
	private Long id;
	private String password;
	private String username;
	private Department department;
	private String phone;
	private Role role;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	
	@Builder
	public User(Long id, String password, String username, Department department, String phone, Role role) {
		this.id = id;
		this.password = password;
		this.username = username;
		this.department = department;
		this.phone = phone;
		this.role = role;
	}
}
