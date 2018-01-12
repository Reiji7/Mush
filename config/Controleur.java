package config;

import java.util.ArrayList;
import joueur.Joueur;


public class Controleur {
	
	private static ArrayList<Joueur> Joueurs = Initialisation.initJoueur();
	
	public static void lancement() {
		for(Joueur j : Joueurs) {
			j.action();
		}
			
	}
	
}