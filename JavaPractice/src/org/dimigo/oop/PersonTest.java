package org.dimigo.oop;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("아이유", 25, 162, 45);
		System.out.println(p);
		p.eat();
		p.sleep();
		
		Student s = new Student("변기훈", 18, 185, 66, "2313");
		System.out.println(s);
		s.eat();
		s.sleep();
		s.study();
		s.eatSnack();

		Teacher t = new Teacher("혀관무", 46, 172, 70, "문학");
		System.out.println(t);
		t.eat();
		t.sleep();
		t.doTask();
		t.teach();
		
	}

	
	
	
}
