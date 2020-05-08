package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		int x;
		
		for (x = 1; x <= 100; x++) {
			if(x % 5 == 0 && x % 7 ==0) {
				System.out.println(x);
			}
		}		
	}
}
