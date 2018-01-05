package vaisseau;

import java.util.ArrayList;
import joueur.actions.Action;


/**
*	Salle du vaisseau
*/
public abstract class Salle {

	public ArrayList<Salle> porte;
	public ArrayList<Action> actions;

	
	public Salle() {
		
	}
	
	
	public void action() {
		
	}
	
}
