package joueur;

import config.Utilitaire;
import joueur.actions.Action;
import objet.Objet;
import objet.Vide;
import vaisseau.Salle;


/**
 *	
 */
public abstract class Joueur {
	
	private int pv = 12;
	private int pa = 12;
	private int pm = 14;
	private int pmo = 7;
	
	private Salle salle;
	protected String nom;
	private String type = "Humain";
	private boolean vie = true;
	
	private Objet[] inventaire = new Objet[3];
	private Action[] actions;
	
	
	/**
	 * Cherche si il y a une place libre dans l'inventaire
	 * @return indice de la place libre ou -1 si il n'y en a pas
	 */
	private int place() {
		int index = 0;
		
		// Parcours de l'inventaire 
		while(inventaire[index] != null) {
			// Si lobjet courant est vide
			if(inventaire[index].getId() == 0) {
				// On retourne l'index de cette objet
				return index;
			}
			index++;
		}
		
		/* 
		 * Si on a parcouru tout le tableau sans
		 * trouver d'objet vide on renvoie le code -1
		 */
		return -1;
	}
	
	
	/**
	 *	Depot d'objet dans la salle
	 */
	public void depot() {
		System.out.println("Quel objet voulez-vous déposer dans la salle ?");
		
		int index = inventaireSelect();
		
		/*
		 *  Si l'indice séléctionner est dans les borne du tableau,
		 *  qu'il n'est pas vide et que ce n'est pas un spore
		 */
		if(index >= 0 && index < 4 &&
				inventaire[index].getId() != 0 &&
				inventaire[index].getId() != 20) {
			// On l'ajoute a l'inventaire de la salle
			salle.addInventaire(inventaire[index]);
			
			// Et on le retire de l'inventaire du joueur
			inventaire[index] = new Vide();
		}
		
	}
	
	
	/**
	 * Séléction de d'un objet dans l'inventaire
	 * @return indice de l'objet séléctionner
	 */
	private int inventaireSelect() {
		int index = 0;
		
		// parcours de l'inventaire
		while(inventaire[index] != null) {
			
			// Affichage de l'objet courant et de son indice +1
			System.out.println("\t" 
					+ index+1 + ": " 
					+ inventaire[index].getNom());
			index++;
		}
		
		// Saisi utilisateur de l'indice séléctionner
		index = Utilitaire.sc.nextInt();
		
		// Retour de l'indice -1
		return index--;
	}
	
	
	/**
	 * Effectue l'ation séléctionner par le joueur
	 */
	public void action() {
		int i = listeActions();		// Séléction de l'action a effectuer
		
		// Si l'action saisi est disponible
		if(this.actions[i].disponible()) {
			// Alors on l'execute
			this.actions[i].action(this);
		}
	}
	
	
	/**
	 * Sélection de l'action a effectué
	 * @return numéros d'action
	 */
	private int listeActions() {
		
		// Pacours des actions disponibles
		for (int index = 0; index < this.actions.length; index++) {
			
			// Affichage des actions et de leurs indices
			System.out.print(index + ": " + this.actions[index]);
			
			// Si l'ction courante est disponible 
			if(this.actions[index].disponible()) {
				// On passe a la ligne suivante
				System.out.println();
			}
			else {
				// Sinon on précise quel n'est pas disponible
				System.out.println(" (indisponible)");
			}
		}

		// On demande l'action souhaiter
		System.out.print("/nSélectionner l'action a effectué:/t");

		// Puis on la retourne
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
			vie = false;
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
		String s = "________________________________\n"
				+ nom + "\n"
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
		
		s += "\n________________________________";
		
		return s;
	}
	
}