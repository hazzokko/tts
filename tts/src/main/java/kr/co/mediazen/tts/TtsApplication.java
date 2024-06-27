package kr.co.mediazen.tts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "kr.co.mediazen.tts.mapper")
public class TtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TtsApplication.class, args);
	}

}