package com.saikou.ba.peoplemanagment.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.saikou.ba.peoplemanagment.entities.Personne;
import com.saikou.ba.peoplemanagment.services.PersonneService;

@Controller
public class PersonneController {

	@Autowired
	private PersonneService personneService;
	
	
	@GetMapping("/allPeople")
	public List<Personne> getAllPersonne() {
		return personneService.getAllPeronne();
	}
	
	
	public void addPersonne(String firstName,String lastName, Date birthDate) {
		
	}
}
