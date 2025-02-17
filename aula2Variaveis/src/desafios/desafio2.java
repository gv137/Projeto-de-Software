package desafios;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		// calculadora de juros compostos
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o capital inicial: ");
		double capInicial = sc.nextDouble(); 
		System.out.println("insira a taxa de juros: ");
		double txJuros = sc.nextDouble(); 
		System.out.println("insira o número de meses: ");
		double nMeses = sc.nextDouble(); 
		
		double mFinal = capInicial * (1 + txJuros)^nMeses;
		
		
		sc.close();

	}

}
