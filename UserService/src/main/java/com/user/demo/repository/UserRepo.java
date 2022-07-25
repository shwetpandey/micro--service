package com.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.demo.model.User;
import com.user.demo.payloads.UserDto;

public interface UserRepo extends JpaRepository<User, Long>{

}
