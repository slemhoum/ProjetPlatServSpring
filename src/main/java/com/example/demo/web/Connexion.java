package com.example.demo.web;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Repository.ChefServiceRepository;
import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.DemandeRepo;
import com.example.demo.Repository.MembreRepository;
import com.example.demo.Repository.PhaseRepository;
import com.example.demo.Repository.ProjetRepo;
import com.example.demo.Repository.ServiceRepository;
import com.example.demo.Repository.chefProjetRepository;
import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.ChefService;
import com.example.demo.entities.Client;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Phase;
import com.example.demo.entities.Projet;
import com.example.demo.entities.Service;





@Controller


public class Connexion{
	
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
	  @Autowired
		private ServiceRepository serviceRepository;
	  @Autowired
		private ClientRepository clientRepository;
	  
	  @Autowired
			private PhaseRepository phaseRepository;
	  
	  @RequestMapping(value="/login",method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("chefService",new ChefService());
		
		return "index";
		
	}
	
	  @RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(Model model,ChefService chefservice,HttpSession session,HttpServletRequest req) {
		
		//ChefService chef=chefservicerepo.login(null, null)
		//System.out.println("hello");
		  String role=req.getParameter("role");
		  String username =req.getParameter("username");
		  String password =req.getParameter("password");
		     
		  if(role.equalsIgnoreCase("chefservice")) {
		ChefService chef=chefservicerepo.findByUsernameAndPassword(chefservice.getUsername(),chefservice.getPassword());
	
	
		if(Objects.isNull(chef)) {
			String msg="invalid username/password";
			model.addAttribute("message",msg);
			
			return "index";
			
			
			
		}
		else{
			String id=chef.getId().toString();
			//model.addAttribute("id",id);
			//model.addAttribute("chef",chef);
			session.setAttribute("chef",chef);
		

			 
					 
			return "redirect:/index3";
			
		}
		  }
		    else if (role.equalsIgnoreCase("chefprojet")) {
		    	
		    	ChefProjet chefprojet= chefprojetrepo.findByUsernameAndPassword(username,password);
		    	if(Objects.isNull(chefprojet)) {
					String msg="invalid username/password";
					model.addAttribute("message",msg);
					
					return "index";
					
					
					
				}
		    	else{
					String id=chefprojet.getId().toString();
					//model.addAttribute("id",id);
					//model.addAttribute("chef",chef);
					session.setAttribute("chef",chefprojet);
				

					 
							 
					return "redirect:/index1";
					
				}

		    	
		    }
		  return "";
		    
		
		
		
		
	}
	  @RequestMapping(value="/index3",method=RequestMethod.GET)
	  
			public String statistique(Model model,HttpSession session) {
				ChefService chef=(ChefService) session.getAttribute("chef");
				
				model.addAttribute("chef",chef);
				 List<ChefProjet> chefprojets=chefprojetrepo.listeChefProjet(chef.getId());
				 int nbchefp=chefprojets.size();
					model.addAttribute("nbchefp",nbchefp);
					
			 List<Membre> membres=membre.listeMembre(chef.getId());
			 int nombre_membre=membres.size();
				model.addAttribute("nbm",nombre_membre);
				
				 List<Demande> demandes=demande.listeDemande(chef.getId());
				 int nbd=demandes.size();
				 model.addAttribute("nbd",nbd);
				 
				 List<Projet> projets=projet.listeProjet(chef.getId());
				 int nbp=projets.size();
				 model.addAttribute("nbp",nbp);
				 model.addAttribute("projets",projets);
	            
				 List<Demande> demandesAc=demande.listeDemandeAccepter(chef.getId());
				 int nbda=demandesAc.size();
				 model.addAttribute("nbda",nbda);
				 
				 List<Demande> demandesRef=demande.listeDemandeRefuser(chef.getId());
				 int nbdr=demandesRef.size();
				 model.addAttribute("nbdr",nbdr);

				 List<Demande> demandesAt=demande.listeDemandeAttente(chef.getId());
				 int nbdt=demandesAt.size();
				 model.addAttribute("nbdt",nbdt);
				
				return "index3";
				
			}
	  
	  @RequestMapping(value="/demande",method=RequestMethod.GET)
	  
		public String Demandes(Model model,HttpSession session) {
		  
		  ChefService chef=(ChefService) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
			 List<Demande> demandes=demande.listeDemande(chef.getId());
				model.addAttribute("demandes",demandes);
		  return "demande";
		  
		  
	  }
	  @RequestMapping(value="/ajoutProjet",method=RequestMethod.GET)
	  
			public String AjoutProjet(Model model,HttpSession session,Long id) {
		  
			  Demande d=demande.getDemande(id);
			  d.setStatus("accepter");
			  System.out.println(d.getStatus());
			  demande.save(d);
			  Service s=d.getService();
			  Client cl=d.getClient();
			  
			  model.addAttribute("demande",d);
			  model.addAttribute("client",cl);
			  model.addAttribute("service",s);
			  
			 
			  
			  ChefService chef=(ChefService) session.getAttribute("chef");
				
				model.addAttribute("chef",chef);
				 List<ChefProjet> chefprojets=chefprojetrepo.listeChefProjet(chef.getId());
				 model.addAttribute("projet",new Projet());
				
					model.addAttribute("chefprojets",chefprojets);
			  return "ajoutProjet";
			  
			  
		  }
	  
	  @RequestMapping(value="/addP",method=RequestMethod.POST)
	  public String AddP(Model model,Projet p,HttpSession session,HttpServletRequest req) {
		  Long ids=Long.parseLong(req.getParameter("id1"));
		  Long idc=Long.parseLong(req.getParameter("id2"));
		  Service s=serviceRepository.getService(ids);
		  Client c=clientRepository.getClient(idc);
		  p.setClientt(c);
		  p.setService1(s);
		  
		  projet.save(p);
		  
		  ChefService chef=(ChefService) session.getAttribute("chef");
		  List<Projet> projets=projet.listeProjet(chef.getId());
			model.addAttribute("projets",projets);
			
			model.addAttribute("chef",chef);
			 List<Demande> demandes=demande.listeDemande(chef.getId());
				model.addAttribute("demandes",demandes);
		  return "projet";
		  
		  
	  }
	  
	  @RequestMapping(value="/projet",method=RequestMethod.GET)
		public String projets(Model model,HttpSession session) {
		
			  ChefService chef=(ChefService) session.getAttribute("chef");
				 List<Projet> projets=projet.listeProjet(chef.getId());
					model.addAttribute("projets",projets);
				
				model.addAttribute("chef",chef);
			
			return "projet";
			
		}
	  
	  @RequestMapping(value="/detailProjet",method=RequestMethod.GET)
		public String detailProjet(Model model,HttpSession session,Long id) {
		  Projet p=projet.getProjet(id);
		  
		  ChefProjet chefprojet=p.getChefprojet();
		  System.out.println(chefprojet.getNom());
			model.addAttribute("chefprojet",chefprojet);
			
		  ChefService chef=(ChefService) session.getAttribute("chef");
		  
		  List<Membre> membres=membre.listeMembreParProjet(id);
			model.addAttribute("membres",membres);
			
			//phases
			  List<Phase> phases=phaseRepository.listePhaseProjet(id);
				model.addAttribute("phases",phases);
			
			
			model.addAttribute("chef",chef);
		
		return "detailProjet";
		
	}
	  @RequestMapping(value="/deleteProjet",method=RequestMethod.GET)
		public String deleteProjet(Model model,HttpSession session,Long id) {
		  projet.deleteById(id);
		  ChefService chef=(ChefService) session.getAttribute("chef");
			 List<Projet> projets=projet.listeProjet(chef.getId());
				model.addAttribute("projets",projets);
			
			model.addAttribute("chef",chef);
			return "projet";
		  
		  
	  }
	  @RequestMapping(value="/modifieProjet",method=RequestMethod.GET)
			public String ModifieProjet(Model model,HttpSession session,Long id) {
		  Projet p=projet.getProjet(id);
		  model.addAttribute("projet",p);
		  
			  ChefService chef=(ChefService) session.getAttribute("chef");
			  List<ChefProjet> chefprojets=chefprojetrepo.listeChefProjet(chef.getId());
					model.addAttribute("chefprojets",chefprojets);
				
				model.addAttribute("chef",chef);
				return "modifierProjet";
			  
			  
		  }
	  
	  @RequestMapping(value="/chefProjet",method=RequestMethod.GET)
			public String chefProjets(Model model,HttpSession session) {
			
				  ChefService chef=(ChefService) session.getAttribute("chef");
				  List<ChefProjet> chefprojets=chefprojetrepo.listeChefProjet(chef.getId());
						model.addAttribute("chefprojets",chefprojets);
					
					model.addAttribute("chef",chef);
				
				return "chefProjet";
				
			}
	  
	  @RequestMapping(value="/membre",method=RequestMethod.GET)
		public String membres(Model model,HttpSession session) {
		
			  ChefService chef=(ChefService) session.getAttribute("chef");
			  List<Membre> membres=membre.listeMembre(chef.getId());
					model.addAttribute("membres",membres);
				
				model.addAttribute("chef",chef);
			
			return "membre";
			
		}
	  
	  
	  @RequestMapping(value="/index1",method=RequestMethod.GET)
	  
		public String index1(Model model,HttpSession session) {
			ChefProjet chef=(ChefProjet) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
			
				
			/*
			 * List<Membre> membres=membre.listeMembre(chef.getId()); int
			 * nombre_membre=membres.size(); model.addAttribute("nbm",nombre_membre);
			 */
			
			
			 
			 List<Projet> projets=projet.listeProjetChefProjet(chef.getId());
			 int nbp=projets.size();
			 model.addAttribute("nbp",nbp);
			 model.addAttribute("projets",projets);
			 
			 List<Projet> projetComplet=projet.listeProjetComplet(chef.getId());
			 int nbpc=projetComplet.size();
			 model.addAttribute("nbpc",nbpc);
			 
			 List<Projet> projetNoComplet=projet.listeProjetNoComplet(chef.getId());
			 int nbpnc=projetNoComplet.size();
			 model.addAttribute("nbpnc",nbpnc);
			 
			 List<Client> clients=clientRepository.listeClient(chef.getId());
			 int nbclient=clients.size();
			 model.addAttribute("nbpclient",nbclient);
          
		
			
			return "chefprojet/index1";
			
		}
	  
	  @RequestMapping(value="/listAllProjet",method=RequestMethod.GET)
		public String listAllProjet(Model model,HttpSession session) {
		  
		ChefProjet chef=(ChefProjet) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
			 List<Projet> projets=projet.listeProjetChefProjet(chef.getId());
			 model.addAttribute("projets",projets);
		
			
				
			
			
			return "chefprojet/projet";
			
		}
	
	  
	  @RequestMapping(value="/detailProjet1",method=RequestMethod.GET)
			public String detailProjet1(Model model,HttpSession session,Long id) {
			  Projet p=projet.getProjet(id);
			  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
				
				model.addAttribute("chef",chef);
			
				model.addAttribute("ids",p.getService1().getId());
				model.addAttribute("id",id);
			
			  
			  List<Membre> membres=membre.listeMembreParProjet(id);
				model.addAttribute("membres",membres);
				
				//phases
				  List<Phase> phases=phaseRepository.listePhaseProjet(id);
					model.addAttribute("phases",phases);
				
				
				
			
			return "chefprojet/detailProjet";
			
		}
	  
	  
	  @RequestMapping(value="/ajouterMembre",method=RequestMethod.GET)
		public String ajouterMembre(Model model,HttpSession session,HttpServletRequest req) {
		  
		  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
			 Long idp=Long.parseLong(req.getParameter("idp"));
			 Long id=Long.parseLong(req.getParameter("id"));
		
			model.addAttribute("ids",idp);
		
		  
		  List<Membre> membres=membre.listeMembreParService(id);
			model.addAttribute("membres",membres);
			
		
			
			
			
		
		return "chefprojet/ajouterMembre";
		
	}
	  @RequestMapping(value="/addM",method=RequestMethod.GET)
			public String addP(Model model,HttpSession session,HttpServletRequest req) {
			  
			  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
				
				model.addAttribute("chef",chef);
				  Long idm=Long.parseLong(req.getParameter("membre"));
				  Long idp=Long.parseLong(req.getParameter("id"));
			
			//probleme manytomany
			
				  Projet p=projet.getProjet(idp);
				  model.addAttribute("ids",p.getService1().getId());
					model.addAttribute("id",idp);
				
				  
				  List<Membre> membres=membre.listeMembreParProjet(idp);
					model.addAttribute("membres",membres);
					
					//phases
					  List<Phase> phases=phaseRepository.listePhaseProjet(idp);
						model.addAttribute("phases",phases);
			
				
				
				
			
			return "chefprojet/detailProjet";
			
		}
	  
	  
	  @RequestMapping(value="/ajouterPhase",method=RequestMethod.GET)
		public String ajouterPhase(Model model,HttpSession session,Long id) {
		  Projet p=projet.getProjet(id);
		  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
		
		
			model.addAttribute("id",id);
		
		  
		
			
			
			
		
		return "chefprojet/ajouterPhase";
		
	}
	  @RequestMapping(value="/addPhase",method=RequestMethod.POST)
		public String addPhase(Model model,HttpSession session,Phase p,HttpServletRequest req) {
	
		  Long idp=Long.parseLong(req.getParameter("id"));
		  Projet proje=projet.getProjet(idp);
		  p.setProjet(proje);
		  phaseRepository.save(p);
		  
		  Projet pp=projet.getProjet(idp);
		  model.addAttribute("ids",pp.getService1().getId());
			model.addAttribute("id",idp);
		
		  
		  List<Membre> membres=membre.listeMembreParProjet(idp);
			model.addAttribute("membres",membres);
			
			//phases
			  List<Phase> phases=phaseRepository.listePhaseProjet(idp);
				model.addAttribute("phases",phases);
		  
		  
		  
		  
		  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
		
		
			return "chefprojet/detailProjet";
		
	}
	  
	  @RequestMapping(value="/deletePhase",method=RequestMethod.GET)
			public String deletePhase(Model model,HttpSession session,HttpServletRequest req) {
			  
			  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
				
				model.addAttribute("chef",chef);
				
				 Long idp=Long.parseLong(req.getParameter("id"));
				 Long idph=Long.parseLong(req.getParameter("idp"));
			
				 phaseRepository.deleteById(idph);
				 
				 List<Membre> membres=membre.listeMembreParProjet(idp);
					model.addAttribute("membres",membres);
					
					//phases
					  List<Phase> phases=phaseRepository.listePhaseProjet(idp);
						model.addAttribute("phases",phases);
							
			  
			
				
				
				
			
						return "chefprojet/detailProjet";
			
		}
	  @RequestMapping(value="/modifierProjet1",method=RequestMethod.GET)
		public String modifierProjet1(Model model,HttpSession session,Long id) {
		  
		  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
			
			model.addAttribute("chef",chef);
			
			  Projet proje=projet.getProjet(id);
			  
				model.addAttribute("projet",proje);
			  
			
			 
			
		  
		
			
			
			
		
					return "chefprojet/modifierProjet";
		
	}
	
	  
	  @RequestMapping(value="/updateProjet",method=RequestMethod.POST)
			public String updateProjet(Model model,HttpSession session,HttpServletRequest req) {
			  
			  ChefProjet chef=(ChefProjet) session.getAttribute("chef");
				
				model.addAttribute("chef",chef);
				
				  Long idp=Long.parseLong(req.getParameter("id"));
				  int etat=Integer.parseInt(req.getParameter("etat"));
				  Projet proje=projet.getProjet(idp);
				  proje.setEtat(etat);
				  projet.save(proje);
				  
				  List<Projet> projets=projet.listeProjetChefProjet(chef.getId());
					 model.addAttribute("projets",projets);
				
				 
				
			  
			
				
				
						return "chefprojet/projet";
			
		}
	
	  
	 
	
	
	

}
