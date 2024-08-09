package _1000;

import java.util.Scanner;

//길이 n이 입력되면 다음과 같은 역삼각형을 출력한다.
//
//예)
//
//n이 5이면
//
//*****
// ****
//  ***
//   **
//    *

public class _1355 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for ( int i = 1; i <= N; i++ ) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");				
			}
			for (int j = (N-i+1); j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
