package entities;

public class Filme {
	private int id;
	private String filme;
	private String categoria;
	private String tempo;
	
	public Filme() {}
	
	public Filme(int id, String filme, String categoria, String tempo) {
		this.id = id;
		this.filme = filme;
		this.categoria = categoria;
		this.tempo = tempo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
}