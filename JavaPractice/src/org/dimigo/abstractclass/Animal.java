package org.dimigo.abstractclass;

public abstract class Animal {
	//추상클래스 서넌 
	//내 자신 객체는 못 만듬 ( ,new Animal() 불가)
	//반드시 나를 상속받아 자식 객체를 만들어 쓰라
	
	public String name;
	
	
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println("냠남");
	} 
	
	public void sleep() {
		System.out.println("쿨쿨");
	}
	
//	public void bark() {
//		System.out.println("...");
//	}
	public abstract void bark();
	
	public String toString() {
		return "제 이름은 " + name + " 입니다";
	}
	
}
