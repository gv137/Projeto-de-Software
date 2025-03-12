package repeticao;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		
		String login = "";
		String senha = "";
		
		int i = 0;
		
		while ((!(login.equals(loginSalvo)) || !(senha.equals(senhaSalva))) && (i<5)) {
			System.out.println("informe seu login: ");
			login = sc.nextLine();
			
			System.out.println("informe sua senha: ");
			senha = sc.nextLine();
			
			i++;
		}
		
		if (login.equals(loginSalvo) && senha.equals(senhaSalva)){
			System.out.println("Acesso liberado");
		}else {
			System.out.println("Senha ou login incorreto");
		}
		
		
		
		sc.close();

	}

}
