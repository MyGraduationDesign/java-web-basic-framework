package com.lxg.action;

import com.lxg.dao.UserDao;
import com.lxg.daoFactory.DaoFactory;
import com.opensymphony.xwork2.ActionSupport;

public class UserDel extends ActionSupport {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		UserDao userDao = DaoFactory.getUserDao();
		boolean i = userDao.delete(id);
		if(i)
			return "success";
		else
			return "input";
	}
	
}
