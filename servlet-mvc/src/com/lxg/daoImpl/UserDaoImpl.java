package com.lxg.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lxg.bean.User;
import com.lxg.dao.UserDao;
import com.lxg.util.DBConnection;
import com.lxg.util.Page;

public class UserDaoImpl implements UserDao {

	public boolean add(User t) throws SQLException {
		String sql = "insert into user(name,password)values(?,?)";
		boolean flag = false;
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, t.getName());
		psmt.setString(2, t.getPassword());
		int i = psmt.executeUpdate();
		if(i!=0){
			flag = true;
		}
		psmt.close();
		conn.close();
		return flag;
	}

	public boolean delete(int id) throws SQLException {
		String sql = "delete from user where id = ?";
		boolean flag = false;
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setInt(1,id);
		int i = psmt.executeUpdate();
		if(i!=0){
			flag = true;
		}
		psmt.close();
		conn.close();
		return flag;
	}

	public List<User> findAll() throws SQLException {
		String sql = "select * from user";
		List<User> list = new ArrayList<User>();
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery();
		while(rs.next()){
			User user = new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
			list.add(user);
		}
		rs.close();
		psmt.close();
		conn.close();
		return list;
	}

	public int findAllCount() {
		Connection conn = DBConnection.getConnection();	//获得连接对象
		String findSQL = "select count(*) from user";
		PreparedStatement pstmt = null;					//声明预处理对象
		ResultSet rs = null;
		int count = 0;
		try {
			pstmt = conn.prepareStatement(findSQL);		//获得预处理对象并赋值
			rs = pstmt.executeQuery();					//执行查询
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.close(rs);						//关闭结果集对象
			DBConnection.close(pstmt);					//关闭预处理对象
			DBConnection.close(conn);					//关闭连接对象
		}
		return count;
	}

	public List<User> findAllPage(Page f) {
		Connection conn = DBConnection.getConnection();	//获得连接对象
		String findSQL = "select * from user " + "limit ?,?";
		PreparedStatement pstmt = null;					//声明预处理对象
		ResultSet rs = null;
		List<User> users = new ArrayList<User>();
		try {
			pstmt = conn.prepareStatement(findSQL);		//获得预处理对象并赋值
			pstmt.setInt(1, f.getBeginIndex());		//查询起始点
			pstmt.setInt(2, f.getEveryPage());		//查询记录数
			rs = pstmt.executeQuery();				//执行查询
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setPassword(rs.getString(3));
				users.add(user);//添加消息
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnection.close(rs);								//关闭结果集对象
			DBConnection.close(pstmt);							//关闭预处理对象
			DBConnection.close(conn);							//关闭连接对象
		}
		return users;
	}

	public User findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(User t) throws SQLException {
		String sql = "update user set name= ?,password=? where id = ?";
		boolean flag = false;
		
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1,t.getName());
		psmt.setString(2, t.getPassword());
		psmt.setInt(3, t.getId());
		int i = psmt.executeUpdate();
		if(i!=0){
			flag = true;
		}
		psmt.close();
		conn.close();
		return flag;
	}

}
