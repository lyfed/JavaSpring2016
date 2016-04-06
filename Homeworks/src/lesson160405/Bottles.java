package lesson160405;

public class Bottles {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage: <number of bottles>");
			System.exit(0);
		}

		int number = Integer.parseInt(args[0]);

		if (number == 1) {
			System.out.println("В самый раз");
		} else if (number == 2) {
			System.out.println("Много");
		} else if (number == 5) {
			System.out.println("Мало");
		} else {
			System.out.println("Не известно");
		}

	}

}
