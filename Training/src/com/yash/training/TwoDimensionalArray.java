package com.yash.training;

public class TwoDimensionalArray {
	public static void main(String[] args) {

		int arr[][] = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;

			}

			for (int brr[] : arr) {
				for (int x : brr) {
					System.out.print(x + " ");
					System.out.println();
				}
			}
		}

	}

}
