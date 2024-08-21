package _1000;

import java.util.Scanner;

// 최소값
// (입력)1093과 동일
public class _1095 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[i] = arr[j];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println(arr[0]);
	}

}
