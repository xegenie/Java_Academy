package _1000;

/*어떤 두 수 a, b가 있을 때 
 두 수 사이의 모든 정수를 오름차순으로 출력하시오.

예를 들어, a=5 , b=10일 경우 5 6 7 8 9 10입니다.*/

import java.util.Scanner;

public class _1253 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 내가 한 방법
//			if ( a <= b ) {
//				while ( a <= b ) {
//					System.out.print(a+" ");
//				a++;
//				}
//			}
//			else {
//				while( a >= b ) {
//					System.out.print(b+" ");
//				b++;
//				}
//			}
			
			// 강사님이 한 방법
		
		//1.
//			if ( a > b ) {
//				for ( int i = b; i <= a; i++ ) {
//					System.out.print(i + " ");
//				}
//			}
//			else {
//				for (int i = a; i <= b; i++) {
//					System.out.print(i + " ");
//				}
//			}
		
		// a가 더 크면 b와 교환
		if ( a > b ) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}

			sc.close();
	}
}
