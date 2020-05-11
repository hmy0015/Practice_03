package com.javaex.practice;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int i, num, sum = 0, count = -1;
		  
		  System.out.print("숫자를 입력하세요 : ");
		  num = sc.nextInt();
		  sc.close();
		  
		  for(i = 0; i <= num; i++) {
			  if(i % 5 == 0) {
				  sum += i;
				  count++;
			  }
		  }

		  System.out.println("5의 배수의 개수  : " + count);
		  System.out.println("5의 배수의 합    : " + sum);
	}
}
