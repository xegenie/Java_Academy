package _1000;

import java.util.Scanner;

public class _1035 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		int b = Integer.parseInt(a, 16);	// 16진수 -> 10진수
		
		a = Integer.toOctalString(b);		// 10진수 -> 8진수
		
		
		
		System.out.print(a);
		
		sc.close();
		
	}

}
