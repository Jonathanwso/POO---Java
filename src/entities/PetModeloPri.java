package entities;

public class PetModeloPri {
	private String nome;
	private String telefone;
	private String filiacao;
	private String endereco;
	private String raca;
	private int peso;
	private String cor;
	private String sexo;
	private int idade;
	
	
	
	public PetModeloPri() {
		
	}
	public PetModeloPri(String nome, String telefone, String filiacao, String endereco, String raca, int peso, String cor, String sexo, int idade) {
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
