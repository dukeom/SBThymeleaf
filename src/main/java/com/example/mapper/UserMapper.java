package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.User;

@Mapper
public interface UserMapper {
	@Select("select * from user")
	public List<User> findAll();
}
