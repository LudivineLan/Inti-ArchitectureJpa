package com.infotel.presentation;

import java.util.ArrayList;
import java.util.List;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.service.IService;
import com.infotel.service.ServiceImpl;

public class Lanceur {
	/**
	 * Classe de demarrage de l'application
	 * @param args
	 */

	public static void main(String[] args) {
		
		IService service = new ServiceImpl();
		
		//AJOUTER une Personne
//		Personne p = new Personne();
//		p.setNom("Durand");
//		p.setPrenom("Julie");
//		p.setAge(25);
//		service.ajouterPersonne(p);
		
//		Client c = new Client();
//		c.setNom("Marron");
//		c.setPrenom("Thomas");
//		c.setAge(27);
//		c.setNumeroAdherent(4528);
//		service.ajouterPersonne(c);
//		
//		Employe e = new Employe();
//		e.setNom("Smith");
//		e.setPrenom("Samantha");
//		e.setAge(23);
//		e.setSalaire(2500);
//		service.ajouterPersonne(e);
//		
//		Employe e1 = new Employe();
//		e1.setNom("Poire");
//		e1.setPrenom("Lucie");
//		e1.setAge(43);
//		e1.setSalaire(1500);
//		service.ajouterPersonne(e1);
		
//		//Supprimer une personne
//		Personne p1 = new Personne();
//		p1 = service.getPersonne(5);
//		service.supprimerPersonne(p1);
		
//		//Mettre à jour une personne
//		Personne p3 = new Personne();
//		p3 = service.affichagePersonne(9);
//		p3.setAge(26);
//		p3.setNom("Ernant");
//		service.modifierPersonne(p3);
		
		//Recuperer une personne
//		Personne p4 = new Personne();
//		p4 = service.affichagePersonne(9);
//		service.affichagePersonne(9);
//		System.out.println(p4);
		
		//Lister
//		for (Personne p5 :service.findAllPErsonne()) {
//		System.out.println(p5);
//		}
		
		//rechercher une personnepar mot clé
//		for (Personne p6: service.rechercherParMC("m")) {
//			System.out.println(p6);
//		}
		
//		Adresse a = new Adresse();
//		a.setNumRue("8");
//		a.setNomRue("rue du Repos");
//		a.setCp("75014");
//		a.setVille("Paris");
//		service.ajouterAdresse(a);		
		
//		Adresse a1 = new Adresse();
//		a1.setNumRue("15");
//		a1.setNomRue("rue du Repos");
//		a1.setCp("75015");
//		a1.setVille("Paris");
//		service.ajouterAdresse(a1);	
//		
//		Adresse a2 = new Adresse();
//		a2.setNumRue("78");
//		a2.setNomRue("rue du la Boulangerie");
//		a2.setCp("75020");
//		a2.setVille("Paris");
//		service.ajouterAdresse(a2);	
//		
//		//Supprimer une adresse
//		Adresse a3 = new Adresse();
//		a3 = service.getAdresse(3);
//		service.supprimerAdresse(a3);
//		
//		//Mettre à jour une adresse
//		Adresse a4 = new Adresse();
//		a4 = service.affichageAdresse(2);
//		a4.setNumRue("8");
//		a4.setNomRue("rue de la Route");
//		a4.setVille("Montmagny");
//		a4.setCp("93");
//		service.modifierAdresse(a4);
		
//		//Recuperer une adresse
//		Adresse a5 = new Adresse();
//		a5 = service.affichageAdresse(7);
//		service.affichageAdresse(9);
//		System.out.println(a5);
//		
//		//Lister
//		for (Adresse a6 :service.findAllAdresse()) {
//		System.out.println(a6);
//		}
		
//		//rechercher une personnepar mot clé
//		for (Adresse a7: service.rechercherAdresseParMC("ri")) {
//			System.out.println(a7);
//		}
//		
//		Connexion c = new Connexion();
//		c.setLogin("JUJU");
//		c.setMdp("mdp");
//		service.ajouterConnexion(c);
//		
//		Connexion c1 = new Connexion();
//		c1.setLogin("LOLO");
//		c1.setMdp("mdpasse");
//		service.ajouterConnexion(c1);
//		
//		Connexion c2 = new Connexion();
//		c2.setLogin("LOULOU");
//		c2.setMdp("motdepasse");
//		service.ajouterConnexion(c2);

	
//		//Supprimer une Connexion
//		Connexion c3 = new Connexion();
//		c3 = service.getConnexion(2);
//		service.supprimerConnexion(c3);

//		//Mettre à jour d'une connexion
//		Connexion c4 = new Connexion();
//		c4 = service.affichageConnexion(6);
//		c4.setLogin("Orange");
//		c4.setMdp("Orangina");
//		service.modifierConnexion(c4);
//		
//		//Recuperer une adresse
//		Connexion c5 = new Connexion();
//		c5 = service.affichageConnexion(1);
//		service.affichageConnexion(1);
//		System.out.println(c5);
//
////		//Lister
//		for (Connexion c6 : service.findAllConnexion()) {
//			System.out.println(c6);
//		}
//
//		
//		//rechercher une personnepar mot clé
//		for (Connexion c7: service.rechercherConnexionParMC("md")) {
//			System.out.println(c7);
//		}
		
////		//Opérations en cascade
//		Personne p = new Personne();
//		Adresse a = new Adresse (); 
//		a.setNumRue("5 bis");
//		a.setNomRue("rue de Paris");
//		a.setCp("75015");
//		a.setVille("Paris");
//		
//		p.setNom("Bertrand");
//		p.setPrenom("Luc");
//		p.setAge(25);
//		p.setAdresse(a);
//		service.ajouterPersonne(p);
		
//		//Supprimer l'adresse d'une personne sans supprimer la personne avec la preremove
//		Adresse a = new Adresse();
//		a = service.getAdresse(8);
//		service.supprimerAdresse(a);
		
//		//Jointure Personne Connexion
//		for(Personne pers : service.findAllPersonnesConnexion()) {
//			System.out.println(pers + " "+pers.getConnexion());
//		}
		
	//Jointure Personne Adresse
		for(Personne pers : service.findAllPersonnesAdresse()) {
			System.out.println(pers + " "+pers.getAdresse());
		}
	}

}
