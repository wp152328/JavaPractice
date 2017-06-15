package org.dimigo.oop;

public class WrapperTest {

	public static void main(String[] args) {
		//int -> Integer Wrapper 클래스
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.toHexString(10));
		
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		System.out.println(obj1 == obj2); 
		System.out.println(obj1.equals(obj2));
		
		Integer obj3 = Integer.valueOf(100);
		Double obj4 = Double.valueOf("3.14");
		int i1 = obj1.intValue();
		Double d1 = obj4.doubleValue();
		
		Double.parseDouble("3.14");
		
		int i2 = Integer.parseInt(args[0]);
		int i3 = Integer.parseInt(args[1]);
		System.out.printf("%d + %d = %d\n", i2, i3, i2 + i3);
		
		Integer obj5 = 100;
		
		System.out.println(obj5 + 100);
		
		Integer a = 10;
		Integer b = a + 20;
		Integer result = a + b;
		
		
		
		
	}

}
