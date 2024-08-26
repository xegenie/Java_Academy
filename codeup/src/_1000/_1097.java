package _1000;

import java.util.Scanner;

public class _1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[19][19];

		for (int i = 0; i < arr.length; i++) {// 한 줄씩 바둑판 상황 입력 받기
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt(); // 좌표 개수 입력받기

		int x = 0;
		int y = 0;

		for (int i = 0; i < n; i++) { // 좌표의 개수만큼
			x = (sc.nextInt()-1);
			y = (sc.nextInt()-1);

			for (int j = 0; j < arr.length; j++) { // 가로 줄 흑<->백 바꾸기
				if (arr[x][j] == 0)
					arr[x][j] = 1;
				else
					arr[x][j] = 0;
			}
			for (int j = 0; j < arr.length; j++) { // 세로 줄 흑<->백 바꾸기
				if (arr[j][y] == 0)
					arr[j][y] = 1;
				else
					arr[j][y] = 0;
			}
		}
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
	}
}
