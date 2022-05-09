package entities;

public class Pet {
	private int id;
	private String nome;
	private String telefone;
	private String filiacao;
	private String endereco;
	private String raca;
	private String peso;
	private String cor;
	private String sexo;
	private String idade;
	private String entrada;
	private String saida;
	
	
	
	public Pet() {
		
	}
	public Pet(int id, String nome, String telefone, String filiacao, String endereco, String raca, String peso, String cor, String sexo, String idade, String entrada, String saida) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.filiacao = filiacao;
		this.endereco = endereco;
		this.raca = raca;
		this.peso = peso;
		this.cor = cor;
		this.sexo = sexo;
		this.idade = idade;
		this.entrada = entrada;
		this.saida = saida;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
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
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSaida() {
		return saida;
	}
	public void setSaida(String saida) {
		this.saida = saida;
	}
}
