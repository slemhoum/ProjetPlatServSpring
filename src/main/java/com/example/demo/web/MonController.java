package com.example.demo.web;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Repository.Mey.AccReposiotory;
import com.example.demo.Repository.Mey.ChefProjetReposiotory;
import com.example.demo.Repository.Mey.ChefServiceReposiotory;
import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.Mey.DemandeReposiotory;
import com.example.demo.Repository.Mey.DirecteurReposiotory;
import com.example.demo.Repository.Mey.MemberReposiotory;
import com.example.demo.Repository.Mey.ProjetReposiotory;
import com.example.demo.Repository.Mey.ServiceReposiotory;
import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.ChefService;
import com.example.demo.entities.Client;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Directeur;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Projet;
import com.example.demo.entities.Service;

@Controller
public class MonController {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private DemandeReposiotory demandeReposiotory;
	@Autowired
	private ServiceReposiotory serviceReposiotory;
	@Autowired
	private AccReposiotory accReposiotory;
	@Autowired
	private ChefServiceReposiotory chefServiceReposiotory;
	@Autowired
	private MemberReposiotory memberReposiotory;
	@Autowired
	private ChefProjetReposiotory chefProjetReposiotory;
	@Autowired
	private DirecteurReposiotory directeurReposiotory;
	@Autowired
	private ProjetReposiotory projetReposiotory;
//	Acceuiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
	@RequestMapping(value="/index")
	public String index(Model model) {
    List<Demande> demandes=demandeReposiotory.findAll();
    long d=demandeReposiotory.count();
    String att="refuse";
    List<Demande>drf=demandeReposiotory.dstatus(att);
    List<Demande>dac=demandeReposiotory.dstatus("accepter");
    List<Demande>dat=demandeReposiotory.dstatus("En attent");
    int da=dat.size();
    int dr=drf.size();
    int dacc=dac.size();
    model.addAttribute("listdemandes",dat);
    model.addAttribute("d",d);
    model.addAttribute("da",da);
    model.addAttribute("dr",dr);
    model.addAttribute("dacc",dacc);
		return "mey/accDach";
		
	}
	
	@RequestMapping(value="/Client")
	public String client(Model model) {
    List<Client> clients=clientRepository.findAll();
    model.addAttribute("listclients",clients);
    model.addAttribute("client",new Client());
	return "mey/client";
		
	}
	@RequestMapping(value="/saveC" ,method=RequestMethod.POST)
	public String saveC(Model model,Client client) {
    clientRepository.save(client);
    return "redirect:/Client";
		
	}
	@RequestMapping(value="/editC",method=RequestMethod.GET)
	public String editC(Model model,Long id) {
  Client c=clientRepository.getById(id);
    model.addAttribute("client",c);
			return "mey/Editclient";
	}
	@RequestMapping(value="/EditC",method=RequestMethod.GET)
	public String EditC(Model model,Long id) {
    Client c=clientRepository.getById(id);
    model.addAttribute("client",c);
			return "redirect:/Client";
	}
	@RequestMapping(value="/deleteC",method = RequestMethod.GET)
	public String deleteC(Long id) {
		clientRepository.deleteById(id);
			return "redirect:/Client";
			
		}
	
//	demandeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee	
		
	@RequestMapping(value="/Demande")
	public String demande(Model model) {
    List<Demande> demandes=demandeReposiotory.findAll();
    List<Client>clients=clientRepository.findAll();
    List<Service>services=serviceReposiotory.findAll();
    List<Accueilleur>accs=accReposiotory.findAll();
    model.addAttribute("cl",clients);
    model.addAttribute("acc",accs);
    model.addAttribute("sr",services);
    model.addAttribute("listdemandes",demandes);
    model.addAttribute("demande",new Demande());
	return "mey/Demande";
		
	}	
	@RequestMapping(value="/saveD" ,method=RequestMethod.POST)
	public String saveD(Model model,Demande demande) {
		demande.setDate_creation(new Date());
		demande.setStatus("En attent");
    demandeReposiotory.save(demande);
    return "redirect:/Demande";
		
	}
	@RequestMapping(value="/deleteD",method = RequestMethod.GET)
	public String deleteD(Long id) {
		demandeReposiotory.deleteById(id);
			return "redirect:/Demande";
			
		}
	@RequestMapping(value="/editD",method=RequestMethod.GET)
	public String editD(Model model,Long id) {
    Demande d=demandeReposiotory.getById(id);
    List<Client>clients=clientRepository.findAll();
    List<Service>services=serviceReposiotory.findAll();
    List<Accueilleur>accs=accReposiotory.findAll();
    model.addAttribute("cl",clients);
    model.addAttribute("acc",accs);
    model.addAttribute("sr",services);
    model.addAttribute("demande",d);
			return "mey/Editdemande";
	}
	@RequestMapping(value="/EditD",method=RequestMethod.POST)
	public String EditD(Model model,Demande demande) {
		demande.setDate_creation(new Date());
		demande.setStatus("En attent");
    demandeReposiotory.save(demande);
    return "redirect:/Demande";
	}
//	Dircteurrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
	@RequestMapping(value="/dicD")
	public String dicD(Model model) {
		Long NBS=serviceReposiotory.count();
		Long NBP=projetReposiotory.count();
		List<Projet>p=projetReposiotory.findAll();
		Long NBC=clientRepository.count();
		Long NBM=memberReposiotory.count();
		model.addAttribute("NBS",NBS);
	    model.addAttribute("NBP",NBP);
	    model.addAttribute("NBC",NBC);
	    model.addAttribute("NBM",NBM);
	    model.addAttribute("p",p);
	return "mey/home";
		
	}
	@RequestMapping(value="/accA")
	public String accA(Model model) {
		List<Accueilleur>Acc=accReposiotory.findAll();
	    model.addAttribute("Acc",Acc);
	    model.addAttribute("client",new Accueilleur());
	return "mey/accueilleur";
		
	}
	@RequestMapping(value="/saveA" ,method=RequestMethod.POST)
	public String saveA(Model model,Accueilleur client) {
    accReposiotory.save(client);
    return "redirect:/accA";
		
	}
	@RequestMapping(value="/deleteA",method = RequestMethod.GET)
	public String deleteA(Long id) {
		accReposiotory.deleteById(id);
			return "redirect:/accA";	
		}
	@RequestMapping(value="/editA",method=RequestMethod.GET)
	public String editA(Model model,Long id) {
  Accueilleur c=accReposiotory.getById(id);
    model.addAttribute("client",c);
			return "mey/modifierAccueilleur";
	}
	@RequestMapping(value="/chS")
	public String chS(Model model) {
    List<ChefService> clients=chefServiceReposiotory.findAll();
    model.addAttribute("Acc",clients);
    model.addAttribute("client",new ChefService());
	return "mey/chefService";
		
	}
	@RequestMapping(value="/saveChefS" ,method=RequestMethod.POST)
	public String saveChefS(Model model,ChefService client) {
    chefServiceReposiotory.save(client);
    return "redirect:/chS";
		
	}
	@RequestMapping(value="/deletechS",method = RequestMethod.GET)
	public String deleteChefS(Long id) {
		chefServiceReposiotory.deleteById(id);
			return "redirect:/chS";	
		}
	@RequestMapping(value="/editchfS",method=RequestMethod.GET)
	public String editChfS(Model model,Long id) {
  ChefService c=chefServiceReposiotory.getById(id);
    model.addAttribute("client",c);
			return "mey/modifierchef";
	}
	@RequestMapping(value="/ServiceA")
	public String ServiceA(Model model) {
    List<Service> clients=serviceReposiotory.findAll();
    List<ChefService>chS=chefServiceReposiotory.findAll();
    model.addAttribute("chS",chS);
    model.addAttribute("listservices",clients);
    model.addAttribute("client",new Client());
	return "mey/service";
		
	}
	@RequestMapping(value="/saveS" ,method=RequestMethod.POST)
	public String saveS(Model model,Service service) {
		 Directeur d=directeurReposiotory.getById((long) 1);
		service.setDirecteur(d);
       serviceReposiotory.save(service);
    return "redirect:/ServiceA";
		
	}
	@RequestMapping(value="/deleteS",method = RequestMethod.GET)
	public String deleteS(Long id) {
		serviceReposiotory.deleteById(id);
			return "redirect:/ServiceA";	
		}
	@RequestMapping(value="/editS",method=RequestMethod.GET)
	public String editS(Model model,Long id) {
  Service c=serviceReposiotory.getById(id);
  List<ChefService>chS=chefServiceReposiotory.findAll();
  model.addAttribute("chS",chS);
   model.addAttribute("client",c);
			return "mey/Editservice";
	}
	@RequestMapping(value="/DetailS",method=RequestMethod.GET)
	public String DetailS(Model model,Long id) {
    Service c=serviceReposiotory.getById(id);
    List<Projet>p=projetReposiotory.projetParS(c);
    List<ChefProjet>chefp=chefProjetReposiotory.ChefProjetParS(c);
    List<Membre>member=memberReposiotory.MembreParS(c);
    List<ChefService>chS=chefServiceReposiotory.findAll();
    model.addAttribute("chefp",chefp);
    model.addAttribute("chS",chS);
    model.addAttribute("member",member);
    model.addAttribute("listclients",p);
    model.addAttribute("client",c);
			return "mey/Detail";
	}
	@RequestMapping(value="/projet")
	public String projetA(Model model) {
    List<Projet> clients=projetReposiotory.findAll();
    model.addAttribute("listclients",clients);
    
	return "mey/projet";
		
	}
//	Adminnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
	@RequestMapping(value="/AdminD")
	public String dicDA(Model model) {
		Long NBS=serviceReposiotory.count();
		Long NBP=projetReposiotory.count();
		List<Projet>p=projetReposiotory.findAll();
		Long NBC=clientRepository.count();
		Long NBM=memberReposiotory.count();
		model.addAttribute("NBS",NBS);
	    model.addAttribute("NBP",NBP);
	    model.addAttribute("NBC",NBC);
	    model.addAttribute("NBM",NBM);
	    model.addAttribute("p",p);
	return "mey/home2";
		
	}

	@RequestMapping(value="/accAA")
	public String accAA(Model model) {
		List<Accueilleur>Acc=accReposiotory.findAll();
	    model.addAttribute("Acc",Acc);
	    model.addAttribute("client",new Accueilleur());
	return "mey/accueilleur2";
		
	}
	@RequestMapping(value="/saveAA" ,method=RequestMethod.POST)
	public String saveAA(Model model,Accueilleur client) {
    accReposiotory.save(client);
    return "redirect:/accAA";
		
	}
	@RequestMapping(value="/deleteAA",method = RequestMethod.GET)
	public String deleteAA(Long id) {
		accReposiotory.deleteById(id);
			return "redirect:/accAA";	
		}
	@RequestMapping(value="/editAA",method=RequestMethod.GET)
	public String editAA(Model model,Long id) {
  Accueilleur c=accReposiotory.getById(id);
    model.addAttribute("client",c);
			return "mey/modifierAccueilleur2";
	}
	@RequestMapping(value="/dic")
	public String dic(Model model) {
    List<Directeur> clients=directeurReposiotory.findAll();
    model.addAttribute("Acc",clients);
    model.addAttribute("client",new Directeur());
	return "mey/Directeur";
		
	}
	@RequestMapping(value="/saveDir" ,method=RequestMethod.POST)
	public String saveDir(Model model,Directeur client) {
    directeurReposiotory.save(client);
    return "redirect:/dic";
		
	}
	@RequestMapping(value="/deleteDir",method = RequestMethod.GET)
	public String deleteDir(Long id) {
		directeurReposiotory.deleteById(id);
			return "redirect:/dic";	
		}
	@RequestMapping(value="/editDir",method=RequestMethod.GET)
	public String editDir(Model model,Long id) {
 Directeur c=directeurReposiotory.getById(id);
    model.addAttribute("client",c);
			return "mey/modifierDir";
	}
	@RequestMapping(value="/chSA")
	public String chSA(Model model) {
    List<ChefService> clients=chefServiceReposiotory.findAll();
    model.addAttribute("Acc",clients);
    model.addAttribute("client",new ChefService());
	return "mey/chefService2";
		
	}
	@RequestMapping(value="/saveChefSA" ,method=RequestMethod.POST)
	public String saveChefSA(Model model,ChefService client) {
    chefServiceReposiotory.save(client);
    return "redirect:/chSA";
		
	}
	@RequestMapping(value="/deletechSA",method = RequestMethod.GET)
	public String deleteChefSA(Long id) {
		chefServiceReposiotory.deleteById(id);
			return "redirect:/chSA";	
		}
	@RequestMapping(value="/editchfSA",method=RequestMethod.GET)
	public String editChfSA(Model model,Long id) {
  ChefService c=chefServiceReposiotory.getById(id);
    model.addAttribute("client",c);
			return "mey/modifierchef2";
	}
	@RequestMapping(value="/ServiceAA")
	public String ServiceAA(Model model) {
    List<Service> clients=serviceReposiotory.findAll();
    List<ChefService>chS=chefServiceReposiotory.findAll();
    model.addAttribute("chS",chS);
    model.addAttribute("listservices",clients);
    model.addAttribute("client",new Client());
	return "mey/service2";
		
	}
	@RequestMapping(value="/saveSA" ,method=RequestMethod.POST)
	public String saveSA(Model model,Service service) {
		 Directeur d=directeurReposiotory.getById((long) 1);
		service.setDirecteur(d);
       serviceReposiotory.save(service);
    return "redirect:/ServiceAA";
		
	}
	@RequestMapping(value="/deleteSA",method = RequestMethod.GET)
	public String deleteSA(Long id) {
		serviceReposiotory.deleteById(id);
			return "redirect:/ServiceAA";	
		}
	@RequestMapping(value="/editSAA",method=RequestMethod.GET)
	public String editSA(Model model,Long id) {
  Service c=serviceReposiotory.getById(id);
  List<ChefService>chS=chefServiceReposiotory.findAll();
  model.addAttribute("chS",chS);
   model.addAttribute("client",c);
			return "mey/Editservice";
	}
	@RequestMapping(value="/DetailSA",method=RequestMethod.GET)
	public String DetailSA(Model model,Long id) {
    Service c=serviceReposiotory.getById(id);
    List<Projet>p=projetReposiotory.projetParS(c);
    List<ChefProjet>chefp=chefProjetReposiotory.ChefProjetParS(c);
    List<Membre>member=memberReposiotory.MembreParS(c);
    List<ChefService>chS=chefServiceReposiotory.findAll();
    model.addAttribute("chefp",chefp);
    model.addAttribute("chS",chS);
    model.addAttribute("member",member);
    model.addAttribute("listclients",p);
    model.addAttribute("client",c);
			return "mey/Detail2";
	}
	@RequestMapping(value="/projetA")
	public String projetAA(Model model) {
    List<Projet> clients=projetReposiotory.findAll();
    model.addAttribute("listclients",clients);
    
	return "mey/projet2";
		
	}
}
