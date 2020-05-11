package com.javaex.practice;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String re_start = ""; // 게임 재시작 변수

		// ★★ 랜덤게임 루프 ★★ 
		while(true) {
			// re_start가 n일 경우,   ★★ 랜덤게임 루프 ★★ 빠져나가기
			// 첫 시작 시 re_start는 "(공백)"이므로 게임이 시작 됨
			if(re_start.equals("n")) {
				break;
			}
			
			int random = (int)(Math.random() * 100) + 1; // 랜덤 숫자 지정
			
			System.out.println("======================================");
			System.out.println("       [ 숫자맞추기 게임 시작 ]       ");
			System.out.println("======================================");
			
			// ▶▶ 숫자 맞추기 루프 ◀◀
			while(true) {
				// 숫자 입력
				System.out.print(">> ");
				int num = sc.nextInt();
				
				if(num > random) {
					System.out.println("더 낮게");
				}
				else if (num < random) {
					System.out.println("더 높게");
				}
				else {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까? (y / n) >> ");					
					re_start = sc.next(); // 게임 재시작 여부 입력
					
					// "n" 입력시 게임 종료 
					if(re_start.equals("n")) {
						System.out.println("======================================");
						System.out.println("       [ 숫자맞추기 게임 종료 ]       ");
						System.out.println("======================================");
					}
					break; // 숫자를 맞췄으므로 게임 재시작 여부와는 상관없이  ▶▶ 숫자 맞추기 루프 ◀◀ 빠져나가기
				} // else 닫음	
				
			} // 숫자맞추기 루프 닫음
			
		} // 랜덤게임 루프 닫음
		sc.close();
	}
}
