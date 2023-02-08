package Second_day;

import java.util.Scanner;

public class exercise_two {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		
		//VARIAVEIS
		int diasVida, anosCal, mesCal, diaCal;
		int ano =365, mes = 30, dias;
		//VARIAVEIS PARA CALCULO DE RESTOS
		int rano, rmes;
		
		
		//STARTING PROGRAM
		System.out.println("\nInsira a quantidade de dias de vida: ");
		diasVida = l.nextInt();
		
		//CALCULOS 
		anosCal = diasVida / ano;
		rano = diasVida % ano;
		
		mesCal =  rano / mes;
		rmes = rano % mes;
		
		diaCal = rmes;
		
		System.out.printf("\nVoce tem %d anos, %d meses e %d dias", anosCal, mesCal, diaCal);

	}

}
