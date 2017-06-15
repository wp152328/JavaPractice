package org.dimigo.oop;

public class StringTest {

	public static void main(String[] args) {
		String dog1 = "초코";
		String dog2 = "초코";
		System.out.println(dog1 == dog2);
		
		
		String cat1 = new String("이브");
		String cat2 = new String("이브");
		System.out.println(cat1 == cat2);
		
		
		System.out.println(dog1 = "초코");
		System.out.println(cat1 == "이브");
		
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1.equals(cat2));
		
		String id = null;
		if("admin".equalsIgnoreCase(id)) {
			System.out.println("관리자");
		} else {
			System.out.println("일반 사용자");
		}
		
		StringTest st = new StringTest();
		new StringTest().testStringMethod;
		

	}
	private void testStringMethod() {
		String s = "abcdefgABCDEFG";
		
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println("[" + "            ABC            ".trim() + "]");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("abc"));
		System.out.println(s.endsWith("FGH"));
		
	}

}
