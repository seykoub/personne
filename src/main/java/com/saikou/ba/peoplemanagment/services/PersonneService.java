package com.saikou.ba.peoplemanagment.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saikou.ba.peoplemanagment.entities.Personne;
import com.saikou.ba.peoplemanagment.repository.PersonneRepository;

@Service
public class PersonneService {

	private PersonneRepository personneRepository;

	@Autowired
	public PersonneService(PersonneRepository personneRepository) {
		super();
		this.personneRepository = personneRepository;
	}
	
	public Personne save(String firstName, String lastName, Date birthDate) throws Exception {
		
		if(birthDate.getYear()>150) {
			throw new Exception("years are greater than 150");
		}
		
		Personne personne = new Personne(firstName, lastName, birthDate);
		
		return personneRepository.save(personne);
	}
	
	public List<Personne> getAllPeronne() {
		return personneRepository.findAllByOrderByFirstNameAsc();
	}
	
	
	
}
