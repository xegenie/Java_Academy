package JavaMission;

import java.util.Scanner;
import java.util.Random;

public class Num6 {
	/*
	 * ? ? N? ?? ₯λ°μ Nκ°μ κ²μ? λ‘λ λ²νΈλ₯? μΆλ ₯???€. μ¦?, 6κ°μ λ°°μ΄??λ₯? κ°λ 1μ°¨μ λ°°μ΄? ? ?Έ??¬ 1~45 ?¬?΄? ??€? κ°μ
	 * μ€λ³΅?μ§? ??λ‘? ???₯?κ³? μΆλ ₯?? κ³Όμ ? Nλ²? λ°λ³΅???€.
	 * 
	 * ?? (??Έ)
	 * 
	 * - Math.random(); λ©μ? : 0.0?΄? 1.0λ―Έλ§? ??? κ°μ λ°ν - Random random = new Random();
	 * random.nextInt(N); : 0?΄? N?΄?? ??? ? ????? κ°μ λ°ν
	 * 
	 * - ex)
	 * System.out.println( Math.random() ); // 0.5446712360575938
	 * System.out.println( random.nextInt(10) ); // 7
	 * 
	 * λͺ? κ²μ? 5 
	 * [1 κ²μ] : 2 9 14 23 41 44 
	 * [2 κ²μ] : 1 8 17 33 37 41 
	 * [3 κ²μ] : 6 12 15 22 23 37 
	 * [4 κ²μ] : 1 8 15 18 28 37 
	 * [5 κ²μ] : 3 11 12 23 31 37
	 */

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		// arr[6] ? ?Έ
		int arr[] = new int[6];
		
		// N? ? ?? ₯ λ°μ
		System.out.print("λͺ? κ²μ? : ");
		int N = sc.nextInt();
		
		// Nλ²? λ°λ³΅
		for (int i = 1; i <= N; i++) { 	
			System.out.print("[" + i + " κ²μ] : ");
			
			// 1~45?¬?΄? ??€λ²νΈ
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
