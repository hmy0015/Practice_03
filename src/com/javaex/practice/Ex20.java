package com.javaex.practice;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = (int)(Math.random() * 100) + 1; // 랜덤 숫자 지정
		
		System.out.println("======================================");
		System.out.println("       [ 숫자맞추기 게임 시작 ]       ");
		System.out.println("======================================");
		
		while(true) {
			System.out.print(">> ");
			int num = sc.nextInt();
			
			System.out.println(random);
			if(num > random) {
				System.out.println("더 낮게");
			}
			else if (num < random) {
				System.out.println("더 높게");
			}
			else {
				System.out.println("맞았습니다.");
				System.out.print("다시 하시겠습니까? (y / n) >> ");					
				char re_start = sc.next().charAt(0);
				
				if(re_start == 'y') {
					random = (int)(Math.random() * 100) + 1; // 랜덤 숫자 지정
					System.out.println("======================================");
					System.out.println("       [ 숫자맞추기 게임 시작 ]       ");
					System.out.println("======================================");

					continue;
				}
				else {
					System.out.println("======================================");
					System.out.println("       [ 숫자맞추기 게임 종료 ]       ");
					System.out.println("======================================");
					
					break;
				}
			}
			
		}
			
		sc.close();
	}
}
