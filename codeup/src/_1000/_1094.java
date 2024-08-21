package _1000;

import java.util.Scanner;

// 거꾸로출력
// (입력)은 1093과 동일

public class _1094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
