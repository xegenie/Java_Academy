package _1000;

import java.util.Scanner;

public class _1036 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.nextLine().charAt(0);	// (char)'a'로 입력
		
		System.out.print((int)a);			// 아스키코드 -> 정수로 반환
		
		sc.close();
	}

}
