package com.danisoft.contactmanager.controller;

import com.danisoft.contactmanager.model.Contact;
import com.danisoft.contactmanager.service.ContactService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

        private final ContactService contactService;

        public ContactController(ContactService contactService) {
            this.contactService = contactService;
        }

//    @GetMapping("contacts/new")
//    public String showCreateContactForm(Model model) {
//        model.addAttribute("contact", new Contact());
//        return "create_contact";
//    }

    @PostMapping("/new")
    public String createContact(@ModelAttribute("contact") Contact contact) {
        // Process the form submission and save the contact
        contactService.createContact(contact);
        return "redirect:/contacts";
    }


    @GetMapping("/contacts")
    public String showContactList(Model model) {
        List<Contact> contacts = contactService.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "contact_list";
    }


    @GetMapping
        public List<Contact> getAllContacts() {
            return contactService.getAllContacts();
        }

        @GetMapping("/{id}")
        public Contact getContactById(@PathVariable Long id) {
            return contactService.getContactById(id);
        }

//        @PostMapping
//        public Contact createContact(@RequestBody Contact contact) {
//            return contactService.createContact(contact);
//        }

        @PutMapping("/{id}")
        public Contact updateContact(@PathVariable Long id, @RequestBody Contact contact) {
            return contactService.updateContact(id, contact);
        }

        @DeleteMapping("/{id}")
        public void deleteContact(@PathVariable Long id) {
            contactService.deleteContact(id);
        }
    }
