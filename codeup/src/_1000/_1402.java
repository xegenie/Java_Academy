package _1000;

import java.util.Scanner;

//데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.

public class _1402 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];		
		
		for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
		
		for (int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i]+" ");
			}
		sc.close();
		}
	}
