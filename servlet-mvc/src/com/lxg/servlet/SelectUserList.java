package com.lxg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxg.bean.User;
import com.lxg.dao.UserDao;
import com.lxg.daoFactory.DaoFactory;
import com.lxg.util.Page;
import com.lxg.util.PageUtil;

public class SelectUserList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int currentPage = 0;
		String currentPageStr = request.getParameter("currentPage");
		if(currentPageStr == null || "".equals(currentPageStr)){
			currentPage = 1;
		}else {
			currentPage = Integer.parseInt(currentPageStr);
		}
		UserDao userDao = DaoFactory.getUserDao();
		Page page = PageUtil.createPage(5, userDao.findAllCount(), currentPage);
		List<User> users = userDao.findAllPage(page);
		request.setAttribute("userList", users);
		request.setAttribute("page", page);
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		doGet(request, response);
	}

}
