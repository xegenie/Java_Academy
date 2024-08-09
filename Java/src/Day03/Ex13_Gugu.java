package Day03;

import java.util.Scanner;

public class Ex13_Gugu {
	
	public static void main(String[] args) {
		// 구구단 (1~9단)
		// 원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오.
		// 입력 : 4
		// 4*1=4
		// 4*2=8
		// ...
		// 4*9=36
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
			System.out.println(input+" * 1 = "+input*1);
			System.out.println(input+" * 2 = "+input*2);
			System.out.println(input+" * 3 = "+input*3);
			System.out.println(input+" * 4 = "+input*4);
			System.out.println(input+" * 5 = "+input*5);
			System.out.println(input+" * 6 = "+input*6);
			System.out.println(input+" * 7 = "+input*7);
			System.out.println(input+" * 8 = "+input*8);
			System.out.println(input+" * 9 = "+input*9);
			
			for (int i = 1; i < 10; i++) {
				int result = input * i;
				System.out.println(input+" * "+i+" = "+result);
				
			}

		sc.close();
	}

}
