package kr.co.mediazen.tts.dto.response;

import javax.validation.constraints.NotBlank;

import kr.co.mediazen.tts.dao.request.validation.ValidationDefaultMsgUtil;
import kr.co.mediazen.tts.model.Role;
import lombok.Data;

@Data
public class UserLoginResponseDto {

	// 사원번호
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.ID)
	private String id;
	
	// 비밀번호
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.PASSWORD)
	private String password;
	
	// 직위
	@NotBlank(message = ValidationDefaultMsgUtil.UserJoin.ROLE)
	private Role role;
}
