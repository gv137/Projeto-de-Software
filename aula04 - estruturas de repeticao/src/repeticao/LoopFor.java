package repeticao;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		
		//tabuada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a tabuada desejada: ");
		int numero = sc.nextInt();
		
		    //(inicio; fim; incremento)
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(numero + "*" + i + "=" + numero*i);
			
			
		}
		
		sc.close();

	}

}
