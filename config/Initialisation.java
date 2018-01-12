package config;

import java.util.ArrayList;
import joueur.*;
import vaisseau.Salle;
import vaisseau.salles.*;

public class Initialisation {

	/**
	 * Initialisation de tous les joueurs
	 * @return Liste de joueurs
	 */
	public static ArrayList<Joueur> initJoueur(){
		ArrayList<Joueur> Joueurs = new ArrayList<>();
		
		Joueurs.add(new WangChao());
		Joueurs.add(new EleeshaWilliams());
		Joueurs.add(new FinolaKeegan());
		Joueurs.add(new FriedaBergmann());
		Joueurs.add(new GioeleRinaldao());
		Joueurs.add(new IanSoulton());
		Joueurs.add(new JaniceKent());
		Joueurs.add(new JiangHua());
		Joueurs.add(new KimJinSu());
		Joueurs.add(new LaiKuanTi());
		Joueurs.add(new PaolaRinaldo());
		Joueurs.add(new ZhongChun());

		// Choix des deux Mush
		int r1, r2;
		r1 = (int) Math.random() * Joueurs.size();
		
		do {
			r2 = (int) Math.random() * Joueurs.size();
		}
		while(r2 == r1);
		
		Joueurs.add(r1, Joueurs.get(r1).toMush());
		Joueurs.add(r2, Joueurs.get(r2).toMush());
		
		return Joueurs;
	}
	
	
	/**
	 * Liste des salles
	 * @return 
	 */
	public static ArrayList<Salle> initVaisseau(){
		ArrayList<Salle> vaisseau = new ArrayList<>();

		// Initialise les autres salles
		vaisseau.add(new Pont());
		vaisseau.add(new TourelleAlphaAvant());
		vaisseau.add(new TourelleBetaAvant());
		
		// Ensuite il faut faire les liens entre les salles
		// Pour le pont par exemple
		vaisseau.get(0).addPortes(vaisseau.get(1));		// Ajout de la tourelle alpha avant au pont
		vaisseau.get(0).addPortes(vaisseau.get(2));		// Ajout de la tourelle beta avant au pont
		
		
		
		return null;
	}
	
}
