package config;

import joueur.*;


public class Main {

	public static void main(String[] args) {
		
		Joueur WangChao = new WangChao();
		System.out.println(WangChao);
		
		WangChao.action();
		
		Static.talkyWalky.affichage();
		
	}

}
