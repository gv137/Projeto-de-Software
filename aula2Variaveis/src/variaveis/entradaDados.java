package variaveis;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
	
		
		
		System.out.println("Digite seu nome: ");
		nome = sc.next(); // Armazenar valores tipo texto
	
		System.out.println(nome);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt(); // Armazenar valores tipo inteiro
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("A sua idade é de " + idade + " anos, " + nome + " e você mede " + altura + "m");
		
		
		sc.close();
		
		
	}

}
