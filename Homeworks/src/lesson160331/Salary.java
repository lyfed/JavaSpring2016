package lesson160331;

public class Salary {

	final static float TAX = 0.87f;
	
	public static void main(String[] args) {
		
		int salary = 20_000;
		float salaryWithoutTax = salary * TAX;
		
		System.out.println("salary = " + salary);
		System.out.println("salary without tax = " + (int)salaryWithoutTax);

	}

}
