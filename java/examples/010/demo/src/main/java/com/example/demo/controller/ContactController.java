package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
import com.example.demo.service.ContactService;

@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/contact")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/list") 
    public List<Contact> list(){
        return contactService.listContacts();
    }

    @GetMapping("/{id}")
    public Contact search(@PathVariable Long id){
        return contactService.searchContact(id);
    }

    @PostMapping("/save")
    public Contact save(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }

    @PutMapping("/{id}")
    public Contact modifyContact(@RequestBody Contact contact, @PathVariable Long id){
        Contact foundedContact = contactService.searchContact(id);
        foundedContact.setNombre(contact.getNombre());
        foundedContact.setApellidoUno(contact.getApellidoUno());
        foundedContact.setApellidoDos(contact.getApellidoDos());
        foundedContact.setTelefono(contact.getTelefono());

        contactService.saveContact(foundedContact);

        return contactService.saveContact(foundedContact);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        contactService.deleteContact(id);
    }

    @GetMapping("/search-by-telephone/{telefono}")  // http://localhost:8080/api/contact/search-by-telephone/665876534
    public List<Contact> encontrarPorTelefono(@PathVariable Integer telefono){
        return contactService.searchTph(telefono);
    }
}
