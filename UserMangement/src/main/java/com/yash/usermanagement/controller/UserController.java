package com.yash.usermanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.yash.usermanagement.entity.User;
import com.yash.usermanagement.exception.CustomApiException;
import com.yash.usermanagement.service.UserService;

@RestController
public class UserController extends BaseController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) throws CustomApiException {

		try {
			user = userService.createUser(user);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomApiException(e.getMessage());
		}
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers() throws CustomApiException {

		List<User> list = new ArrayList<User>();
		try {
			list = userService.getAllUser();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomApiException();
		}
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);

	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long id) throws CustomApiException {
		
		User user = new User();
		
		try {
			user = userService.getUserById(id);

		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomApiException(e.getMessage());
		}
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<Boolean> deleteUserById(@PathVariable("userId") long id) throws CustomApiException {
		Boolean status = false;
		
		try {
			status = userService.deleteUserById(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomApiException(e.getMessage());
		}
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@PutMapping("/users")
	public ResponseEntity<User> updateUser(@RequestBody User user) throws CustomApiException {

		try {
			user = userService.updateUser(user);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new CustomApiException(e.getMessage());
		}
		return new ResponseEntity<>(user, HttpStatus.OK);

	}

}
