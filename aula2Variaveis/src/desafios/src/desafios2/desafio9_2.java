package desafios2;

import java.util.Scanner;

public class desafio9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		 int somaPares = 0, somaImpares = 0;
	        System.out.println("Digite números (0 para sair):");
	        while ((num = sc.nextInt()) != 0) {
	            if (num % 2 == 0) somaPares += num;
	            else somaImpares += num;
	        }
	        System.out.println("Soma dos pares: " + somaPares);
	        System.out.println("Soma dos ímpares: " + somaImpares);
		
		sc.close();

	}

}
