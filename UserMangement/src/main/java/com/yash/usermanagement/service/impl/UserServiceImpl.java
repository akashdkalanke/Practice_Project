package com.yash.usermanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.usermanagement.entity.User;
import com.yash.usermanagement.repository.UserRepository;
import com.yash.usermanagement.service.UserService;
import com.yash.usermanagement.util.DateUtil;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {

		user.setUserId(null);
		user.setCreatedDt(DateUtil.utcNow());
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {

		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public Boolean deleteUserById(long id) {

		if (userRepository.existsById(id)) {
			userRepository.deleteById(id);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public User updateUser(User user) {

		user.setUpdatedDt(DateUtil.utcNow());
		return userRepository.save(user);

	}

}
