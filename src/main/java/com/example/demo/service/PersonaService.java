package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;




@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	
	//Metodos 
	public Persona create(Persona persona) {
		return personaRepository.save(persona);
	}
	
	public List<Persona>  getAllPersonas (){	
		return personaRepository.findAll();
	}
	
	public void delete (Persona persona){
		 personaRepository.delete(persona);
	}
	
	public Optional<Persona> findById (Long Id) {
		return personaRepository.findById(Id);
	}
	
		

}
