package desafios2;

import java.util.Scanner;

public class desafio6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite três lados do triângulo:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores formam um triângulo válido.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo válido.");
        }
		
		sc.close();

	}

}
