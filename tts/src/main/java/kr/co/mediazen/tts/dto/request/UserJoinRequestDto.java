package kr.co.mediazen.tts.dto.request;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import kr.co.mediazen.tts.dao.request.validation.ValidationDefaultMsgUtil;
import kr.co.mediazen.tts.model.Department;
import kr.co.mediazen.tts.model.Role;
import lombok.Data;

@Data
public class UserJoinRequestDto {

//	private final UserMapper userMapper;
//	
//	public void join(UserVO userVO) {
//		userMapper.join(userVO);
//	}
	
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
