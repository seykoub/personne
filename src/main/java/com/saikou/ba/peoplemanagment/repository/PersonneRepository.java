package com.saikou.ba.peoplemanagment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saikou.ba.peoplemanagment.entities.Personne;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long>{

	
	Personne save(Personne p);
	
	List<Personne> findAllByOrderByFirstNameAsc();
}
