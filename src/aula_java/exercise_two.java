package aula_java;

import java.util.Scanner;

public class exercise_two {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//variables
		float nota1, nota2, nota3, nota4, media;
		
		//Starting program
		System.out.println("=== LENDO NOTAS DO PARTICIPANTES ===");
		System.out.println("\nNota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.println("\nNota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.println("\nNota 3: ");
		nota3 = sc.nextFloat();
		
		System.out.println("\nNota 4: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média do participante foi de: %.2f", media);
		//End program

	}
}
