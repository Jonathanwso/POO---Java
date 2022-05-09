package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Rectangle rectangle;
		rectangle = new Rectangle();
		
		System.out.println("Enter rectangle Width and Height: ");
		rectangle.width = teclado.nextDouble();
		rectangle.height = teclado.nextDouble();
		
		double area = rectangle.area();
		System.out.printf("Area = %.2f%n", area);
		
		double perimeter = rectangle.Perimeter();
		System.out.printf("Perimeter = %.2f%n", perimeter);
		
		double diagonal = rectangle.Diagonal();
		System.out.printf("Diagonal = %.2f", diagonal);
		
		teclado.close();
	}
}
