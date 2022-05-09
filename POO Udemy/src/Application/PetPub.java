package Application;

import entities.PetModeloPub;

public class PetPub {
	public static void main(String[] args) {
		PetModeloPub pet = new PetModeloPub("Supipa", "81 98354-5637", "Jonathan", "Rua aracia 48","Maltes", 9, "Branco","Masculino", 7);
		System.out.println("Nome: " + pet.nome);
		System.out.println("Telefone: " + pet.telefone);
		System.out.println("Responsavel: " + pet.filiacao);
		System.out.println("Endereço: " + pet.endereco);
		System.out.println("Raça: " + pet.raca);
		System.out.println("Peso: " + pet.peso);
		System.out.println("Cor: " + pet.cor);
		System.out.println("Sexo: " + pet.sexo);
		System.out.println("Idade: " + pet.idade);
		
	}
}
