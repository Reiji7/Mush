package joueur.actions;

import joueur.Joueur;

public abstract class Action {

	private boolean disponible;
	
	/**
	 * Si l'action est disponible 
	 * @return disponible
	 */
	public boolean disponible() {
		return this.disponible;
	}
	
	public void action(Joueur j) {
		
	}
	
}
