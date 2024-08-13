package JavaMission;

import java.util.Scanner;
import java.util.Random;

public class Num6 {
	/*
	 * ?��?�� N?�� ?��?��받아 N개의 게임?�� 로또 번호�? 출력?��?��?��. �?, 6개의 배열?��?���? 갖는 1차원 배열?�� ?��?��?��?�� 1~45 ?��?��?�� ?��?��?�� 값을
	 * 중복?���? ?��?���? ???��?���? 출력?��?�� 과정?�� N�? 반복?��?��?��.
	 * 
	 * ?? (?��?��)
	 * 
	 * - Math.random(); 메소?�� : 0.0?��?�� 1.0미만?�� ?��?��?�� 값을 반환 - Random random = new Random();
	 * random.nextInt(N); : 0?��?�� N?��?��?�� ?��?��?�� ?��?��???��?�� 값을 반환
	 * 
	 * - ex)
	 * System.out.println( Math.random() ); // 0.5446712360575938
	 * System.out.println( random.nextInt(10) ); // 7
	 * 
	 * �? 게임? 5 
	 * [1 게임] : 2 9 14 23 41 44 
	 * [2 게임] : 1 8 17 33 37 41 
	 * [3 게임] : 6 12 15 22 23 37 
	 * [4 게임] : 1 8 15 18 28 37 
	 * [5 게임] : 3 11 12 23 31 37
	 */

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		// arr[6] ?��?��
		int arr[] = new int[6];
		
		// N?��?�� ?��?�� 받음
		System.out.print("�? 게임? : ");
		int N = sc.nextInt();
		
		// N�? 반복
		for (int i = 1; i <= N; i++) { 	
			System.out.print("[" + i + " 게임] : ");
			
			// 1~45?��?��?�� ?��?��번호
			for (int j = 0; j < arr.length; j++) {
				Random random = new Random();
				arr[j] = (int) Math.random();
				System.out.print(random.nextInt(45) + " ");
			}
			
			System.out.println();

		}
		sc.close();
	}
}
