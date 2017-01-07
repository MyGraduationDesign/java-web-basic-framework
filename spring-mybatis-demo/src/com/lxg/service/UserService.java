package com.lxg.service;

import java.util.List;
import com.lxg.po.User;

public interface UserService {

	public List<User> UserList() throws Exception;
	public User findItemsById(Integer id) throws Exception;
	public boolean editUser(User user)throws Exception;
	public void updateUser(Integer id,User user) throws Exception;
	public boolean delUser(Integer id) throws Exception;
	public int addUser(User user) throws Exception;
}
