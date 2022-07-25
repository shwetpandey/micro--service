package com.user.demo.payloads;

import java.util.ArrayList;
import java.util.List;

import com.user.demo.model.Contact;

public class UserDto {
	private Long userId;
	private String name;
	private String phone;
	
	List<Contact> contacts=new ArrayList<>();

	public UserDto(Long userId, String name, String phone, List<Contact> contacts) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public UserDto(Long userId, String name, String phone) {
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
	public UserDto() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
