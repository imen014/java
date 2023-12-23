package com.test;
import java.util.Scanner;

public class table_de_multiplication_dun_nombre {

	public static void main(String[] args) {
		/***3. Table de multiplication :** Créez un programme 
		 * qui prend un nombre en entrée et affiche 
sa table de multiplication jusqu'à 10.*/
		Scanner input = new Scanner(System.in);
		System.out.println("donner un nombre");
		int nombre_aMultiplier = input.nextInt();
		for(int i = 0; i < 11; i++) {
			int result = nombre_aMultiplier * i;
			System.out.println("la multiplication de " + nombre_aMultiplier +" x " + i + " donne : " + result);
			
		}
		

	}

}
