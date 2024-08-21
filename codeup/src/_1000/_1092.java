package _1000;

import java.util.Scanner;

public class _1092 {
	
	// 같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는 방문 주기
	
	// 3명이 다시 모두 함께 방문해 문제를 풀어보는 날을 출력한다.
	
	//(입력) 3 7 9
	//(출력) 63
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();	// 3명의 방문주기

		int day = 1;
		
		// while문 : 조건이 true면 반복
		while (day%a != 0 || day%b != 0 || day%c != 0) {
		day++;
	}
		
		System.out.println(day);	// 함께 방문하는 날
		
	}
}