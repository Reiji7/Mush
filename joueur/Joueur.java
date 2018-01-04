package joueur;

import config.Utilitaire;
import joueur.actions.Action;
import objet.Objet;

/**
 *	
 */
public abstract class Joueur {
	
	private int pv = 12;
	private int pa = 12;
	private int pm = 14;
	private int pmo = 7;
	
	protected String nom;
	private String type = "Humain";
	private Objet[] inventaire = new Objet[3];
	private Action[] actions;
	
	
	/**
	 * Effectue l'ation séléctionner par le joueur
	 */
	public void action() {
		int i = listeActions();
		if(this.actions[i].disponible()) {
			this.actions[i].action(this);
		}
		else {
			this.action();
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


	/**
	 * Modification des points de vie
	 * @param pv
	 */
	public void modifiePv(int pv) {
		this.pv += pv;
		if(this.pv > 14) {
			this.pv = 14;
		}
		else if(this.pv < 1) {
			//	Mort
		}
	}


	/**
	 * Modification des points d'action
	 * @param pa
	 */
	public void modifiePa(int pa) {
		this.pa += pa;
		if(this.pa > 12) {
			this.pa = 12;
		}
		else if(this.pa < 1) {
			this.pa = 0;
		}
	}


	/**
	 * Modification des points de mouvement
	 * @param pm
	 */
	public void modifiePm(int pm) {
		this.pm += pm;
		if(this.pm > 12) {
			this.pm = 12;
		}
		else if(this.pm < 1) {
			this.pm = 0;
		}
	}


	/**
	 * Modification des points de moral
	 * @param pmo
	 */
	public void modifiePmo(int pmo) {
		this.pmo += pmo;
		if(this.pmo > 14) {
			this.pmo = 14;
		}
		else if(this.pmo < 1) {
			this.pmo = 0;
		}
	}
	
	
	
	public String toString() {
		int index = 0;
		String s = nom + "\n"
				+ "Point(s) de vie:\t" + pv
				+ "\nPoint(s) d'action:\t" + pa
				+ "\nPoint(s) de mouvement:\t" + pm
				+ "\nPoint(s) de moral:\t" + pmo
				+ "\nInventaire:";
		
		while(inventaire[index] != null) {
			s += "\t" + inventaire[index].getNom() + "\n";
			index++;
		}
		index = 0;
		
		s += "\n" + type;

		while(inventaire[index] != null) {
			s += "\t" + actions[index].getNom() +"\n";
			index++;
		}
		
		return s;
	}
	
}