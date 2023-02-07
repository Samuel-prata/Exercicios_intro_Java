package aula_java;

import java.util.Scanner;

public class exercise_three {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		float sal_bruto, desconto, adc_not, hora_extra, sal_liquido;
		
		//STARTING PROGRAM
		System.out.println("=== CÁLCULO DE SALÁRIO LÍQUIDO ===");
		
		System.out.println("\nSalário bruto: ");
		sal_bruto = sc.nextFloat();
		
		System.out.println("\nAdicional noturno: ");
		adc_not = sc.nextFloat();
		
		System.out.println("\nHoras extras: ");
		hora_extra = sc.nextFloat();
		
		System.out.println("\nDescontos: ");
		desconto = sc.nextFloat();
		
		sal_liquido = sal_bruto + adc_not + (hora_extra * 5) - desconto;
		
		System.out.printf("\nO salário líquido do funcionário é de: %.2f", sal_liquido);
		//END PROGRAM
		
		
	}

}
