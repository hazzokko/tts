package kr.co.mediazen.tts.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import kr.co.mediazen.tts.model.User;

@Mapper
public interface UserMapper {
	
	/* 로그인 */
	@Select("SELECT id, password_enc, username, department, phone, role, created_at::TIMESTAMP AS created_at, modified_at::TIMESTAMP AS modified_at "
			+ "FROM users "
			+ "WHERE id = #{id}")
	User findByUsername(Long id);
}