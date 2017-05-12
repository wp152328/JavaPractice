package org.dimigo.inheritance;

public class IPhone extends SmartPhone{
	public IPhone() {};
	public IPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
		
	}
	
	public void pay() {
		System.out.println("에플 페이로 결제합니다");	
	}
	
	public void turnOn() {
		System.out.println("iPhone 7 의 전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("iPhone 7 의 전원을 끕니다");
	}
	
	public void useAirDrop() {
		System.out.println("AirDrop 기능을 사용합니다");
	}
	
}
