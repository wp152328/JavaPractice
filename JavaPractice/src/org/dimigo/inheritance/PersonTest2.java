package org.dimigo.inheritance;

public class PersonTest2 {

	public static void main(String[] args) {
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		
		Person p = new Person("Tom");
		
		Person people[] = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(Person pp : people) {
			greeting(pp);
			System.out.println();
		}
		
//		
//		System.out.println(p);
//		System.out.println(k);
//		System.out.println(j);
//		System.out.println(c);
//		System.out.println();
//		p.sayHello();
//		k.sayHello();
//		j.sayHello();
//		c.sayHello();
//		System.out.println();
//		p.sayBye();
//		k.sayBye();
//		j.sayBye();
//		c.sayBye();
		

	}
	private static void greeting(Person pp) {
		System.out.println(pp);
		pp.sayHello();
		pp.sayBye();
	}
}
