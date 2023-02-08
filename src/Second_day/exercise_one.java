package Second_day;

import java.util.Scanner;

public class exercise_one {

	public static void main(String[] args) {
		
		Scanner l = new Scanner (System.in); 
		
		//VARIABLES
		int dias, mes, anos, diasVida;
		int ma = 365, dm = 30;
		
		
		//STARTING PROGRAM
		
		//ENTRADA DE DADOS
		System.out.println("\nQuantos anos você tem ? ");
		anos = l.nextInt();
		
		System.out.println("\nQuantos meses você tem ?");
		mes = l.nextInt();
		
		System.out.println("\nQuantos dias: ");
		dias = l.nextInt();
		
		System.out.printf("\n%d anos, %d meses e %d dias \n", anos, mes, dias);
		
		
		
		//CALCULOS
		diasVida = ( anos * ma ) + ( mes * dm) + dias;
		
		//RESULTADO
		System.out.printf("\nEquivalem a %d dias de vida", diasVida);
				
		
		
		
		

	}

}
