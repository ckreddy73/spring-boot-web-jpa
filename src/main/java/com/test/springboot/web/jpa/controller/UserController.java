package com.test.springboot.web.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.web.jpa.entity.UserRecord;
import com.test.springboot.web.jpa.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	//@RequestMapping("/getUsersREST")
	public List<UserRecord> getAllUsers() {
		return userService.getAllUsers();
	}
	
	//@RequestMapping(value="/add-user", method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord userRecord) {
		userService.addUser(userRecord);
	}
	
	//Â@RequestMapping(value="/user/{id}")
	public UserRecord getUser(@PathVariable int id) {
		return userService.getUser(id);
	}

}
