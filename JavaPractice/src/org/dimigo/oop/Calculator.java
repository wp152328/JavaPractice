package org.dimigo.oop;

public class Calculator {
	private int num1, num2;
	private boolean powerflag = false;
	
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public static void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
	public static void powerOff() {
		System.out.println("전원이 꺼졌습니다");
	}	
	
	public static int add(int num1, int num2, Calculator calc){
		calc.powerOn();
	
	return num1 + num2;	
	}
	
	public static int sub(int num1, int num2, Calculator calc) {
			calc.powerOn();
		return num1 - num2;
	}
	
	
	public static int mul(int num1, int num2, Calculator calc) {
			calc.powerOn();
			
		return num1 * num2;
	}
	
	public static double div(int num1, int num2, Calculator calc) {
			calc.powerOn();
		return (double) num1 / num2;
	}
	
}
