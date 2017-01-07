package com.lxg.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lxg.bean.User;
import com.lxg.dao.UserDao;
import com.lxg.daoFactory.DaoFactory;
import com.lxg.util.Page;
import com.lxg.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;

public class UserSelect extends ActionSupport {
	private int currentPage;
	
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	@Override
	public String execute() throws Exception {
		if("".equals(currentPage)){
			currentPage = 1;
		}
		UserDao userDao = DaoFactory.getUserDao();
		Page page = PageUtil.createPage(5, userDao.findAllCount(), currentPage);
		List<User> users = userDao.findAllPage(page);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("userList", users);
		request.setAttribute("page", page);
		return "success";
	}
	
}
