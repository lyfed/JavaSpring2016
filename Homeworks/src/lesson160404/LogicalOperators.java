package lesson160404;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int y = 5;
		
		boolean x = true || (y < 4); // short operator, once first counted second can be omitted
		boolean x2 = true | (y < 4); // full operator
		boolean a = true, b = false;
		
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);
		
		
	  /*x = null;
		
		if (x!=null && x.getValue() < 5){
			//do smth
		}*/
		
		

	}

}
