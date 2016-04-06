package lesson160405;

import java.util.Arrays;

public class EvenOddExample {

	public static void main(String[] args) {
		
		if (args.length == 0){
			System.out.println("Usage: <number to check>");
			System.exit(1);
		}
		
		String listOfArgs = args.toString();
		
		System.out.println(listOfArgs);
		
		String number = args[0];
		
		int x = Integer.parseInt(number);
		
		if (x % 2 == 0){
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}

}
