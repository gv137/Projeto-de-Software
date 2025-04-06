package desafio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca da roupa:");
        String marca = scanner.nextLine();

        System.out.println("Digite o tipo da roupa:");
        String tipo = scanner.nextLine();

        System.out.println("Digite o tamanho da roupa:");
        String tamanho = scanner.nextLine();

        System.out.println("Digite a quantidade em estoque:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o valor da peça:");
        double valor = scanner.nextDouble();

        Roupa roupa = new Roupa(marca, tipo, tamanho, quantidade, valor);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mostrar valor total do estoque");
            System.out.println("2 - Adicionar quantidade ao estoque");
            System.out.println("3 - Remover quantidade do estoque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor total do estoque: " + roupa.calcularValorTotal());
                    break;
                case 2:
                    System.out.print("Quantidade a adicionar: ");
                    int adicionar = scanner.nextInt();
                    roupa.adicionarEstoque(adicionar);
                    break;
                case 3:
                    System.out.print("Quantidade a remover: ");
                    int remover = scanner.nextInt();
                    roupa.removerEstoque(remover);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
