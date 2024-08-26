package _1000;

import java.util.Scanner;

public class _1098 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int arr[][] = new int[h][w];
		
		int n = sc.nextInt();
		int weight = 0;
		int height = 0;
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < n; i++) {
			weight = sc.nextInt();
			height = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			if (height == 0)
				for (int j = (y - 1); j < weight; j++) {
					arr[x][j] = 1;
				}
			if (height == 1)
				for (int j = (x-1); j < weight; j++) {
					arr[j][y] = 1;
				}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
