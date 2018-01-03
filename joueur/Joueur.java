package joueur;

import config.Utilitaire;
import joueur.actions.Action;
import objet.Objet;

/**
 *	
 */
public abstract class Joueur {
	
	private int pv, pm, pmo;
	private Objet[] inventaire = new Objet[3];
	private Action[] actions;
	
	
	/**
	 * Effectue l'ation séléctionner par le joueur
	 */
	public void action() {
		int i = listeActions();
		if(this.actions[i].disponible()) {
			this.actions[i].action();
		}
		else {
			action();
		}
	}
	
	
	/**
	 * Sélection de l'action a effectué
	 * @return numéros d'action
	 */
	private int listeActions() {
		
		for (int index = 0; index < this.actions.length; index++) {
			
			System.out.print(index + ": " + this.actions[index]);
			
			if(this.actions[index].disponible()) {
				System.out.println();
			}
			else {
				System.out.println(" (indisponible)");
			}
		}

		System.out.print("/nSélectionner l'action a effectué:/t");

		return Utilitaire.sc.nextInt();
	}
}