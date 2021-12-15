package lista6.exercicio3;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer qtde;
	
	public Produto(String nome, Double preco, Integer qtde) {
		
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	@Override
	public String toString() {
		return "\nProduto: " + nome + "\nPre�o: R$" + String.format("%.2f", preco) + "\nQuantidade: " + qtde;
	}

}