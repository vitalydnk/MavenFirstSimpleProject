package com.vitalydnk.usersdb.service;

import java.util.List;

import com.vitalydnk.usersdb.dao.UserDao;
import com.vitalydnk.usersdb.dao.domain.User;
import com.vitalydnk.usersdb.dao.jdbc.UserDaoImpl;

public class UserService {
	public List<User> getAllUsers() {
		UserDao dao = new UserDaoImpl();
		return dao.loadAllUsers();
	}

}
