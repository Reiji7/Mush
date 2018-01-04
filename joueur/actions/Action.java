package joueur.actions;

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
		
	}
	
	
	public String getNom() {
		return nom;
	}
}