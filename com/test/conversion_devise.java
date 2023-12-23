package com.test;
import java.util.Scanner;

public class conversion_devise {

	public static void main(String[] args) {
		/***5. Conversion de devises :** Implémentez un programme 
		 * qui convertit des montants d'une devise
 à une autre (par exemple, de dollars en euros) en utilisant un taux
  de change fixe.*/
		Scanner input = new Scanner(System.in);
		System.out.println("entrer le nombre à convertir");
		float montant = input.nextFloat();
		input.nextLine();
		System.out.println("entrer devise actuelle : ");
		String devise = input.nextLine();
		
		System.out.println("entrer devise desiree : ");
		String devise_desiree = input.nextLine();
		
		

	}

}
