package com.lxg.daoFactory;

import com.lxg.dao.UserDao;
import com.lxg.daoImpl.UserDaoImpl;

public class DaoFactory {
	public static UserDao getUserDao(){
		return new UserDaoImpl();
	}
}
