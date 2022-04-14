package com.assignment.MVC.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.MVC.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
