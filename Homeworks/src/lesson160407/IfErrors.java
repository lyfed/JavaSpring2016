package lesson160407;

public class IfErrors {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("No args!");
			System.exit(0);
		}

		System.out.println("args[0] = " + args[0]);

		int x = 1;

		/*
		 * if (x){ - only boolean is possible // }
		 */

		// if (x=2){} - take into account that comparison is '==' not '='

		if (2 == x) { // to avoid the problem above
			// ...
		}

	}

}
