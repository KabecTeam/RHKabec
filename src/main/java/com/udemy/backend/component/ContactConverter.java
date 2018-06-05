package com.udemy.backend.component;

import org.springframework.stereotype.Component;

import com.udemy.backend.entity.Contact;
import com.udemy.backend.model.ContactModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactConverter.
 */
@Component("contactConverter")
public class ContactConverter {

	/**
	 * Convert contact model 2 contact.
	 *
	 * @param contactModel the contact model
	 * @return the contact
	 */
	public Contact convertContactModel2Contact(ContactModel contactModel){
       Contact contact=new Contact();
       contact.setCity(contactModel.getCity());
       contact.setFirstname(contactModel.getFirstname());
       contact.setLastname(contactModel.getLastname());
       contact.setTelephone(contactModel.getTelephone());
       contact.setMail(contactModel.getMail());
       contact.setIdcontact(contactModel.getIdcontact());
		return contact;
	}
	
	/**
	 * Convert contact 2 contact model.
	 *
	 * @param contact the contact
	 * @return the contact model
	 */
	public ContactModel convertContact2ContactModel(Contact contact){
		ContactModel contactModel=new ContactModel();
		contactModel.setCity(contact.getCity());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setIdcontact(contact.getIdcontact());
		contactModel.setMail(contact.getMail());
		contactModel.setTelephone(contact.getTelephone());
		return contactModel;
	}
	
}
