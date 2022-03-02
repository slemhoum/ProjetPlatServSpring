package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.ChefService;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Projet;
import com.example.demo.entities.Service;

public interface ProjetRepo extends JpaRepository<Projet, Long> {
	
	@Query("select c from Projet c,Service s where c.service1=s.id and s.directeur.id like :x")
	public List<Projet> listeProjet(
			@Param("x")Long id);
	
	
	@Query("select c from Projet c where c.id_project like :x")
	public Projet getProjet(
			@Param("x")Long id
			);
	
	@Query("select c from Projet c where c.chefprojet.id like :x")
	public List<Projet> listeProjetChefProjet(
			@Param("x")Long id);
	
	@Query("select c from Projet c where c.chefprojet.id like :x and c.etat='100'")
	public List<Projet> listeProjetComplet(
			@Param("x")Long id);
	
	@Query("select c from Projet c where c.chefprojet.id like :x and c.etat!='100'")
	public List<Projet> listeProjetNoComplet(
			@Param("x")Long id);
	

	

}
