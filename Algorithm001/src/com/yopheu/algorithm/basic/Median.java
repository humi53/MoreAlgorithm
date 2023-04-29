package com.yopheu.algorithm.basic;

public class Median {
	/*
	 * 3숫자 중에 중앙값을 구한다.
	 * 중앙값을 구하는 과정은 '퀵정렬'에서도 이용합니다.
	 */
	// 세값의 대소 관계 분기는 13종류가 있다.
	public static int med3(int num1, int num2, int num3) {
		if(num1 >= num2)
			if(num2 >= num3)
				return num2;	//ABFG
			else if(num1 <= num3)
				return num1;	//DEH
			else
				return num3;	//C
		else if(num1 > num3)
			return num1;	//I
		else if(num2 > num3)
			return num3;	//JK
		else
			return num2;	//LM
	}
	// 3가지 숫자중 몇번째 숫자가 나오는지 체크
	// A,B,C 의 위치중에
	public static String check_med3(int num1, int num2, int num3) {
		if(num1 >= num2)
			if(num2 >= num3)
				return "B";	//ABFG
			else if(num1 <= num3)
				return "A";	//DEH
			else
				return "C";	//C
		else if(num1 > num3)
			return "A";	//I
		else if(num2 > num3)
			return "C";	//JK
		else
			return "B";	//LM
	}
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		int num3 = (int)(Math.random() * 101);
		
		System.out.printf("num1 : %d, num2 : %d, num3 : %d\n", num1, num2, num3);
		
		System.out.println("중앙값은 " + med3(num1, num2, num3) + "입니다.");
		
		//실습 모든 가정을 출력해보기.
		System.out.println("A : med3(3, 2, 1) = " + med3(3, 2, 1) + check_med3(3, 2, 1));	//A
		System.out.println("B : med3(3, 2, 2) = " + med3(3, 2, 2) + check_med3(3, 2, 2));	//B
		System.out.println("C : med3(3, 1, 2) = " + med3(3, 1, 2) + check_med3(3, 1, 2));	//C
		System.out.println("D : med3(3, 2, 3) = " + med3(3, 2, 3) + check_med3(3, 2, 3)); //D
		System.out.println("E : med3(2, 1, 3) = " + med3(2, 1, 3) + check_med3(2, 1, 3)); //E
		System.out.println("F : med3(3, 3, 2) = " + med3(3, 3, 2) + check_med3(3, 3, 2)); //F
		System.out.println("G : med3(3, 3, 3) = " + med3(3, 3, 3) + check_med3(3, 3, 3)); //G
		System.out.println("H : med3(2, 2, 3) = " + med3(2, 2, 3) + check_med3(2, 2, 3)); //H
		System.out.println("I : med3(2, 3, 1) = " + med3(2, 3, 1) + check_med3(2, 3, 1)); //I
		System.out.println("J : med3(2, 3, 2) = " + med3(2, 3, 2) + check_med3(2, 3, 2)); //J
		System.out.println("K : med3(1, 3, 2) = " + med3(1, 3, 2) + check_med3(1, 3, 2)); //K
		System.out.println("L : med3(2, 3, 3) = " + med3(2, 3, 3) + check_med3(2, 3, 3)); //L
		System.out.println("M : med3(1, 2, 3) = " + med3(1, 2, 3) + check_med3(1, 2, 3)); //M
	}
	
	/*
	 * q) med3 에 비해 효율이 떨어지는 이유를 설명하시오.
	 * med3는 비교 횟수 즉 최대깊이가 3if 인데
	 * 
	 * 아래의 구문은 논리적으로 if에서 4논리연산
	 * 이어서 else if까지 4논리연산 
	 * if에 해당되지 않으며 else if의 마지막 단 c > b에 도달하면 8번비교하게 된다.
	 * 
	 * return a가 운이 좋은경우 2번 나쁠경우 4번
	 * return b가 운이 좋을경우 6번 나쁠경우 8번
	 * return c는 무조건 8번
	 */
	public static int med3_1(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
}
