package com.deloitte.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.deloitte.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
