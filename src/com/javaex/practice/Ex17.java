package com.javaex.practice;
import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, num;
		
		System.out.print("숫자를 입력하세요 : ");
        num = sc.nextInt();
		sc.close();
		
		for (i = 1; i <= num; i++) {
			for (j = i; j <= num; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}

}
