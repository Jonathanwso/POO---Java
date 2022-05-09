package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero da conta: ");
		int conta = teclado.nextInt();
		System.out.println("Digite o nome do titular: ");
		String nome = teclado.next();
		System.out.println("Ira ter depoisto inicial? s ou n");
		char valorI = teclado.next().charAt(0);
		Conta contaC = new Conta(conta, nome);
		
		
		switch (valorI) {
		case 's':
			System.out.println("Valor do deposito: ");
			double valorD = teclado.nextDouble();
			contaC.saldoD(valorD);

		}
		System.out.println("Dados da conta: ");
		System.out.println(contaC);
		
		System.out.println();
		System.out.println("Entre com o valor do deposito: ");
		double deposito = teclado.nextDouble();
		contaC.depositoC(deposito);
		System.out.println("Dados da conta: ");
		System.out.println(contaC);
		
		System.out.println("Entre com o valor do saque: ");
		double saque = teclado.nextDouble();
		contaC.saqueC(saque);
		System.out.println("Dados da conta: ");
		System.out.println(contaC);
		System.out.println("Contas Registrada: " + Conta.getRegistros());
		
		teclado.close();
	}
}
