package com.chinasofti.server;


import com.chinasofti.pojo.User;

public interface UserDaoServer {
//  ע��
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
