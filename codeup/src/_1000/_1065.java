package _1000;

import java.util.Scanner;

public class _1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i : arr) {
			if (i%2 ==0)
			System.out.println("even");
			else
				System.out.println("odd");
		}
		
	}

}
