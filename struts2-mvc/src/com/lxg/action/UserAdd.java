package com.lxg.action;

import com.lxg.bean.User;
import com.lxg.dao.UserDao;
import com.lxg.daoFactory.DaoFactory;
import com.opensymphony.xwork2.ActionSupport;
	
public class UserAdd extends ActionSupport {
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		UserDao userDao = DaoFactory.getUserDao();
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		boolean i = userDao.add(user);
		if(i)
			return "success";
		else
			return "input";
	}
	
}
