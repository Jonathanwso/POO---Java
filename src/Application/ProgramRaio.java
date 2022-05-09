package Application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramRaio {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = teclado.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		teclado.close();
	}
	
}
