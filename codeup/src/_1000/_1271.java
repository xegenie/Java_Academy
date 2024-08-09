package _1000;

/*입력의 개수 n이 입력되고 n개의  데이터가 입력된다.

이 n개의 데이터 중 최댓값을 출력한다.*/

import java.util.Iterator;

/*입력의 개수 n이 입력되고 n개의  데이터가 입력된다.

이 n개의 데이터 중 최댓값을 출력한다.*/

import java.util.Scanner;

public class _1271 {
	
	public static void main(String[] args) {
		
//		1. n번 입력
//		2. n번 반복하면서 n개의 데이터를 입력
//		3. 최댓값과 입력데이터 비교
//		4. 최댓값보다 입력데이터가 더 크면, 최댓값에 입력데이터 대입
//		5. 최댓값 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 입력하시겠습니까? ");
		int n = sc.nextInt(); //1
		int max = 0;
		
		for (int i = 1; i <= n; i++) { //2
			int input = sc.nextInt();
			
			if ( max < input ) //3
				max = input;  //4
			}
		System.out.println(max); //5
		sc.close();
	}
}