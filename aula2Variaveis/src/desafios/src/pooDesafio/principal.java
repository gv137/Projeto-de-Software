package pooDesafio;

public class principal {

	public static void main(String[] args) {
		
		Notas aluno = new Notas();
		aluno.N1 = 10;
		aluno.N2 = 6;
		aluno.N3 = 5;
		
		double mediaAluno = aluno.Media();
		
		if (mediaAluno >= 7) {
			System.out.println("Você foi aprovado, sua nota foi " + mediaAluno);
		} else {
			System.out.println("Você foi reprovado, sua nota foi " + mediaAluno);
		}
		

	}

}
