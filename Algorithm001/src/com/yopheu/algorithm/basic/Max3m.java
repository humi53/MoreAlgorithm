package com.yopheu.algorithm.basic;

public class Max3m {
	/*
	 * 3개의 정수에서 최댓값을 구한다.
	 */
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		return max;
	}
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		int num3 = (int)(Math.random() * 101);
		
		System.out.printf("num1 : %d, num2 : %d, num3 : %d\n", num1, num2, num3);
		
		System.out.println(max(num1, num2, num3));
	}
}
