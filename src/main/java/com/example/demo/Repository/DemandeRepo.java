package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Demande;
import com.example.demo.entities.Membre;

public interface DemandeRepo extends JpaRepository<Demande, Long>{
	
	@Query("select c from Demande c,Service s where c.service=s.id and s.directeur.id like :x")
	public List<Demande> listeDemande(
			@Param("x")Long id);

	@Query("select c from Demande c,Service s where c.service=s.id and s.directeur.id like :x and c.status='accepter'")
	public List<Demande> listeDemandeAccepter(
			@Param("x")Long id
			);
	@Query("select c from Demande c,Service s where c.service=s.id and s.directeur.id like :x and c.status='refuser'")
	public List<Demande> listeDemandeRefuser(
			@Param("x")Long id
			);
	@Query("select c from Demande c,Service s where c.service=s.id and s.directeur.id like :x and c.status='en attente'")
	public List<Demande> listeDemandeAttente(
			@Param("x")Long id
			);
	

	
	@Query("select c from Demande c where c.id like :x")
	public Demande getDemande(
			@Param("x")Long id
			);
	

}
