package Application;

import java.util.*;
import java.util.Scanner;
import entities.Pet;
public class PetProgram {

	public static void main(String[] args) {
		ArrayList<Pet>lista = new ArrayList<Pet>();
		
		Scanner teclado = new Scanner(System.in);
		int op = 1;
		int registro = 0;
		int numero = 0;
		
		while (op !=0) {
			System.out.println("SISTEMA CADASTRO DE PET");
			System.out.println("1 - Cadastrar PET");
			System.out.println("2 - Listar Pets Cadastrados");
			System.out.println("3 - Remover PET");
			System.out.println("4 - Registros");
			System.out.println("0 - Sair");
			System.out.println("Opção: ");
			op = teclado.nextInt();
			if (op == 1) {
				registro ++;
				teclado.nextLine();
				System.out.print("Nome: ");
				String nome = teclado.nextLine();
				System.out.print("Telefone Responsavel: ");
				String telefone = teclado.nextLine();
				System.out.print("Responsavel: ");
				String filiacao = teclado.nextLine();
				System.out.print("Endereço: ");
				String endereco = teclado.nextLine();
				System.out.print("Raça: ");
				String raca = teclado.nextLine();
				System.out.print("Peso: ");
				String peso = teclado.nextLine();
				System.out.print("Cor: ");
				String cor = teclado.nextLine();
				System.out.print("Sexo: ");
				String sexo = teclado.nextLine();
				System.out.print("Idade: ");
				String idade = teclado.nextLine();
				System.out.print("Data de Entrada: ");
				String entrada = teclado.nextLine();
				System.out.print("Data de Saida: ");
				String saida = teclado.nextLine();
				Pet cadastro = new Pet(registro, nome, telefone, filiacao, endereco, raca, peso, cor, sexo, idade, entrada,saida);
				lista.add(cadastro);
				System.out.println("Pet Cadastrado");
				}else if (op == 2) {
					System.out.println("=========================");
					for (Pet pet : lista) {
						System.out.println("ID: " + pet.getId());
						System.out.println("Nome: " + pet.getNome());
						System.out.println("Telefone Responsavel: " + pet.getTelefone());
						System.out.println("Nome Responsavel: " + pet.getFiliacao());
						System.out.println("Endereço: " + pet.getEndereco());
						System.out.println("Raça: " + pet.getRaca());
						System.out.println("Peso: " + pet.getPeso());
						System.out.println("Cor: " + pet.getCor());
						System.out.println("Sexo: " + pet.getSexo());
						System.out.println("Idade: " + pet.getIdade());
						System.out.println("Data de entrada: " + pet.getEntrada());
						System.out.println("Data da saida: " + pet.getSaida());
					}
				}else if (op == 3) {
					System.out.println("Informe o INDEX de 0 - N");
					numero = teclado.nextInt();
					registro --;
					System.out.println("Dados excluidos");
				}else if (op == 4) {
					System.out.println("Registros: " + registro);
				}else if (op == 0) {
					break;
				}else {
					System.out.println("==== Sistema Finalizado =====");
				}
			}
		
		}
	}

