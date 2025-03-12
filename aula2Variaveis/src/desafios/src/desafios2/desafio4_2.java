package desafios2;

import java.util.Scanner;

public class desafio4_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu sexo (M/F): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Digite seus anos de experiência como motorista: ");
        int experiencia = sc.nextInt();
        int valorSeguro;
        if ((sexo == 'M' || sexo == 'm') && (idade < 25 || experiencia < 2)) {
            valorSeguro = 2000;
        } else if ((sexo == 'F' || sexo == 'f') && (idade < 25 || experiencia < 2)) {
            valorSeguro = 1800;
        } else {
            valorSeguro = 1200;
        }
        System.out.println("O valor do seguro é: R$ " + valorSeguro);
        
        sc.close();

	}

}
