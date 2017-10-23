package com.test.springboot.web.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboot.web.jpa.entity.UserRecord;
import com.test.springboot.web.jpa.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<UserRecord> getAllUsers() {
		List<UserRecord> userRecords = new ArrayList<>();  
		userRepo.findAll().forEach(userRecords::add);
		return userRecords;
	}
	
	public UserRecord getUser(int id) {
		return userRepo.findOne(id);
	}
	
	public void addUser(UserRecord record) {
		userRepo.save(record);
	}
	
	public void delete(int id) {
		userRepo.delete(id);
	}
}
