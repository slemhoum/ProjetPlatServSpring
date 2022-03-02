package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.Membre;

public interface MembreRepository extends JpaRepository<Membre, Long> {
	
	@Query("select c from Membre c,Service s where c.serviice=s.id and s.directeur.id like :x")
	public List<Membre> listeMembre(
			@Param("x")Long id);

	@Query("select c from Membre c  JOIN c.projets p where p.id_project like :x")
	public List<Membre> listeMembreParProjet(
			@Param("x")Long id);

	
	@Query("select c from Membre c where c.serviice.id like :x")
	public List<Membre> listeMembreParService(
			@Param("x")Long id);
}
