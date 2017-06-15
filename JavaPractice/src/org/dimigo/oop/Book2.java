package org.dimigo.oop;

public class Book2 {
	private String tittle;
	private String author;
	private int page;
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Book2(String tittle, String author, int page) {
		super();
		this.tittle = tittle;
		this.author = author;
		this.page = page;
	}
	
}
