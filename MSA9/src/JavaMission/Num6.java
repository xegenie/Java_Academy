package JavaMission;

import java.util.Scanner;
import java.util.Random;

public class Num6 {
	/*
	 * ? •?ˆ˜ N?„ ?…? ¥ë°›ì•„ Nê°œì˜ ê²Œì„?˜ ë¡œë˜ ë²ˆí˜¸ë¥? ì¶œë ¥?•˜?‹œ?˜¤. ì¦?, 6ê°œì˜ ë°°ì—´?š”?†Œë¥? ê°–ëŠ” 1ì°¨ì› ë°°ì—´?„ ?„ ?–¸?•˜?—¬ 1~45 ?‚¬?´?˜ ?œ?¤?•œ ê°’ì„
	 * ì¤‘ë³µ?˜ì§? ?•Š?„ë¡? ???¥?•˜ê³? ì¶œë ¥?•˜?Š” ê³¼ì •?„ Në²? ë°˜ë³µ?•˜?‹œ?˜¤.
	 * 
	 * ?? (?Œ?Š¸)
	 * 
	 * - Math.random(); ë©”ì†Œ?“œ : 0.0?´?ƒ 1.0ë¯¸ë§Œ?˜ ?„?˜?˜ ê°’ì„ ë°˜í™˜ - Random random = new Random();
	 * random.nextInt(N); : 0?´?ƒ N?´?•˜?˜ ?„?˜?˜ ? •?ˆ˜???…?˜ ê°’ì„ ë°˜í™˜
	 * 
	 * - ex)
	 * System.out.println( Math.random() ); // 0.5446712360575938
	 * System.out.println( random.nextInt(10) ); // 7
	 * 
	 * ëª? ê²Œì„? 5 
	 * [1 ê²Œì„] : 2 9 14 23 41 44 
	 * [2 ê²Œì„] : 1 8 17 33 37 41 
	 * [3 ê²Œì„] : 6 12 15 22 23 37 
	 * [4 ê²Œì„] : 1 8 15 18 28 37 
	 * [5 ê²Œì„] : 3 11 12 23 31 37
	 */

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		// arr[6] ?„ ?–¸
		int arr[] = new int[6];
		
		// N? •?ˆ˜ ?…? ¥ ë°›ìŒ
		System.out.print("ëª? ê²Œì„? : ");
		int N = sc.nextInt();
		
		// Në²? ë°˜ë³µ
		for (int i = 1; i <= N; i++) { 	
			System.out.print("[" + i + " ê²Œì„] : ");
			
			// 1~45?‚¬?´?˜ ?œ?¤ë²ˆí˜¸
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
