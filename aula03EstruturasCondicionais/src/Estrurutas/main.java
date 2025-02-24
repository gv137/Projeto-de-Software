package Estrurutas;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*programa que calcula a média do usuário e diga se foi:
		 - aprovado - 7 a 10 
		 
		 - recuperação - 5 a 6.9
		       * aprovado - 7 a 10
		       * reprovado - 0 a 6.9
		       
		 - reprovado - 0 a 4.9*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println(media);
		
		if (media >= 7) {
			System.out.println("Aprovado!!");
		} 
		
		else if (media >= 5) {
			System.out.println("Recuperação!!");
			
			System.out.print("Digite a primeira nota: ");
			double rec1 = sc.nextDouble();
			double medrec = (rec1 + media) / 2;
			
			
			if(medrec >= 7) {
			System.out.println("Aprovado");
			}
			else {System.out.println("Reprovado"); 
			}
		}
		
			else {
			System.out.println("Reprovado!!");
		}
		
		
		sc.close();
	}

}
