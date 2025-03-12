package desafios2;

import java.util.Scanner;

public class desafio7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três lados do triângulo:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
		
		 if (a + b > c && a + c > b && b + c > a) {
	            if (a == b && b == c) {
	                System.out.println("Triângulo Equilátero.");
	            } else if (a == b || a == c || b == c) {
	                System.out.println("Triângulo Isósceles.");
	            } else {
	                System.out.println("Triângulo Escaleno.");
	            }
	        }
		
		sc.close();

	}

}
