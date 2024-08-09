package Day03;

import java.util.Scanner;

public class Ex06_Greade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학점을 입력받아 점수구간을 출력하시오.
		System.out.print("학점 : ");
		//String (문자열) 참조 자료형
		String grade = sc.next();
		
		// * 문자, 정수, 문자열은 switch문의 조건값으로 가능
		// * 실수(float, double)은 불가능
		switch (grade) {
		case "A":
			System.out.println("90~100점 입니다.");
			break;
		case "B":
			System.out.println("80~89점 입니다.");
			break;
		case "C":
			System.out.println("70~79점 입니다.");
			break;
		case "D":
			System.out.println("60~69점 입니다.");
			break;
		case "F":
			System.out.println("60점 미만입니다.");
			break;

		default:
			System.out.println("A~F사이의 문자를 입력해 주세요.");
			break;
		}
		
		sc.close();

	}

}
