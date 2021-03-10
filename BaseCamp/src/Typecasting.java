
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long longNumber=200L;
		float floatNumber=123.5F;
		double doubleNumber=12.5;
		
		doubleNumber=floatNumber;
		
		longNumber=(long)floatNumber;
		
		System.out.println(doubleNumber);
		System.out.println(longNumber);
		
	}

}
