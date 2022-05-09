package Application;

import entities.PetModeloPri;

public class PetPri {

	public static void main(String[] args) {
		PetModeloPri pet = new PetModeloPri();
		pet.setNome("Belatrix");
		pet.setTelefone("84 99976-2077");
		pet.setFiliacao("Will");
		pet.setEndereco("Rua aracia 48");
		pet.setRaca("Lhasa Apso");
		pet.setPeso(8);
		pet.setCor("Preta");
		pet.setSexo("Feminino");
		pet.setIdade(3);
		
		
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Telefone: " + pet.getTelefone());
		System.out.println("Responsavel: " + pet.getFiliacao());
		System.out.println("Endereço: " + pet.getEndereco());
		System.out.println("Raça: " + pet.getRaca());
		System.out.println("Idade: " + pet.getIdade());
		System.out.println("Cor: " + pet.getCor());
		System.out.println("Sexo: " + pet.getSexo());
		System.out.println("Idade: " + pet.getIdade());
	}
}
