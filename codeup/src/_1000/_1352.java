package _1000;

/*길이 n이 입력되면 길이가 n인 사각형을 출력하시오.

단, 사각형은 * 모양으로 채운다.*/

import java.util.Scanner;

public class _1352 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n*n; i++) {
			System.out.print("*");
			if (i % n == 0)
				System.out.println();
		}
		
		sc.close();
		
	}

}
