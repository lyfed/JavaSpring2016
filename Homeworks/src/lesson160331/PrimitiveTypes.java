package lesson160331;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		byte b = 1; // 8 bits == 1 byte
		b = Byte.MAX_VALUE;
		b = Byte.MIN_VALUE;
		
		short s = 34; // 16 bits == 2 bytes
		s = Short.MAX_VALUE;
		s = Short.MIN_VALUE;
		
		int i = 10; // 32 bits == 4 bytes
		i = Integer.MAX_VALUE;
		i = Integer.MIN_VALUE;
		
		long l = 12L; // 64 bits == 8 bytes
		l = Long.MAX_VALUE;
		l = Long.MIN_VALUE;
		
		char c = 12; // 16 bits == 2 bytes
		c = Character.MAX_VALUE;
		System.out.println(c);
		c = Character.MIN_VALUE;
		c = 65; c++;
		System.out.println(c);
		
		float f = 24.3f; // 32 bits == 4 bytes
		f = 10E2f;
		f = Float.MAX_VALUE;
		f = Float.MIN_VALUE;
		
		double d = 12E-1; // 64 bits == 8 bytes
		d = Double.MAX_VALUE;
		d = Double.MIN_VALUE;
		
		boolean bol = true;
		bol = false;
		

	}

}
