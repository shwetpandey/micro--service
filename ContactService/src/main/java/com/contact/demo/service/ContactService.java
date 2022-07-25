package com.contact.demo.service;

import java.util.List;

import com.contact.demo.model.Contact;

public interface ContactService {

	Contact createContact(Contact contact);
	
	List<Contact> getContactByUserId(Long userId);
}
