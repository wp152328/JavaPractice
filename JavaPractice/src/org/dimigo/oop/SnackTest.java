package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		Snack[] SnackArr = new Snack[3]; 
		SnackArr[0] = new Snack("새우깡", "농심", 1100, 2);
		SnackArr[1] = new Snack("콘칲", "크라운", 1200, 1);
		SnackArr[2] = new Snack("허니버터칩", "해태", 1500, 4);
		
		System.out.println(SnackArr[0].toString());
		System.out.println();
		System.out.println(SnackArr[1].toString());
		System.out.println();
		System.out.println(SnackArr[2].toString());
		System.out.println();
		System.out.println("총 구매 금액 : " + String.format("%,d", SnackArr[0].calcPrice() + SnackArr[1].calcPrice() + SnackArr[2].calcPrice()) + "원");
	}

}
