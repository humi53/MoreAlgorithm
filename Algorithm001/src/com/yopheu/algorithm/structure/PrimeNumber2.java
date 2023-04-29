package com.yopheu.algorithm.structure;

/*
 * prime 구하기 알고리즘 개선(1)
 * 소수로만 나누자.
 * 14622
 */
public class PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;	// 나눗셈 횟수
		int ptr = 0;	// 찾은 소수의 개수
		int[] primes = new int[500];	// 소수를 저장할 배열
		
		primes[ptr++] = 2;	// 2는 일단 저장하고 시작.
		
		for(int n = 3; n <= 1000; n += 2) {		// 홀수만
			int i;
			for(i = 1; i < ptr; i++) {		//이미 찾은 소수만
				counter++;
				if(n % primes[i] == 0) {
					break;
				}
			}
			if(ptr == i) {		// 마지막까지 나누어지지 않으면
				primes[ptr++] = n;	// 소수를 배열에 저장
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(primes[i]);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}
}
