package test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = scanner.nextInt();
		
		System.out.println("입력받은 정수는 "+number+"입니다.");
		
		scanner.close();
		
	}

}
