package com.danisoft.contactmanager.repository;

import com.danisoft.contactmanager.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
