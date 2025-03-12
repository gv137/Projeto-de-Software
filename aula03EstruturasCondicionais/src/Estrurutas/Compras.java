package Estrurutas;

import java.util.Scanner;

public class Compras {

	public static void main(String[] args) {
		/* Máquina de cartão
		 
	capturar o valo de uma compra e o método de pagamento
		 
		  1- Dinheiro/Pix - 10% de desconto
		  2- Débito - 5% de desconto
		  3- Crédito - total
		     * Metodos de parcelamento
		     - a vista = valor total
		     - 2x - 5% de juros
		     - 3x - 10% de juros
		  
		  */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor da compra: ");
		double valorCompra = sc.nextDouble();
		
		System.out.println("Método pagamento: ");
		System.out.println("1 - Dinheiro/Pix");
		System.out.println("2 - Débito");
		System.out.println("3 - Crédito");
		
		int metodoPagamento = sc.nextInt();
		
		switch (metodoPagamento) {
			case 1:
				double valorFinal = valorCompra * 0.9;
				System.out.println("O valor da sua compra ficou: " + valorFinal);
				break;
				
			case 2:
				valorFinal = valorCompra * 0.95;
				System.out.println("O valor da sua compra ficou: " + valorFinal);
				break;
				
			case 3:	
				System.out.println("Parcelas ");
				System.out.println("1 - à vista");
				System.out.println("2 - 2x (5% de juros)");
				System.out.println("3 - 3x (10% de juros)");
				int juros = sc.nextInt();
				
				switch (juros) {
				case 1:
					System.out.println("O valor da sua compra ficou: " + valorCompra);
					break;

				case 2:
					valorFinal = (valorCompra * 0.05) + valorCompra;
					double valorTotal = valorFinal / 2;
					System.out.println("O valor da sua compra ficou em duas parcelas de R$" + valorTotal);
					break;
					
				case 3:	
					valorFinal = (valorCompra * 0.10) + valorCompra;
				    valorTotal = valorFinal / 3;
					System.out.printf("O valor da sua compra ficou em três parcelas de R$ %.2f %n", valorTotal);
					break;
					
				default: 
						System.out.println("Opção inválida");
						break;					
				}
				
				break;
				
			default:
				System.out.println("Opção inválida");
				break;
		}
			
		
		sc.close();
		
	}

}
