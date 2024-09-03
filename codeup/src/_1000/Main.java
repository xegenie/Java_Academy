package _1000;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		int b = Integer.parseInt(a,16);
		
		for (int i = 1; i <= 15; i++) {
			System.out.print(a+"*");
			System.out.printf("%X",i);
			int g = b*i;
			System.out.print("=");
			System.out.printf("%X\n",g);
		}
		
	}

}
