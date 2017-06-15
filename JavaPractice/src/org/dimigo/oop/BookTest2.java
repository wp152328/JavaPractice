package org.dimigo.oop;

public class BookTest2 {
	private void compare(){
		int a =10;
		int b = a;
		System.out.println((a == b)? true : false);
		
		Book book = new Book("미생", "윤태호");
		Book book2 =new Book2();
		System.out.print((book == book2)? true : false);
		
		book2.setTittle("자바를 잡아라");
		
		System.out.println(book.getTittle());
		System.out.println(book2.getTittle());
	}
	
	private void changePrimitive(int num){
		num+=10;
		System.out.println("changePrimitive:"+num);
	}
	private void changeReference(Book Book){
		System.out.println(Book.getTittle());
		Book = new Book("이것이 자바다");
		System.out.println(Book.getTittle());
	}
	

private void changeAttribute(Book Book) {
	System.out.println(Book.getTittle());
	Book.setTittle("이것이 자바다");
	System.out.println(Book.getTittle());
	
}
	
	public static void main(String[]args){
		BookTest2 bt = new BookTest2();
		bt.compare();
		
		System.out.println("----------------------");
		
		int num = 5;
		bt.changePrimitive(num);
		System.out.println("main:"+num);
		
		System.out.println("-----------------------");
		
		Book Book = new Book("미생");
		bt.changeReference(Book);
		System.out.println(Book.getTittle());
		
		System.out.println("-----------------------");
		
		bt.changeAttribute(Book);{
			System.out.println(Book.getTittle());
		}
		
		
}
}