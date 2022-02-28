package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

@RequestMapping ("/api/persona")
@RestController
public class PersonaREST {
	
	@Autowired
	private PersonaService  personaService;

	@PostMapping
	private ResponseEntity<Persona> guardar(@RequestBody Persona persona){
		Persona temporal = personaService.create(persona);
		
		try {
			return ResponseEntity.created(new URI("/api/persona"+temporal.getId())).body(persona);
		}catch(Exception e){
			
		}
	}

}
