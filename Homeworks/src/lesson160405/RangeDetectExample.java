package lesson160405;

import java.util.Arrays;

public class RangeDetectExample {

	public static void main(String[] args) {
		
		if (args.length == 0){
			System.out.println("Usage: <number to check>");
			System.exit(1);
		}
		
		String listOfArgs = args.toString();
		
		System.out.println(listOfArgs);
		
		String number = args[0];
		
		int x = Integer.parseInt(number);
		
		if (x >= 10 && x <= 20) {
			System.out.println("Попал");
		}
		else {
			System.out.println("Мимо");
		}
		
	}

}
