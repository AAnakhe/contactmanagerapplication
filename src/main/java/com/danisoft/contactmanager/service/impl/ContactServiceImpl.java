package com.danisoft.contactmanager.service.impl;

import com.danisoft.contactmanager.model.Contact;
import com.danisoft.contactmanager.repository.ContactRepository;
import com.danisoft.contactmanager.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContactServiceImpl implements ContactService {

        private final ContactRepository contactRepository;

        public ContactServiceImpl(ContactRepository contactRepository) {
            this.contactRepository = contactRepository;
        }

        @Override
        public List<Contact> getAllContacts() {
            return contactRepository.findAll();
        }

        @Override
        public Contact getContactById(Long id) {
            return contactRepository.findById(id)
                    .orElseThrow(() -> new NoSuchElementException("Contact not found with id: " + id));
        }

        @Override
        public Contact createContact(Contact contact) {
            return contactRepository.save(contact);
        }

        @Override
        public Contact updateContact(Long id, Contact updatedContact) {
            Contact existingContact = getContactById(id);
            existingContact.setName(updatedContact.getName());
            existingContact.setEmail(updatedContact.getEmail());
            existingContact.setPhoneNumber(updatedContact.getPhoneNumber());
            existingContact.setAddress(updatedContact.getAddress());
            return contactRepository.save(existingContact);
        }

        @Override
        public void deleteContact(Long id) {
            Contact contact = getContactById(id);
            contactRepository.delete(contact);
        }
    }
