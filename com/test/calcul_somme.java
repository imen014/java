package com.test;
import java.util.Scanner;

public class calcul_somme {

	public static void main(String[] args) {
		/***2. Calcul de somme :** Élaborez un programme qui prend 
		 * deux nombres en entrée et affiche 
leur somme.*/
		Scanner input = new Scanner(System.in);
		System.out.println("donner les nombres");
		int nombre1 = input.nextInt();
		int nombre2 = input.nextInt();
		int result = nombre1 + nombre2;
		System.out.println("la somme de deux nombres :" + result);
		

	}

}
