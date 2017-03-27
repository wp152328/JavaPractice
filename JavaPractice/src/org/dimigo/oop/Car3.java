package org.dimigo.oop;

public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int  getPrice() {
		return price;
	}
	
	public void setCompany(String Company) {
		this.company = Company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void  setPrice(int price) {
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this(company,model,color,maxSpeed);
		setPrice(price);
	}
	
	public Car3(String company, String model, String color) {
		setCompany(company);
		setModel(model);
		setColor(color);
	}
	
	public Car3(String company, String model, String color, int maxSpeed) {
		this(company,model,color);
		setMaxSpeed(maxSpeed);
	}
	
	
}
