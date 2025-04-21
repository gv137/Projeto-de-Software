package vetorArray;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        String[] palavras = new String[5];

        
        for (int i = 0; i < palavras.length; i++) {
            System.out.println("Digite uma palavra:");
            palavras[i] = sc.nextLine();
        }

        
        System.out.println("Digite uma letra para remover palavras que a contenham:");
        char letra = sc.nextLine().toLowerCase().charAt(0);

        
        System.out.print("Removendo palavras que contêm \"" + letra + "\": [");

        boolean primeira = true;
        for (int i = 0; i < palavras.length; i++) {
            if (!palavras[i].toLowerCase().contains(String.valueOf(letra))) {
                if (!primeira) {
                    System.out.print(", ");
                }
                System.out.print(palavras[i]);
                primeira = false;
            }
        }
        System.out.println("]");

        sc.close();

	}

}
