package _1000;

import java.util.Scanner;

public class _1039 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long b = 0;
		for (int i = 0; i < 2; i++) {
			long a = sc.nextLong();
			b += a;
		}
		System.out.print(b);
		
		sc.close();
	}

}
