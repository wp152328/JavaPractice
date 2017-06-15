package org.dimigo.basic;
import java.util.Random;
import java.util.Scanner
public class Condition {

	public static void main(String[] args) {
		int age = 17;
		//19세 이상이면"투표하러 가세요", 미만이면 "
		if(age >= 19) {
			System.out.println("투표하러 가세요 ");
		} else {
			System.out.println("선거권이 없네요");
		}
		
		 System.out.println(new Random().nextInt(6)+1);
		int num = 4;
		switch (num % 2) {
		case 1 : System.out.println("짝수입니다"); break;
		case 2 : System.out.println("홀수입니다"); break;
		
		}
		
		String menu = "짬뽕";
		
		switch (menu) {
		case "짬뽕" : 
			System.out.println("짬뽕"); break;
		case "짜장면" :
			System.out.println("짜장면");break;
		default : 
			System.out.println("넌 누구냐!");
			
		}
		
		
		
		
		
		
	}
	
	
}
