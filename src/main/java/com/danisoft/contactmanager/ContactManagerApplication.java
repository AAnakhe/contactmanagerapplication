package com.danisoft.contactmanager;

import com.danisoft.contactmanager.model.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactManagerApplication.class, args);

//		Contact contact = new Contact();
//		contact.setName("Tunde Daniels");
//		contact.setEmail("myemail@yahoo.com");
//		contact.setPhoneNumber("07038176020");
//		contact.setAddress("Centra Area Abuja");
//
//		System.out.println("Contact Details: " + contact);
	}

}
