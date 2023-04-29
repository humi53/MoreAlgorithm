package com.yopheu.algorithm.structure;

/*
 * Prime 구하기 알고리즘 개선(2)
 * 100의 약수를 직사각형을 이용해 사용.
 * N의 제곱근 이하의 수로만 체크한다.
 * 개선 전후비교 : 	7 이면, 2,3,5 체크
 * 						7 의 제곱근은 약 2.64 이므로 2 체크.
 * 					17 이면 2,3,5,7,11,13 체크
 *						17의 제곱근은 약 4.12 이므로 2,3 체크.
 *					29 이면 2,3,5,7,11,13,17,19,23 체크
 *						29의 제곱근은 약 5.38 이므로 2,3,5 체크.
 *
 * for의 곱하기 연산과, if의 나눗셈 연산이 있지만
 * 연산 횟수는 기하급수적으로 줄어들게 됨.
 * 
 * 3774
 */
public class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0;		// 곱셈과 나눗셈의 횟수
		int ptr = 0;
		int[] primes = new int[500];
		
		primes[ptr++] = 2;
		primes[ptr++] = 3;
		
		for(int n = 5; n < 1000; n += 2) { 	// 홀수만
			boolean isPrime = true;	
			for(int i = 1; primes[i] * primes[i] <= n; i++) {	// 제곱근 대신 곱하기를 사용.
				counter += 2;		// 조건이 해당되지 않으면 바로 나가기 때문에 다음 조건때 카운터 한다.
				if(n % primes[i] == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				primes[ptr++] = n;
				counter++;
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(primes[i]);
		}
		
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
	}
}




