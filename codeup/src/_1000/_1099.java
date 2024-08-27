package _1000;

import java.util.Scanner;

public class _1099 { // 포기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int 개미집[][] = new int[10][10];

		for (int i = 0; i < 개미집.length; i++) {
			for (int j = 0; j < 개미집[i].length; j++) {
				개미집[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i < 개미집.length-1; i++) {
			for (int j = 1; j < 개미집.length-1; j++) {
				if (개미집[i][j] == 0)
					개미집[i][j] = 9;
				if (개미집[i][j] == 1 ) {
					break;
				}
			}
		}
		
		for (int[] is : 개미집) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}

	}

}
