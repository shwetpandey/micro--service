package com.contact.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.demo.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Long> {

	List<Contact>findByuserId(Long userId);

}
