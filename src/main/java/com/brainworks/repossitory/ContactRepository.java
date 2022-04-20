package com.brainworks.repossitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brainworks.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
	

}
