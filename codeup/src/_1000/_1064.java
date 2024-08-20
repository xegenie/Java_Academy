package _1000;

import java.util.Scanner;

public class _1064 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if ( arr[i] > arr[j] ) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}									// 오름차순
			System.out.print(arr[0]);

		
		
	}

}
