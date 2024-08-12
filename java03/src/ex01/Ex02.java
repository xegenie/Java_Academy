package ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = scan.nextInt();
		
		// if - else if - else문
		
//		if (number == 1) {
//			System.out.println("1이다.");
//		} else if (number == 2) {
//			System.out.println("2이다.");
//		} else {
//			System.out.println("1이나 2가 아니다.");
//		}
		
		// switch문 : "같다" 조건을 if문을 대체해서 사용 가능
		switch (number) {
		case 1:
			System.out.println("1이다.");
			break; // 중간에 멈춤
		case 2:
			System.out.println("2이다.");
			break;
		default: // else문과 같음
			System.out.println("1이나 2가 아니다.");
		}
	}

}
