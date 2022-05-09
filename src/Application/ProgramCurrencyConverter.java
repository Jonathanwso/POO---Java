package Application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCurrencyConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("What is the dollar price? ");
		double price = teclado.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double quantity = teclado.nextDouble();
		
		double total = price * quantity;
		System.out.println("total = " + total);
		System.out.printf("IOF 6%% = %.2f%n", CurrencyConverter.iof(price, quantity));
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.currencyConverter(price, quantity, total));
		
		teclado.close();
	}
}
