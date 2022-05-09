package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = teclado.nextLine();
		System.out.print("Price: ");
		double price = teclado.nextDouble();
		System.out.print("Quantity: ");
		int quantity = teclado.nextInt();
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		product.setName("Computer");
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update Price: " + product.getPrice());
		
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = teclado.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = teclado.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Update data: " + product);
		
		teclado.close();
	}
}
