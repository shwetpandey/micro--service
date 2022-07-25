package com.user.demo.service;

import com.user.demo.payloads.UserDto;

public interface Service {


	UserDto getUserByID(Long userId);
	
	UserDto createUser(UserDto userDto);
}
