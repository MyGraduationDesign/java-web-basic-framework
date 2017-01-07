package com.lxg.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.lxg.mapper.UserMapper;
import com.lxg.mapper.UserMapperCustom;
import com.lxg.po.User;
import com.lxg.service.UserService;

public class UserServiceImpl implements UserService{
	
		@Autowired
		private UserMapperCustom userMapperCustom;
		@Autowired
		private UserMapper userMapper;
		
		public List<User> UserList() throws Exception{
			return userMapperCustom.findUserList();
			
		}
		
		public boolean editUser(User user)throws Exception{
			int i = userMapper.updateByPrimaryKeySelective(user);
			if(i==1)
				return true;
			else
				return false;
		}

		public User findItemsById(Integer id) throws Exception {
			User User = userMapper.selectByPrimaryKey(id);
			//将items的属性值拷贝到itemsCustom
			return User;
		}

		public void updateUser(Integer id, User user) throws Exception {
			user.setId(id);
			userMapper.updateByPrimaryKeySelective(user);
		}

		public boolean delUser(Integer id) throws Exception {
			// TODO Auto-generated method stub
			int flag = userMapper.deleteByPrimaryKey(id);
			if(flag==1)
				return true;
			else
				return false;
		}

		public int addUser(User user) throws Exception {
			// TODO Auto-generated method stub
			int i = userMapper.insertSelective(user);
			return i;
		}
}
