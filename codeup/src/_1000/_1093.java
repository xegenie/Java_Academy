package _1000;

import java.util.Scanner;


// 번호순대로 1~23번이 몇번씩 불렸는지
// (입력)10
//		1 3 4 5 21 23 22 23 2 1
// (출력)2 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 2
public class _1093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum[] = new int[23];

		for (int i = 0; i < sum.length; i++) {
			
			sum[i] = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if (i + 1 == arr[j])
					sum[i]++;
			}
		}
		for (int i : sum) {
			System.out.print(i + " ");
		}

	}

}
