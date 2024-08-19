package _1000;

import java.util.Scanner;

public class _1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 10000;
		
		for (int i = 0; i < 5; i++) {
			int result = a-(a%b);
			
			System.out.println("["+result+"]");
			
			b = b / 10;
			a = a-result;
			
		}
		
		sc.close();

	}
}
