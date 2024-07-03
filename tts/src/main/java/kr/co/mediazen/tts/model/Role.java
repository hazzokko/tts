package kr.co.mediazen.tts.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
	PRO("ROLE_PRO"),
	MANAGER("ROLE_MANAGER"),
	LEADER("ROLE_LEADER"),
	EXECUTIVE("ROLE_EXECUTIVE"),
	CEO("ROLE_CEO");
	
	private final String key;
}
