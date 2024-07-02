package kr.co.mediazen.tts.controller.response;

import lombok.Getter;

@Getter
public class CommonApiResponse {

    private final int httpStatus; // 응답 상태 코드
    private final String message; // 응답 메시지

    public CommonApiResponse(int httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
