package com.saikou.ba.peoplemanagment.controllers;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.saikou.ba.peoplemanagment.entities.Personne;
import com.saikou.ba.peoplemanagment.services.PersonneService;

@Controller
public class PersonneController {

	@Autowired
	private PersonneService personneService;
	
	
	@GetMapping("/allPeople")
	public ResponseEntity<List<Personne>> getAllPersonne() {
		return  new ResponseEntity<>( personneService.getAllPeronne(), HttpStatus.OK);
	}
	
	@PostMapping
	public void addPersonne(String firstName,String lastName, Date birthDate) {
		// todo: 
	}
}
