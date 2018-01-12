package joueur.actions;

import config.Static;
import joueur.Joueur;


public abstract class Action {

	private boolean disponible = true;
	protected String nom;
	

	/**
	 * Si l'action est disponible 
	 */
	public boolean disponible() {
		return disponible;
	}
	
	public void action(Joueur j) {
		// Ajout de l'action au tableau de bord
		Static.Bord.add(j.getNom() + ": " + this.toString() + "\n");
	}
	
	
	public String getNom() {
		return nom;
	}
}