package org.dimigo.oop;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int 타입 배열 선언
		int[] intArr = null;
		
//		int 타입 배열 생성
		intArr = new int[5];
		ArrayBasic obj = new ArrayBasic();
		obj.printArray(intArr);
		
		intArr[3] = 100;
		
		// 배열 선언과 동시에 초기화하기
//		int[] intArr2 = {1, 2, 3, 4, 5};
//		int[] intArr2 = new int[] {1, 2, 3, 4, 5 };
		int[] intArr2 = null;
		intArr2 = new int[] {1, 2, 3, 4, 5 };
		obj.printArray(intArr2);
		
//		String 타입 배열 생성
		String[] strArr = new String[3];
		obj.printArray(strArr);
		strArr[0] = "EXO";
		strArr[1] = "DaftPunk";
		strArr[2] = "Weeknd";
		
		Book[] bookArr = new Book[2];
		
		bookArr[0] = new Book("미생", "윤태호", 1000);
		bookArr[1] = new Book("자바의 신", "나자바", 2000);
		obj.printArray(bookArr);
		
		Book[] bookArr2 = {
			new Book("남한산성", "김", 500),	
		};
		obj.printArray(bookArr2);
		
		String[] strArr3 = {"paris", "newYork", "seoul"};
//		strArr3 = new String[] {"서울", "뉴욕", "파리"};
		
		int[] intArr3 = new int[3];
		System.out.println(intArr[3]);
		int [] scores = {100, 90, 80};
		int sum = 0;
//		for(int score : scores) {
//			sum += score;
//		}
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 : "+ sum);
		System.out.println("평균 : "+ sum/scores.length);
		
		int[] numbers = null;
		numbers = new int[0];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		
	}

	private void printArray(Book[] bookArr) {
		for (Book value : bookArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
		
	}

	private void printArray(String[] strArr) {
		for (String value : strArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
		
	}

	private void printArray(int[] intArr) {
		for (int value : intArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
	}

}
