package _1000;

import java.util.Scanner;

//n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.
//
//입력 예)
//3
//출력 예)
//1 2 3
//4 5 6
//7 8 9

public class _1501 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		int a = 1;
		
		for (int i=0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(a+" ");
				a++;	
			}
			System.out.println();
		}
		sc.close();
	}
}
