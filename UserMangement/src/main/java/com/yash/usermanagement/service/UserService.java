package com.yash.usermanagement.service;

import java.util.List;

import com.yash.usermanagement.entity.User;

public interface UserService {
	public User createUser(User user);

	public List<User> getAllUser();

	public User getUserById(long id);

	public Boolean deleteUserById(long id);

	public User updateUser(User user);

}
