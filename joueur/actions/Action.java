package joueur.actions;

import joueur.Joueur;

public interface Action {

	/**
	 * Si l'action est disponible 
	 */
	public boolean disponible();
	
	public void action(Joueur j);
	
}
