package com.lxg.entity;

/*
 * 用户实体类
 */
public class User {

	/**
	 * 用户id
	 */
	private int id;
	
	/**
	 * 用户名
	 */
	private String name;
	
	/**
	 * 用户电话
	 */
	private String phone;
	
	/**
	 * 用户邮箱
	 */
	private String email;
	
	/**
	 * 用户qq
	 */
	private String qq;
	
	public User() {
	}
	
	public User(String name, String phone, String email, String qq) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.qq = qq;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
