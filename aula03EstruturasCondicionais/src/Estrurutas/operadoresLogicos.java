package Estrurutas;

import java.util.Scanner;

public class operadoresLogicos {

	public static void main(String[] args) {
		/*
		 Login e Senha   
		 
		 OPERADORES LÓGICOS
		 
		 and - &&
		 or - ||
		 not - !
		 
		 */

		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "gustavo";
		String senhaSalva = "1234";
		
		
		System.out.print("Digite o seu login: ");
		String login = sc.next();
		
		System.out.print("Digite a sua senha: ");
		String senha = sc.next();
		
		// na comparação de strings, usar .equals()
		
		if (loginSalvo.equals(login)  && senhaSalva.equals(senha)  ) {
			
			System.out.println("Acesso liberado");
			
		} else {
			System.out.println("Acesso negado");
		}
		
		sc.close();
		
	}

}
