package _1000;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class 한글_UTF8 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
	
		if (a > 0) System.out.println("양수");
		else if ( a < 0 ) System.out.println("음수");
		else System.out.println("0");
	}
}
