package desafios2;

import java.util.Scanner;

public class desafio3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();
        System.out.println("Escolha o número de parcelas:\n6 - 6 meses (+5%)\n12 - 12 meses (+10%)\n24 - 24 meses (+20%)");
        int parcelas = sc.nextInt();
        double valorFinal;
        switch (parcelas) {
            case 6:
                valorFinal = valorEmprestimo * 1.05;
                break;
            case 12:
                valorFinal = valorEmprestimo * 1.10;
                break;
            case 24:
                valorFinal = valorEmprestimo * 1.20;
                break;
            default:
                System.out.println("Número de parcelas inválido!");
                return;
        }
        System.out.printf("Valor total a ser pago: R$ %.2f\n", valorFinal);
        
        sc.close();

	}

}
