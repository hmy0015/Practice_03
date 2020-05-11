package com.javaex.practice;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, max = 0, odd = 0, eve = 0;

		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		sc.close();
		
		for (i = 1; i <= num; i++) {
			if (i % 2 == 0) { // 짝수 조건식
				odd += i; // even = even + i;
				max = odd;
			} else { // 홀수 조건식 : i%2==1 또는 i%2!=0;
				eve += i; // odd = odd + i;
				max = eve;
			}
		}
		System.out.println("결과값 : " + max);
	}
}
