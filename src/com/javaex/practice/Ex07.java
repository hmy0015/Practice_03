package com.javaex.practice;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(x); 
			}
			System.out.println();
		}
		sc.close();
	}

}
