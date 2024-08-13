package _1000;

import java.util.Scanner;

/*
 * 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
저장되어 있는 실수값을 출력해보자.
 */

public class _1012 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		
		System.out.printf("%5.6f",a);
		
		sc.close();
	}

}
