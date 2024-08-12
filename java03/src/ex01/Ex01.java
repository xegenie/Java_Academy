package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// if - else 문
		
		System.out.print("몸무게를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		
		// 몸무게가 70키로 이하이면 "치킨", 아니면 "샐러드"
//		if (weight <= 70) {
//			System.out.println("치킨");
//		} else {
//			System.out.println("샐러드");
//		}
		
		// if - else if - else문
		// 몸무게가 70키로 이하이면 "치킨"
		if (weight <= 70) {
			System.out.println("치킨");
		} else if (weight <= 75) { // 70키로 초과 75키로 이하
			System.out.println("닭가슴살");
		} else if (weight <= 80) { // 75키로 초과 80키로 이하
			System.out.println("샐러드");
		} else { // 80초과
			System.out.println("굶어");
		}
	}

}
