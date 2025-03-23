package estruturada;

import java.util.Scanner;

public class Estruturada {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        double Media = (nota1 + nota2 + nota3)/3;
        
        if (Media >= 7) {
        	System.out.println("Você foi aprovado com a nota " + Media);
        } else {
        	System.out.println("Você foi reprovado com a nota " + Media);
        }
        
        sc.close();

	}

}
