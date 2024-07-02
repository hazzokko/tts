package kr.co.mediazen.tts.controller.response;

import lombok.Getter;

@Getter
public class ErrorApiResponse extends CommonApiResponse {

    private final String code; 		// 에러 코드
    private final String exception; // 예외 클래스 이름

    public ErrorApiResponse(int httpStatus, String message, String code, String exception) {
        super(httpStatus, message);
        this.code = code;
        this.exception = exception;
    }
}
