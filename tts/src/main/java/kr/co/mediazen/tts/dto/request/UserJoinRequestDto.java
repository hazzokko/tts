package kr.co.mediazen.tts.dto.request;

import javax.validation.constraints.NotBlank;

import kr.co.mediazen.tts.dto.request.validation.ValidationDefaultMsgUtil;
import kr.co.mediazen.tts.model.Department;
import kr.co.mediazen.tts.model.Role;
import lombok.Builder;
import lombok.Data;

@Data
public class UserJoinRequestDto {

	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.ID)
	private final Long id;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.PASSWORD)
	private final String password;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.USERNAME)
	private final String username;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.DEPARTMENT)
	private final Department department;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.PHONE)
	private final String phone;
	
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.ROLE)
	private final Role role;
	
	@Builder
	public UserJoinRequestDto(Long id, String password, String username, Department department, String phone, Role role) {
		this.id = id;
		this.password = password;
		this.username = username;
		this.department = department;
		this.phone = phone;
		this.role = role;
	}
}
