package com.udemy.backend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.backend.component.ContactConverter;
import com.udemy.backend.entity.Contact;
import com.udemy.backend.model.ContactModel;
import com.udemy.backend.repository.ContactRepository;
import com.udemy.backend.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService{

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository; 
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;
	
	@Override
	public ContactModel addContact(ContactModel contactModel) {
		// TODO Auto-generated method stub
	  Contact contact =contactRepository.save(contactConverter.convertContactModel2Contact(contactModel));
		return contactConverter.convertContact2ContactModel(contact);
	
	}

	@Override
	public List<ContactModel> listAllContacts() {
		// TODO Auto-generated method stub
		List<Contact> contacts=contactRepository.findAll();
		List<ContactModel> contactsModel=new ArrayList<ContactModel>();
		for(Contact contact: contacts){
			contactsModel.add(contactConverter.convertContact2ContactModel(contact));	
		}
		return contactsModel;
	}

	@Override
	public Contact findContactById(int id) {
		contactRepository.findOne(id);
		return contactRepository.findOne(id);
	}

	public ContactModel findContactByIdModel(int id){
		return contactConverter.convertContact2ContactModel(findContactById(id)) ;
	}
	
	@Override
	public void removeContact(int id) {
		Contact contact=findContactById(id);
		if(null!=contact){
			contactRepository.delete(contact);	
		}
	}
}