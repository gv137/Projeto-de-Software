package vetorArray;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }

        
        System.out.print("Números pares: [");
        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i]);
                count++;
                if (count < numeros.length) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");

        sc.close();

	}

}
