package repeticao;

import java.util.Scanner;

public class LoopWhileBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String loginSalvo = "admin";
		String senhaSalva = "1234";
		String login = "";
		String senha = "";
		
		int tentativas = 1;
		int i = 5;
		
		while (true) {
			
			System.out.println("Insira seu login: ");
			login = sc.nextLine();
			
			System.out.println("Insira sua senha: ");
			senha = sc.nextLine();
			
			if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso liberado");
				break;
			} else if(tentativas >= i) {
				System.out.println("Número de tentativas excedido, acesso bloqueado!");
				break;
			} else {
				System.out.println("Acesso negado, tente novamente");
			}
			
			tentativas++;
		}
		
		sc.close();

	}

}
