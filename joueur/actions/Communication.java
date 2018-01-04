package joueur.actions;

import config.Static;
import config.Utilitaire;
import joueur.Joueur;

public class Communication implements Action{

	@Override
	public boolean disponible() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void action(Joueur j) {
		Static.talkyWalky.affichage();
		String reponse;
		
		do {
			System.out.println("Voulez vous dire quelque chose dans le cannal de discution ? (oui / non)");
			reponse = Utilitaire.sc.nextLine();
			
			if(reponse == "oui") {
				Static.talkyWalky.add(Utilitaire.sc.nextLine());
			}

		}
		while(reponse != "oui" || reponse != "non");


	}


}
