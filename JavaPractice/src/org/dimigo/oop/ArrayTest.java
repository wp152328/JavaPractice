package org.dimigo.oop;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] src = {"MS", "Apple", "Lenovo", "구보 5바퀴", "HP"};
		System.out.println(Arrays.toString(src));
		
		
		
		String[] dest = Arrays.copyOf(src, src.length - 2);
		System.out.println(Arrays.toString(dest));
		
		System.out.println(src);
		System.out.println(dest);
		
		System.out.println(Arrays.equals(src,  dest));
		
		Arrays.sort(dest);
		System.out.println(Arrays.toString(dest));
		System.out.println(Arrays.binarySearch(dest, "Lenovo"));
		
		System.out.println(Arrays.toString(args));
		String num1 = args[0];
		String num2 = args[1];
		System.out.println(num1 + num2);
		
	}

}
