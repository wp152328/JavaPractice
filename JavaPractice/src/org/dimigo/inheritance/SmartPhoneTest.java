package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone phone[] = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 s8", "삼성", 800000),
		};
		
		for(SmartPhone i : phone) {
			System.out.println(i);
			i.turnOn();
			i.pay();
			i.useSpecialFunction(i);
			i.turnOff();
			System.out.println();
		}
		

	}
	
	

}
