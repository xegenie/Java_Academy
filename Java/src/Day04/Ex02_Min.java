package Day04;

import java.util.Scanner;

public class Ex02_Min {
	
	public static void main(String[] args) {
		// 첫 번째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최소값을 구하시오.
		// (입력예시)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최소값 : 55
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 개수 : ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		int min = Integer.MAX_VALUE; // 제일 큰 변수
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if ( min > arr[i] )
				min = arr[i];
		}
		System.out.println("최소값 : " + min);
		
		sc.close();
	}

}
