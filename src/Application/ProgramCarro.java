package Application;

import entities.Carro;

public class ProgramCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Preto", "LT", 53000.00);
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Valor: " + carro1.getPreco());
		Carro carro2 = new Carro("Prata", "Hetch", 50000.00);
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Preço: " + carro2.getPreco());
		System.out.println("Total de registros: " + Carro.getTotal());
	}
}
