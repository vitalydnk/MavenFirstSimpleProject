package com.vitalydnk.usersdb.dao;

import java.util.List;

import com.vitalydnk.usersdb.dao.domain.User;

public interface UserDao {

	List<User> loadAllUsers();

	User loadUserById(Integer userId);

	User loadUserByUserName(String userName);

	Integer storeUser(User user);

	void updateUser(User user);

	void deleteUser(Integer userId);
}
