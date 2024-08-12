package _1000;

import java.util.Scanner;

/*
하나의 정수N을 입력받아 다음과 같이 작성하시오.

지그재그로 출력하시오.

N이 5라면 다음과 같이 출력한다.

1 2 3 4 5

10 9 8 7 6

11 12 13 14 15

20 19 18 17 16

21 22 23 24 25 
*/

public class _1503 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		int a = 1;
		
		for (int i=0; i < arr.length; i++) {
			if (i%2==0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(a+" ");
					a++;	
				}
			}
			else { 
				for (int j = arr[i].length-1; j >= 0; j--) {
					System.out.print(a+" ");
					a++;
				}
			}

				
			System.out.println();
		}
		sc.close();
	}
}




