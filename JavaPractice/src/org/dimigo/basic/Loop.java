package org.dimigo.basic;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}
		
		int[] arr = {1,2,3,4,5};
		for(i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int v : arr) {
			System.out.println(v);
		}
		
		String[] Twice = {"나연", "사나", "쯔위", "정연"};
		for(String v : Twice) {
			System.out.println(v);
		}
		
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("<<menu>>");
			System.out.println("1. chickin");
			System.out.println("2. pizza");
			System.out.println("9, end");
			System.out.println("your choice??");
			
			choice = scanner.nextInt();
			switch (choice) {
			case 1 : System.out.println("chicken"); break;
			case 2 : System.out.println("2. pizza"); break;
			case 9 :  System.out.println("bye!"); scanner.close(); break;
			default : System.out.println("no exist");
			}
		
		} while(choice != 9);
		
	}

}
