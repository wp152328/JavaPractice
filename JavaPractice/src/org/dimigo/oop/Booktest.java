package org.dimigo.oop;

public class Booktest {

	public static void main(String[] args) {
		Book Book = new Book();
		System.out.println(Book.getTittle());
		System.out.println(Book.getAuthor());
		System.out.println(Book.getPage());
		
		Book Book2 = new Book();
		System.out.println(Book2.getTittle());
		System.out.println(Book2.getAuthor());
		System.out.println(Book2.getPage());
		Book2.setTittle("this is Java");
	}

}
