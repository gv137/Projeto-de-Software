package desafios;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        double perimetro = 2 * Math.PI * raio;

        System.out.printf("A área do círculo é: %.2f%n", area);
        System.out.printf("O perímetro do círculo é: %.2f%n", perimetro);

        scanner.close();
    }
}
