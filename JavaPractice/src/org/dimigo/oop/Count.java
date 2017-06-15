package org.dimigo.oop;

public class Count {
	
	private static int count;
	
	public Count() {
		count++;
	}
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			Count c = new Count();
		}
		System.out.println(Count.count);
	}
}