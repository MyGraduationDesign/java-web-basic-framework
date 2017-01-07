package com.lxg.action;

import com.lxg.bean.User;
import com.lxg.dao.UserDao;
import com.lxg.daoFactory.DaoFactory;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdate extends ActionSupport {
	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		User user = new User(id,name,password);
		boolean i = userDao.update(user);
		if(i)
			return "success";
		else
			return "input";
	}
	
}
