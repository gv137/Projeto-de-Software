package desafios;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo (em meses): ");
        int meses = scanner.nextInt();

        double taxaDecimal = taxaJuros / 100;

        double juros = capital * taxaDecimal * meses;

        double montante = capital + juros;

        System.out.printf("O valor dos juros é R$ %.2f%n", juros);
        System.out.printf("O montante total após %d meses será de R$ %.2f%n", meses, montante);

        scanner.close();
    }
}
