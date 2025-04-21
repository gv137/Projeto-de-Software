package vetorArray;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5]; 
        int soma = 0;

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro:");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        
        double media = (double) soma / numeros.length;

        
        System.out.print("Lista de números: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();

	}

}
