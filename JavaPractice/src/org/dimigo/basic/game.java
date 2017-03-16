package org.dimigo.basic;
import java.util.Random;
import java.util.Scanner;
public class game {
		
	public static void main(String[] args) {
		String charactor[] = {"영주", "마법사", "농민", "기사"};
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		int attack = 100;
		while(a != 9) {
			System.out.println("-----------");
			System.out.println("<<게임 매뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료 ");
			System.out.println("-----------");
			
			a = scanner.nextInt();
			Random random = new Random();
			switch (a) {
			
			case 1 : attack = attack + 10; System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + attack); break;
			case 2 : attack = attack - 10; System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + attack); break;
			case 3 : int test = random.nextInt(4); System.out.println(charactor[test] + "(으)로 결정되었습니다.");
			break;
			case 9 : System.out.println("이제 공부하세요!"); break;
			default : System.out.println("없는 메뉴입니다!!"); break;
			}
		}

	}

}
