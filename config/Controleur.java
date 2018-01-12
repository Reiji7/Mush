package config;

import java.util.ArrayList;
import joueur.Joueur;
import vaisseau.Salle;


public class Controleur {
	
	private static ArrayList<Joueur> Joueurs = Initialisation.initJoueur();
	private static ArrayList<Salle> Salles = Initialisation.initVaisseau();
	
	public static void lancement() {
		for(Joueur j : Joueurs) {
			j.action();
		}
			
	}
	
}