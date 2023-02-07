package aula_java;

import java.util.Scanner;

public class exercise_four {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		//VARIABLES
		int n1, n2, n3, n4, dif;
		
		//STARTING PROGRAM
		System.out.println("=== CÁLCULO DE DIFERENÇAS === ");
		
		System.out.println("\nNumero 1: ");
		n1 = ler.nextInt();
		
		System.out.println("\nNumero 2: ");
		n2 = ler.nextInt();
		
		System.out.println("\nNumero 3: ");
		n3 = ler.nextInt();
		
		System.out.println("\nNumero 4: ");
		n4 = ler.nextInt();
		
		dif = (n1 * n2) - (n3 * n4);
		
		System.out.println("\nA diferença é de: " + dif);
		//END PROGRAM
	}

}
