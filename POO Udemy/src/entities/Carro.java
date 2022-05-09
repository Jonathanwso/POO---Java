package entities;

public class Carro {
	private String cor;
	private String modelo;
	private Double preco;
	static int total = 0;
	
	public static int getTotal() {
		return Carro.total;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	public Carro(String cor, String modelo, Double preco) {
		Carro.total++;
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}

}
