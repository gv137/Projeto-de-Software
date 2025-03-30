package desafio3;

public class Roupa {
	
	
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;
    
	
    
    @Override
	public String toString() {
		return "Roupa [marca=" + marca + ", tipo=" + tipo + ", tamanho=" + tamanho + ", quantidade=" + quantidade
				+ ", valor=" + valor + "]";
	}


	public double calcularValorTotal() {
        return quantidade * valor;
    }

   
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

   
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    
    
    
    }
}
