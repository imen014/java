package com.test;
import java.util.Scanner;


public class exercices_mixtes1 {
	/*1. **Calcul de Carré :** Écrivez une fonction qui prend 
	 * un nombre en entrée 
	 * et renvoie son carré.*/
	
	public static double carree(double a) {
		return Math.pow(a, 2);
	}

	/*. **Somme de Deux Nombres :** Écrivez une fonction qui prend
	 *  deux nombres en entrée et renvoie leur somme.*/
	
	
	//exceptions :
	/*1. **Division en Sécurité :** Écrivez un programme qui effectue 
	 * une division, en demandant à l'utilisateur de fournir 
	 * les nombres. Gérez l'exception en cas de division par zéro.*/
	public static int somme(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in);
		System.out.println("entrer nombre 1");
		int nb1 = input.nextInt();
		System.out.println("entrer nombre 2");
		int nb2 = input.nextInt();
		
		try{
			if(nb2 != 0) {
		int result = nb1 / nb2;
		System.out.println("resultat : " + result);
		}
			else {
				System.out.println("division par zero not allowed !");
			}

	} catch (Exception e) {
		System.err.println("errrrrror****!!    : " + e.getMessage());
	}
		*/
		
		/*2. **Conversion en Entier :** Écrivez un programme qui 
		 * demande à l'utilisateur d'entrer 
une chaîne de caractères représentant un nombre. Convertissez 
la chaîne en un entier 
et gérez les exceptions si la conversion échoue.
*/		Scanner chaine = new Scanner(System.in);
		System.out.println("entrer la chaine");
		String ma_chaine = chaine.nextLine();
		try {
		int resultat_conversion = Integer.parseInt(ma_chaine);
		System.out.println("resultat_conversion : " + resultat_conversion);
		}
		catch (Exception e) {
			System.err.println("un erreur s'est produit : " + e.getMessage());
		}
		
		/*1. **Somme d'Éléments :** Créez un tableau d'entiers.
		 *  Écrivez une fonction qui calcule 
la somme de tous les éléments du tableau.*/
		int[] tab1 = {9,200,300,400};
		int x = calcul_somme(tab1);
		System.out.println("la somme des elements de tableau est : " + x);
		
		int [] tab2 = {5, 6, 7, 8, 9 , 10};
		Scanner saisi = new Scanner(System.in);
		System.out.println("saisir une valeur");
		int valeur_saisi = saisi.nextInt();
		boolean trouve = false;
		for(int i = 0 ; i < tab2.length; i++) {
			if(valeur_saisi == tab2[i]) {
				trouve = true;
				break;
			}
		if(trouve) {
			System.out.println("valeur existe : " + valeur_saisi);
		}else {
				System.out.println("valeur not found ! ");
			}
			
		}
	
	}
	
		

	
	public static int calcul_somme(int[]tab) {
		int result = 0;
		for(int i = 0; i < tab.length; i++) {
			result += tab[i];
		}
		return result;
	}
	/*. **Recherche d'Élément :** Créez un tableau d'entiers 
	 * et demandez à l'utilisateur d'entrer
 un nombre. Vérifiez si ce nombre existe dans le tableau.
*/
	
	

}
