package com.chinasofti.dao;

import javax.servlet.http.HttpSession;

import com.chinasofti.pojo.User;
public interface UserDao {
//  ע��1 
	void register(User user);
//  ��¼ 
	String login(String name,String password);
//	�޸�����
	int updatePassword(User user,String oldPassword);
//	��ѯ������Ϣ
	User  sfindOne(String name);
//	�û�����
	String loginUser(String name);
}
