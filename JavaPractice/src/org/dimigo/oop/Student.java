package org.dimigo.oop;

public class Student extends Person {
	private String studentId;

	public Student(String name, int age, int height, int weight, String studentId) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		this.weight = weight;
		super(name, age, height, weight);
		
		this.studentId = studentId;
	}
	
	public void study() {
//		System.out.println(super.name);
		
		System.out.println(getName() + "학생이 공부 중입니다");
	}
	public void eatSnack() {
		System.out.println(getName() + "학생이 과자를 먹습니다");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "], " + super.toString();
	}


	
}
