package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Student aluno = new Student();
		
		aluno.name = teclado.nextLine();
		aluno.nota1 = teclado.nextDouble();
		aluno.nota2 = teclado.nextDouble();
		aluno.nota3 = teclado.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", aluno.finalGrade());
		
		if (aluno.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.err.printf("MISSING %.2f POINTS%n", aluno.missingPoints());
		}else {
			System.out.println("PASS");
		}
		teclado.close();
	}
}
