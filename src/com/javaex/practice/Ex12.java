package com.javaex.practice;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, max = 1;

		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		sc.close();

		for(i = 1; i <= num; i++) {
			max *= i;
		}
		System.out.println("결과값 : " + max);
	}
}
