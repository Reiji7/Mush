package objet;

import config.ListObjets;

public class Gants extends Objet{
	
	public Gants() {
		this.setNom("Paire de gants de protection");
		this.setId(ListObjets.GANTS.getID());
	}
	
	@Override
	public String toString() {
		return this.getNom() + ": Doivent  être  dans  l’inventaire  pendant  une réparation pour ne pas se salir";
	}
}
