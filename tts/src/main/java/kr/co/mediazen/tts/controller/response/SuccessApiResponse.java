package kr.co.mediazen.tts.controller.response;

import lombok.Getter;

@Getter
public class SuccessApiResponse<T> extends CommonApiResponse {

	private final T data; // 응답 데이터

    public SuccessApiResponse(int httpStatus, String message, T data) {
        super(httpStatus, message);
        this.data = data;
    }
}
