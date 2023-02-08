package Second_day;

import java.util.Scanner;

public class exercise_five {

	public static void main(String[] args) {

		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		double n1, n2, n3;
		double m1, m2, m3, mf;
		double p1 = 2.0, p2 = 3.0, p3 = 5.0;
		
		//STARTING PROGRAM
		System.out.print("\nDigite a primeira nota do aluno: ");
		n1 = l.nextDouble();
		
		System.out.print("\nDigite a segunda nota do aluno: ");
		n2 = l.nextDouble();
		
		System.out.print("\nDigite a terceira nota do aluno: ");
		n3 = l.nextDouble();
		
		//CALCULOS
		m1 = n1 * p1;
		m2 = n2 * p2;
		m3 = n3 * p3;
		mf = (m1 + m2 + m3) / 3.0;
		
		// RESULTADOS
		System.out.printf("\nA média final é: %2f", mf );
	}

}
