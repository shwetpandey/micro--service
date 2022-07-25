package com.contact.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.demo.model.Contact;
import com.contact.demo.repository.ContactRepo;

@Service
public class ServiceImpl implements ContactService{

	@Autowired
	ContactRepo contactRepo;
	
	@Override
	public Contact createContact(Contact contact) {
		Contact ct = this.contactRepo.save(contact);
		return ct;
	}

	@Override
	public List<Contact> getContactByUserId(Long userId) {
		List<Contact> contacts = this.contactRepo.findByuserId(userId);
		return contacts;
	}



}
