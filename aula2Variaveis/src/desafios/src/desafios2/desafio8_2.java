package desafios2;

import java.util.Scanner;

public class desafio8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int soma = 0, count = 0, num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            if (num != 0) {
                soma += num;
                count++;
            }
        } while (num != 0);
        System.out.println("Média: " + (count > 0 ? (double) soma / count : 0));
		
		sc.close();

	}

}
