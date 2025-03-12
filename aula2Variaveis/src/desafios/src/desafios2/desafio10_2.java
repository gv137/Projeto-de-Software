package desafios2;

import java.util.Scanner;

public class desafio10_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para calcular o fatorial: ");
        int fatorialNum = sc.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= fatorialNum; i++) {
            fatorial *= i;
        }
        System.out.println("Fatorial: " + fatorial);
		
		
		sc.close();

	}

}
