package lesson160404;

public class TypeCasting {

	public static void main(String[] args) {
		
//		int x = 1.3;
		double d = 1; //implicit type cast
		
		int y = (int)1.3; // explicit type cast
		int x = (int) (10.0f / 3.0f);
		
		short s = (short)1921222;
		System.out.println(Integer.toBinaryString(1921222));
		System.out.println(Integer.toBinaryString(s));
		System.out.println(s);
		
		short x1 = 10;
		short y1 = 3;
		short z = (short) (x1 * y1);
		
		
		
		
	}

}
