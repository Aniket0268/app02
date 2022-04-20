package com.brainworks.service;

import java.util.List;

import com.brainworks.entity.Contact;

public interface ContactService {
 String upsert (Contact contact);
  List<Contact> getAllContact();
  Contact getContact(int cid);
  String deleteContact(int cid);
}
