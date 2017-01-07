package com.lxg.mapper;

import java.util.List;

import com.lxg.po.User;


public interface UserMapperCustom {
	public List<User> findUserList()throws Exception;
}