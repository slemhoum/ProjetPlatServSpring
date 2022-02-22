package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="service")
public class Service implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=30)
	private String nom;
	@ManyToOne
	@JoinColumn(name="id_chef")
	private ChefService chefService;
	@ManyToOne
	@JoinColumn(name="id_directeur")
	private Directeur directeur;
	@OneToMany(mappedBy="servicee",fetch=FetchType.LAZY)
	private Collection<ChefProjet> chefProjet;
	@OneToMany(mappedBy="service",fetch=FetchType.LAZY)
	private Collection<Demande> demandes;
	@OneToMany(mappedBy="service1",fetch=FetchType.LAZY)
	private Collection<Projet> projets;
	@OneToMany(mappedBy="serviice",fetch=FetchType.LAZY)
	private Collection<Membre> membre;

}
