package lesson160331;

public class Salary {

	final static float tax = 0.87f;
	
	public static void main(String[] args) {
		
		int salary = 20_000;
		float salaryWithoutTax = salary * tax;
		
		System.out.println("salary = " + salary);
		System.out.format("salary without tax = " + (int)salaryWithoutTax);

	}

}
