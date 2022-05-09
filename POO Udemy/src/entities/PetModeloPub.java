package entities;

public class PetModeloPub {
	public String nome;
	public String telefone;
	public String filiacao;
	public String endereco;
	public String raca;
	public int peso;
	public String cor;
	public String sexo;
	public int idade;
	
	
	
	public PetModeloPub() {
		
	}
	public PetModeloPub(String nome, String telefone, String filiacao, String endereco, String raca, int peso, String cor, String sexo, int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.filiacao = filiacao;
		this.endereco = endereco;
		this.raca = raca;
		this.peso = peso;
		this.cor = cor;
		this.sexo = sexo;
		this.idade = idade;
	}
}


