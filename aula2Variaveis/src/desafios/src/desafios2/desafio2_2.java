package desafios2;

import java.util.Scanner;

public class desafio2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em reais: ");
	        double valorReais = sc.nextDouble();
	        System.out.println("Escolha a moeda para conversão:\n1 - Dólar\n2 - Euro\n3 - Libra");
	        int opcao = sc.nextInt();
	        switch (opcao) {
	            case 1:
	                System.out.printf("Valor em Dólar: US$ %.2f\n", valorReais * 0.20);
	                break;
	            case 2:
	                System.out.printf("Valor em Euro: € %.2f\n", valorReais * 0.18);
	                break;
	            case 3:
	                System.out.printf("Valor em Libra: £ %.2f\n", valorReais * 0.15);
	                break;
	            default:
	                System.out.println("Opção inválida!");
	        }


	}

}
