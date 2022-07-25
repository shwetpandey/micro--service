package com.contact.demo.controller;

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

import com.contact.demo.model.Contact;
import com.contact.demo.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class Controller {

	@Autowired
	ContactService contactService;
	
	@PostMapping("/")
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact){
		Contact contact2 = this.contactService.createContact(contact);
		return new ResponseEntity<Contact>(contact2,HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Contact>> getContactById(@PathVariable Long userId){
		List<Contact> contact = this.contactService.getContactByUserId(userId);
		return new ResponseEntity<List<Contact>>(contact,HttpStatus.OK);
		
	}
}
