package com.javaex.practice;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		sc.close();
		
		for(i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
	}
}
