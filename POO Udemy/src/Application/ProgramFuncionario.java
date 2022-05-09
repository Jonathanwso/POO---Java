package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = teclado.nextLine();
		System.out.print("Gross Salary: ");
		funcionario.GrossSalary = teclado.nextDouble();
		System.out.print("Tax: ");
		funcionario.Tax = teclado.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcionario);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = teclado.nextDouble();
		funcionario.IncreaseSalary(percentage);
	
		System.out.println();
		System.out.println("Update data: " + funcionario);
		teclado.close();
	}
}
