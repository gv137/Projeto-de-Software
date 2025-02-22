package desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o capital inicial: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o número de meses: ");
        int meses = scanner.nextInt();

        double taxaDecimal = taxaJuros / 100;
        double montante = capital * Math.pow((1 + taxaDecimal), meses);

        
        System.out.printf("O montante após %d meses será de R$ %.2f%n", meses, montante);

        scanner.close();
    }
}
