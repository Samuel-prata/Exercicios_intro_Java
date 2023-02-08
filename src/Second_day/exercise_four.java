package Second_day;

import java.util.Scanner;

public class exercise_four {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in);
		
		//VARIAVEIS
		int a, b, c;
		double d, r, s;
		
		
		// RECEBENDO DADOS
		System.out.print("\nValor do numero A: ");
		a = l.nextInt();
		
		System.out.print("\nValor do numero B: ");
		b = l.nextInt();
		
		System.out.print("\nValor do numero C: ");
		c = l.nextInt();
		
		
		//CALCULOS
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		
		d = (r + s ) / 2;
		
		System.out.println("\n O resultado é: " + d);
	}

}
