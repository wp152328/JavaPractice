package org.dimigo.oop;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		String[] questions = {"가수", "배우", "과목"};
		String[] answers = {"Daft Punk", "뚜비", "physics"};
		for(int i = 0; i < 3; i++) {
			System.out.println("가장 좋아하는" + questions[i] + "는?");
			answer = scanner.nextLine();
			if(answer.equals(answers[i])) {
				System.out.println("정답입니다!");
			} else {
				System.out.println("틀렸습니다!");
			}
		}
		
			for (int i = 0; i < 3; i++) {
				StringBuilder sb = new StringBuilder("가장 좋아하는");
				//test += "def";
				sb.append(questions[i]).append("는?").append(answers[i]).append("입니다.");
				System.out.println(sb);
			}
		
		
	}

}
