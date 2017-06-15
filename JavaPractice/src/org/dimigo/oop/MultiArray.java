package org.dimigo.oop;

public class MultiArray {

	public void printArr (int[][] arr) {
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[][] intArr = new int[2][3];
		MultiArray obj = new MultiArray();
		
		obj.printArr(intArr);
		intArr[1][2] = 100;
		obj.printArr(intArr);
		
		String[][] strArr = new String[2][];
		strArr[0] = new String[3];
		strArr[1] = new String[2];
		obj.printArr(strArr);
		strArr[0][0] = "선린고";
		strArr[0][1] = "대마고";
		strArr[0][2] = "디미고";
		strArr[1][0] = "박보영";
		strArr[1][1] = "트와이스";
		
		obj.printArr(strArr);
		
		int[][] intArr2 = {
				{1,2,3},
				{4,5,6},
		};
		obj.printArr(intArr2);
		
		int[][] Arr3 = {
				new int[]{1,2,3},
				new int[]{4,5,6},
		};
		
		obj.printArr(Arr3);
		
		int[][] Arr4 = new int[][]{
				{1,2,3},
				{4,5,6},
		};
		
		obj.printArr(Arr4);
		
	}

	private void printArr(String[][] strArr) {
		for(int i = 0; i < strArr.length ; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
			System.out.print(strArr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
