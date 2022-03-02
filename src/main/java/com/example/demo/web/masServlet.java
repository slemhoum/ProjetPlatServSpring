package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Repository.ChefServiceRepository;
import com.example.demo.Repository.DemandeRepo;
import com.example.demo.Repository.MembreRepository;
import com.example.demo.Repository.ProjetRepo;
import com.example.demo.Repository.chefProjetRepository;
import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.ChefService;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Projet;

@Controller
public class masServlet {
	
	
	 @Autowired
	private ChefServiceRepository chefservicerepo;
	 @Autowired
	private chefProjetRepository chefprojetrepo;
	
	 @Autowired
	private MembreRepository membre;
	  @Autowired
		private DemandeRepo demande;
	  @Autowired
	private ProjetRepo projet;
	  
	/*
	 * @RequestMapping(value="/index3",method=RequestMethod.GET)
	 * 
	 * public String statistique(Model model) { ChefService chef=(ChefService)
	 * model.getAttribute("chef");
	 * 
	 * model.addAttribute("chef",chef); List<ChefProjet>
	 * chefprojets=chefprojetrepo.listeChefProjet(chef.getId()); int
	 * nbchefp=chefprojets.size(); model.addAttribute("nbchefp",nbchefp);
	 * 
	 * List<Membre> membres=membre.listeMembre(chef.getId()); int
	 * nombre_membre=membres.size(); model.addAttribute("nbm",nombre_membre);
	 * 
	 * List<Demande> demandes=demande.listeDemande(chef.getId()); int
	 * nbd=demandes.size(); model.addAttribute("nbd",nbd);
	 * 
	 * List<Projet> projets=projet.listeProjet(chef.getId()); int
	 * nbp=projets.size(); model.addAttribute("nbp",nbp);
	 * model.addAttribute("projets",projets);
	 * 
	 * List<Demande> demandesAc=demande.listeDemandeAccepter(chef.getId()); int
	 * nbda=demandesAc.size(); model.addAttribute("nbda",nbda);
	 * 
	 * List<Demande> demandesRef=demande.listeDemandeRefuser(chef.getId()); int
	 * nbdr=demandesRef.size(); model.addAttribute("nbdr",nbdr);
	 * 
	 * List<Demande> demandesAt=demande.listeDemandeAttente(chef.getId()); int
	 * nbdt=demandesAt.size(); model.addAttribute("nbdt",nbdt);
	 * 
	 * return "index3";
	 * 
	 * }
	 */

}
