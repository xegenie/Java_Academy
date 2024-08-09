package _1000;

import java.util.Scanner;

//어떤 수 n을 입력받으면 다음과 같은 삼각형을 출력한다.
//
//여기서 입력되는 n은 반드시 홀수이다.
//
//입력 ) 5
//
//  *
// ***
//*****

public class _1358 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= (n+1)/2; i++) {
			// 3=2 5=3 7=4 9=5 .. ( (n+1)/2 )

				for (int j = 1; j <= (n+1)/2-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		sc.close();
	}
}

