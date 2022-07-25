package com.user.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.demo.model.Contact;
import com.user.demo.payloads.UserDto;
import com.user.demo.service.Service;

@RestController
@RequestMapping("/user")
public class Controller {

	
	@Autowired
	private Service userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto user = this.userService.createUser(userDto);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Long userId){
		UserDto userDto = this.userService.getUserByID(userId);
		
		List<Contact> contacts = this.restTemplate.getForObject("http://CONTACT-SERVICE/contacts/user/"+userDto.getUserId(), List.class);
		userDto.setContacts(contacts);
		return ResponseEntity.ok(userDto);
		
	}

}
