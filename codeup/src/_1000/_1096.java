package _1000;

import java.util.Scanner;

public class _1096 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int qkenr[][] = new int[19][19];
		

		// 흰 돌 개수 만큼 반복해서 좌표 입력
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			qkenr[x-1][y-1] = 1;
		}
		
		for (int i = 0; i < qkenr.length; i++) {
			for (int j = 0; j < qkenr[i].length; j++) {
				System.out.print(qkenr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


