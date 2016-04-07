package lesson160407;

public class SwitchStatement {

	public static void main(String[] args) {

		if (args == null) {
			return;
		}

		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}

		int num = Integer.parseInt(args[0]);

		switch (num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		case 0:
			System.out.println("zero");
			break;
		default:
			System.out.println("please enter a digit");
		}

	}

}
