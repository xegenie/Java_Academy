package _1000;

import java.util.Scanner;

public class _1443 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int key , temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			temp = i-1;
			while ( temp >= 0 && arr[temp] > key) {
				arr[temp+1] = arr[temp];
				temp--;
			}
			System.out.println(arr[i]);
		}
		
		sc.close();

	}
}
