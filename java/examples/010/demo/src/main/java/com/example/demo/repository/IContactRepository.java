package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Contact;

@Repository
public interface IContactRepository extends JpaRepository<Contact, Long> {
    
    List<Contact> findByTelefono(Integer telefono);
    List<Contact> findByApellidoDos(String apellidoDos);
    List<Contact> findByApellidoUno(String apellidoUno);
    List<Contact> findByNombre(String nombre);

}
