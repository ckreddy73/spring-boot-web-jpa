package com.test.springboot.web.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.test.springboot.web.jpa.entity.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, Integer> {

}

