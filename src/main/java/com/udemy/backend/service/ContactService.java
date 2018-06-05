package com.udemy.backend.service;

import java.util.List;

import com.udemy.backend.entity.Contact;
import com.udemy.backend.model.ContactModel;

public interface ContactService {

	public abstract ContactModel addContact(ContactModel contactModel); 
	
	public abstract List<ContactModel> listAllContacts();
	
	public abstract Contact findContactById(int id);

	public abstract void removeContact(int id);

	public abstract ContactModel findContactByIdModel(int id);
	
}
