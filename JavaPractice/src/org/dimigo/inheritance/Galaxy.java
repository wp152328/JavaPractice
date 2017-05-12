package org.dimigo.inheritance;

public class Galaxy extends SmartPhone{
	public Galaxy() {};
	public Galaxy(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
		
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다");	
	}
	
	public void turnOn() {
		System.out.println("갤럭시 s8 의 전원을 켭니다");
	}
	public void turnOㄹ() {
		System.out.println("갤럭시 s8 의 전원을 끕니다");
	}
	
	public void useWirelessCharging() {
		System.out.println("무선 충전 기능을 사용합니다");
	}
	
	
}
