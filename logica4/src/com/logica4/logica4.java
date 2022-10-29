package com.logica4;

import java.util.Arrays;

public class logica4 {

	public static void Array2D(int... a) {
		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			}
		}
		
		 for (int i = 0; i < arr.length; i++) {
	            System.out.println("arr" + i + ": " + Arrays.toString(arr[i]));
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2D();
	}

}
