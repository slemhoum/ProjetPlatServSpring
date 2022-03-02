package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.ChefService;



public interface chefProjetRepository extends JpaRepository<ChefProjet, Long> {
	
	@Query("select c from ChefProjet c,Service s where c.servicee=s.id and s.directeur.id like :x")
	public List<ChefProjet> listeChefProjet(
			@Param("x")Long id);
	ChefProjet findByUsernameAndPassword(String user,String pass);

}
