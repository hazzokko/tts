package kr.co.mediazen.tts.dto.request.validation;

public class ValidationDefaultMsgUtil {
	
	public static abstract class UserJoin {
		
		public static final String ID = "400_1: 사원번호는 값이 입력되어야 합니다.";
		public static final String PASSWORD = "400_2: 비밀번호는 값이 입력되어야 합니다.";
		public static final String USERNAME = "400_3: 이름의 형식이 올바르지 않습니다.";
		public static final String DEPARTMENT = "400_4: 부서명을 선택해 주세요";
		public static final String PHONE = "400_5: 전화번호 형식이 올바르지 않습니다.";
		public static final String ROLE = "400_6: 직위를 선택해 주세요";
	}
}
