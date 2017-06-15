package org.dimigo.oop;

public class Teacher extends Person{
	private String subject;

	
	public Teacher(String name, int age, int height, int weight, String subject) {
		super(name, age, height, weight);
	}


	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "], " + super.toString();
	}
	
	public void teach() {
		System.out.println(getName() + "선생님께서 수업을 하신다");
	}
	
	public void doTask() {
		System.out.println(getName() + "선생님께서 업무를 보신다");
	}
	
}
