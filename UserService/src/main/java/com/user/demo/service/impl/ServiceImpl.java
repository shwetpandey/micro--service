package com.user.demo.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.user.demo.model.User;
import com.user.demo.payloads.UserDto;
import com.user.demo.repository.UserRepo;
import com.user.demo.service.Service;

@org.springframework.stereotype.Service
class ServiceImpl implements Service {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto getUserByID(Long userId) {
		User user = this.userRepo.findById(userId).orElse(null);
		return this.modelMapper.map(user, UserDto.class);
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
		this.userRepo.save(user);
		return this.modelMapper.map(user, UserDto.class);
				
	}

}
