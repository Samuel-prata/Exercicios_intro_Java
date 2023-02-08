package Second_day;

import java.util.Scanner;

public class exercise_three {

	public static void main(String[] args) {
		Scanner l = new Scanner (System.in); 
		
		//VARIAVEIS
		int duracao, horas, minutos, seg;
		//VARIAVEIS PARA CONTAGENS DE H,MIN E SEG
		int d = 60;
		//VARIAVEIS DE RESTO
		int rhora, rmin;
		
		System.out.print("\nQuantos segundos o evento durou ? ");
		duracao = l.nextInt();
		
		//CALCULOS
		rhora = duracao % d;
		rmin = rhora % d;
		
		
		horas = duracao / d;
		minutos = rhora / d;
		seg = rmin;
		
		//SAIDA DE DADOS
		System.out.printf("\nO evento durou %d horas, %d minutos e %d segundos", horas, minutos, seg);
		
		//FIM

	}

}