package org.dimigo.basic;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT", "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("--<<멜론 차트>>--");
		printList(list);
		
		list.add(1, new Music("SIGNAL", "트와이스"));
		System.out.println("--<<2위 곡 추가>>--");
		printList(list);
		
		list.add(new Music("팔레트", "아이유"));
		System.out.println("--<<3위 곡 추가>>--");
		printList(list);

		list.remove(1);
		System.out.println("--<<2위 곡 삭제>>--");
		printList(list);

		list.clear();
		System.out.println("--<<전체 리스트 삭제>>--");
		printList(list);

	}

	public static void printList(List<Music> list) {
		for (int i = 0, l = list.size(); i < l; i++) {
			System.out.print(i + 1);
			System.out.println(". " + list.get(i));
		}
		System.out.println();
	}

}
