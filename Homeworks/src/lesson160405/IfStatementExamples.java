package lesson160405;

public class IfStatementExamples {

	public static void main(String[] args) {
		
		int x = 20;
		int y = 30;
		
		if (x < y)
			System.out.println("less");
		else
			System.out.println("greater");

		boolean isLessThan = x < y;
		
		if (isLessThan) {
			System.out.println("Just print anything");
			System.out.println("less");
		}
		else
			System.out.println("greater");

	}

}
