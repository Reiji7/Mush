package config;

import java.util.ArrayList;
import joueur.*;

public class Initialisation {

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
	
	
	public static ArrayList<Joueur> initVaisseau(){
		return null;
	}
	
}
