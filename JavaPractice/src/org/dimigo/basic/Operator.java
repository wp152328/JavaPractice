package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		long money = 1700000L;
		long employees = 3L;
		long storeNum = 1500L;

		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수 : " + employees + "명");
		System.out.println("점포 수 : " + String.format("%,d", storeNum) + "개");
		long sum =  money * employees * storeNum * 12L;
		
		System.out.println("연간 인건비 : " + String.format("%,d", sum)+ "원");
		  

	}

}
