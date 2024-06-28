package kr.co.mediazen.tts.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import kr.co.mediazen.tts.dao.request.validation.ValidationDefaultMsgUtil;
import lombok.Data;

@Data
public class UserVO {
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.ID)
	private String id;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.PASSWORD)
	private String password;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.USERNAME)
	private String username;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.DEPARTMENT)
	private Department department;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.PHONE)
	private String phone;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.ROLE)
	private Role role;
	
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
}