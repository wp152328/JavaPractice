package org.dimigo.inheritance;

public class SmartPhone {
	String model;
	String company;
	int price;
	
	public SmartPhone(){};
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOff() {
//		System.out.println(model + "의 전원을 끕니다");
	}
	public void turnOn() {
//		System.out.println(model + "의 전원을 켭니다");
	}
	
	public void pay() {
		
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(phone instanceof IPhone) {
		((IPhone) phone).useAirDrop();
		} else {
			((Galaxy) phone).useWirelessCharging();
		}
	}
	
	public String toString() {
		return "모델명 : " + this.model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price);
	}
	
	
}
