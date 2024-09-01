package _1000;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		String[] sp1 = a.split("H");
		String[] sp2 = sp1[0].split("C");
//		System.out.println(sp2[1]+" "+sp1[1]);
		
		int b = 12*Integer.parseInt(sp2[1])+Integer.parseInt(sp1[1]);
		System.out.println(b);
	}

}
