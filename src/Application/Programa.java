package Application;

import java.util.*;
import java.util.Scanner;


import entities.Filme;

public class Programa {

	public static void main(String[] args) {
		ArrayList <Filme> lista = new ArrayList<Filme>();
		
		Scanner teclado = new Scanner(System.in);
		int op = -1;
		int registro = 0;
		int numero = 0;
		
		while (op !=0) {
			System.out.println("SISTEMA CADASTRO 1.0");
			System.out.println("1 - Inserir Filme");
			System.out.println("2 - Listar Catálogo");
			System.out.println("3 - Remover Filme");
			System.out.println("4 - Quantidade de Filme");
			System.out.println("0 - Sair");
			System.out.println("Opção: ");
			op = teclado.nextInt();
			if (op == 1) {
				registro ++;
				teclado.nextLine();
				System.out.print("Filme: ");
				String filme = teclado.nextLine();
				System.out.print("Categoria: ");
				String categoria = teclado.nextLine();
				System.out.print("Tempo: ");
				String tempo = teclado.nextLine();
				Filme cadastro = new Filme(registro, filme,categoria, tempo);
				lista.add(cadastro);
				System.out.println("Filme adicionado no catalogo");
			}else if (op == 2) {
				System.out.println("==========================");
				for (Filme filme : lista) {
					System.out.println("ID: " + filme.getId());
					System.out.println("File: " + filme.getFilme());
					System.out.println("Categoria: " + filme.getCategoria());
					System.out.println("Tempo: " + filme.getTempo());
					System.out.println("==================================");
				}
			}else if (op == 3) {
				System.out.println("Informe o INDEX de 0 - N: ");
				numero = teclado.nextInt();
				lista.remove(numero);
				registro --;
				System.out.println("Filme removido do catalogo");
			}else if (op == 4) {
				System.out.println("Quantidade: "+registro);
			}else if (op == 0) {
				break;
			}else {
				System.out.println("Opção não encontrada");
			}
		}
		System.out.println("=== Fim do Programa =====");
	}
}
