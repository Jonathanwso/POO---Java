package util;

public class CurrencyConverter {

	public static double iof(double price, double quantity) {
		return (price * quantity) * (6.0 / 100);
	}
	public static double currencyConverter(double price, double quantity, double total) {
		return (price * quantity) * (6.0 / 100) + total;
	}
}
