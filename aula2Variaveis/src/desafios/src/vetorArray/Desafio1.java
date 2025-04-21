package vetorArray;

import java.util.Scanner;
import java.util.ArrayList;

public class Desafio1 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        String[] nomes = new String[5];

	        
	        for (int i = 0; i < nomes.length; i++) {
	            System.out.println("Digite um nome:");
	            nomes[i] = sc.nextLine();
	        }

	        
	        System.out.println("Digite a letra para filtrar os nomes:");
	        String letra = sc.nextLine();

	        
	        ArrayList<String> nomesFiltrados = new ArrayList<>();

	        for (String nome : nomes) {
	            if (nome.toLowerCase().startsWith(letra.toLowerCase())) {
	                nomesFiltrados.add(nome);
	            }
	        }

	        // Exibindo os nomes encontrados
	        System.out.println("Nomes encontrados que começam com \"" + letra + "\": " + nomesFiltrados);
	        System.out.println("Total de nomes: " + nomesFiltrados.size());

	        sc.close();

	}

}
