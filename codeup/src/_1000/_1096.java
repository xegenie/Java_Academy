package _1000;

import java.util.Scanner;

public class _1096 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qkenr[][] = new int[19][19];
		
		for (int i = 0; i < qkenr.length; i++) {
			for (int j = 0; j < qkenr.length; j++) {
				int a = sc.nextInt();
				qkenr[i][j] = a;
			}
		}
		
		int n = sc.nextInt();	
		int x = 0;
		int y = 0;

		// 흰 돌 개수 만큼 반복해서 좌표 입력
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		for (int i = 0; i < qkenr.length; i++) {
			for (int j = 0; j < qkenr[i].length; j++) {
				if (qkenr[x-1][j] == 1)
					qkenr[x-1][j] = 0;
				else if (qkenr[x-1][j] == 0)
					qkenr[x-1][j] = 1;
				if (qkenr[i][y-1] == 0)
					qkenr[i][y-1] = 1;
				else if (qkenr[i][y-1] == 1)
					qkenr[i][y-1] = 0;

				System.out.print(qkenr[i][j] + " ");
			}
			System.out.println();
		}
	}
}


