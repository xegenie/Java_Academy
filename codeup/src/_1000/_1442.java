package _1000;

import java.util.Scanner;

/*
 * 오름차순 선택 정렬은 '가장 작은 원소를 찾아 첫번째 위치로 옮기고, 
 남은 원소를 또 탐색하여 그 다음 작은 원소를 찾아 두번째 위치로 옮기고, ... 
 이런식으로 정렬하는 방식'이다.
 */

public class _1442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
