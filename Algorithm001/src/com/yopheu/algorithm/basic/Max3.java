package com.yopheu.algorithm.basic;

public class Max3 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		int num3 = (int)(Math.random() * 101);
		
		System.out.printf("num1 : %d, num2 : %d, num3 : %d\n", num1, num2, num3);
		
		// 최댓값
		int max = num1;
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		
		System.out.println(" Max : " + max);
	}
}
