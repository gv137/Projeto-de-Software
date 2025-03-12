package desafios2;

import java.util.Scanner;

public class desafio5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor total da compra: ");
        double valorCompra = sc.nextDouble();
        System.out.print("Digite o número de itens adquiridos: ");
        int itens = sc.nextInt();
        double desconto = 0;
        if (valorCompra > 1000) {
            desconto = 0.20;
        } else if (valorCompra > 500 || itens > 5) {
            desconto = 0.10;
        } else if (valorCompra > 300 || itens > 3) {
            desconto = 0.05;
        }
        double valorFinalCompra = valorCompra * (1 - desconto);
        System.out.printf("Valor final com desconto: R$ %.2f\n", valorFinalCompra);
		
		sc.close();

	}

}
