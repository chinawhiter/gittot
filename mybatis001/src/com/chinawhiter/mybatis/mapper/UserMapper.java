package com.chinawhiter.mybatis.mapper;

import com.chinawhiter.mybatis.po.User;

public interface UserMapper {
	public User findUserById(String userId)throws Exception;
}
