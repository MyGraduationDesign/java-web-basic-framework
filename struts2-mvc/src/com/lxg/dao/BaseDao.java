package com.lxg.dao;

import java.sql.SQLException;
import java.util.List;

public interface BaseDao<T, F> {
	public boolean add(T t) throws SQLException;
	public boolean update(T t) throws SQLException;
	public boolean delete(int id) throws SQLException;
	public List<T> findAll() throws SQLException;
	public List<T> findAllPage(F f);
	public T findById(int id) throws SQLException;
	public int findAllCount();
}
