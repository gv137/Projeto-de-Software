package desafios;

import java.util.Scanner;

public class desafio1 {

	public static void main(String[] args) {
		 // conversor de temperatura
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("didgite a temperatura em celsius: ");
		double celsius = sc.nextDouble();
		
		double F = (celsius * 1.8) + 32;
		double K = celsius + 273.15;
		
		System.out.println("A temperatura em Fahrenheit é igual a " + F + "F" );
		System.out.println("A temperatura em Kelvin é igual a " + K + "K");
		sc.close();
	}

}
