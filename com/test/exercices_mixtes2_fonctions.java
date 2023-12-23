package com.test;

public class exercices_mixtes2_fonctions {

	public static void main(String[] args) {
		int[]tab1 = {100,200,300};
		moyenne(tab1);
		

	}
	/*1. Écrivez une fonction qui prend un tableau d'entiers 
	 * en entrée et renvoie la moyenne des valeurs.
*/
	public static int moyenne(int[]tab) {
		int moyenne = 0;
		for(int i = 0; i < tab.length; i++) {
			moyenne += tab[i];
		}
		moyenne /= tab.length;
		System.out.println("moyenne egale : " + moyenne);
		return moyenne;
	}

}
