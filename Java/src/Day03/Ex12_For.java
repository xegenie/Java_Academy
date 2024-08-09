package Day03;

public class Ex12_For {
	
	public static void main(String[] args) {
		// for ( 1.초기식; 2.조건식; 3.증감식; ) { 4.실행문 }
		// - 실행순서 : 1 > 반복(2 > 4 > 3)
		
		// 1. 1~10까지 정수를 출력하시오.
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. 50~100까지 정수를 출력하시오.
		for (int i = 50; i < 101; i++) {
			System.out.print(i+" ");
			if ( (i+1) % 10 == 0 )		// 10개씩 개행(엔터)하여 출력
				System.out.println();				
		}
		System.out.println();	
		// 3. 1~20까지 정수 중 짝수만 출력하시오.
		for (int i = 2; i <= 20; i += 2) {
				System.out.print(i + " ");		
		}
		System.out.println();
		
		// 4. 1~20까지 정수 중 홀수만 출력하시오.
		for (int i = 1; i <= 20; i += 2) {
				System.out.print(i + " ");	
		}
		
		}

}
