package com.test;
import java.util.Scanner;

public class carre_nombre {

	public static void main(String[] args) {
		/***4. Calcul de carré :** Écrivez un programme qui prend
		 *  un nombre en entrée et affiche son carré.*/
		Scanner input = new Scanner(System.in);
		System.out.println("entrer un nombre : ");
		double nombre = input.nextDouble();
		double carre = Math.pow(nombre, 2);
		System.out.println("le carré de  " + nombre + "est : " + carre);
		

	}

}
