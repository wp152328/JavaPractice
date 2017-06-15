package org.dimigo.oop;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		Calculator calc = new Calculator(a ,b);
		
		System.out.printf("%d + %d = %d\n",a, b, Calculator.add(a, b, calc));
		System.out.printf("%d * %d = %d\n",a, b, Calculator.sub(a, b, calc));
		System.out.printf("%d * %d = %d\n",a, b, Calculator.mul(a, b, calc));
		System.out.printf("%d / %d = %.1f\n", a, b, Calculator.div(a,b, calc));
		
		Calculator.powerOff();
		
	}

}
