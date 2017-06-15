package org.dimigo.oop;

public class Book {
	
	private String tittle = "미생";
	private String author = "윤태호";
	private int page = 1000;
	
	public String getTittle() {
		return tittle;
	}
	public String getAuthor() {
		return author;
	}
	public int getPage() {
		return page;
	}
	
	public Book(String tittle, String author, int page) {
		this.tittle = tittle;
		this.author = author;
		this.page = page;
	}
	
	public void setTittle(String newTittle) {
		tittle = newTittle;
	}
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	
	public Book(String tittle, String author) {
		System.out.println("매개변수 2개짜리 생성자");
		this.tittle = tittle;
		this.author = author;
	}
	
	public Book(String title) {
		this(title, "저자 미상");
		
	}
	
	public void setPage(int newPage) {
			if(newPage >= 1) {
				page = newPage;
			}
	}
	
	public String toString() {
		return  "책제목 :" + tittle + "저자 :" + author;

	}
	
	
}