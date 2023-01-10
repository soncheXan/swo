package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact;
import com.example.demo.repository.IContactRepository;

@Service
public class ContactService {
    
    @Autowired
    private IContactRepository contactRepository;

    public List<Contact> listContacts(){
        return contactRepository.findAll();
    }

    public Contact searchContact(Long id){
        return contactRepository.findById(id).orElse(null);
    }

    public Contact saveContact(Contact contact){
        return contactRepository.save(contact);
    }

    public void deleteContact(Long id){
        contactRepository.deleteById(id);
    }

    public List<Contact> searchTph(Integer telefono){
        return contactRepository.findByTelefono(telefono);
    }
}
