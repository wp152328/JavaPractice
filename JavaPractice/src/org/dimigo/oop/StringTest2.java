package org.dimigo.oop;

public class StringTest2 {

	public static void main(String[] args) {
		// 1.String으로 문자열 추가하기
		String str = "디미고 ";
		str += "2학년 ";
		str += "3반 ";
		str += "28번 ";
		str += "정의진";
		System.out.println(str);
		
		//2. StringBuilder로 문자열 추가하기
		StringBuilder sb = new StringBuilder("디미고");
//		sb.append("2학년");
//		sb.append("3반");
//		sb.append("28번");
//		sb.append("정의진");
		sb.append("2학년").append("3반").append("1번").append("나자바");
		
		System.out.println(sb.toString());
		System.out.println(sb);
		//tostring() 메소드가 있으면 자동으로 toString()이 호출됨
		//toString() 메소드가 없으면 hashcode 출
		Book book = new Book("미생", "윤태호", 100);
		System.out.println(book);
	
	//속도비교메소드
	new StringTest2().compareSpeed();
}
	private void compareSpeed() {
		long start = System.currentTimeMillis();
		
		String test = "abc";
		StringBuilder sb = new StringBuilder("abc");
		for (int i = 0; i < 1000000; i++) {
			//test += "def";
			sb.append("def");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
	}
}