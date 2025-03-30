package desafio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Roupa roupa = new Roupa();
		
	        System.out.println("Digite a marca da roupa:");
	        roupa.marca = sc.nextLine();
	        
	        System.out.println("Digite o tipo da roupa:");
	        roupa.tipo = sc.nextLine();
	        
	        System.out.println("Digite o tamanho da roupa:");
	       roupa.tamanho = sc.nextLine();
	        
	        System.out.println("Digite a quantidade em estoque:");
	        roupa.quantidade = sc.nextInt();
	        
	        System.out.println("Digite o valor da peça:");
	        roupa.valor = sc.nextDouble();
	        
	        
	        
	        System.out.println(roupa.toString());
	        
	        int opcao;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Mostrar valor total do estoque");
	            System.out.println("2 - Adicionar quantidade ao estoque");
	            System.out.println("3 - Remover quantidade do estoque");
	            System.out.println("4 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = sc.nextInt();
	            
	            switch (opcao) {
	                case 1:
	                    System.out.println("Valor total do estoque: " + roupa.calcularValorTotal());
	                    break;
	                case 2:
	                    System.out.print("Quantidade a adicionar: ");
	                    int adicionar = sc.nextInt();
	                    roupa.adicionarEstoque(adicionar);
	                    break;
	                case 3:
	                    System.out.print("Quantidade a remover: ");
	                    int remover = sc.nextInt();
	                    roupa.removerEstoque(remover);
	                    break;
	                case 4:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    System.out.println("Opção inválida!");
	            }
	        } while (opcao != 4);

	        sc.close();
	        

	}

}
