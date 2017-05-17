package org.dimigo.abstractclass;

public abstract class SmartPhone {
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
		System.out.println(model + "의 전원을 끕니다");
	}
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다");
	}
	
	public abstract void pay(); 
	
	public void useSpecialFunction() {
		if(this instanceof IPhone) {
		((IPhone) this).useAirDrop();
		} else {
			((Galaxy) this).useWirelessCharging();
		}
	}
	
	public String toString() {
		return "모델명 : " + this.model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d", price);
	}
	
	
}
