package Day02;

import java.util.Scanner;

public class Ex08_Triangle {
	
	
	public static void main(String[] args) {
		// 삼각형 넓이 : (밑변)*(높이) / 2
		// 밑변과 높이를 입력받아서 삼각형의 넓이를 계산하고 출력하세요.
		
		System.out.println("삼각형의 넓이 구하기");
		
		Scanner sc = new Scanner(System.in);
		
		//1. 밑변과 높이를 입력받는다.
		//2. 밑변과 높이를 담을 변수를 선언한다.
		System.out.print("삼각형의 밑변의 길이를 입력하세요 : ");
		double width = sc.nextDouble();
		
		System.out.print("삼각형의 높이를 입력하세요 : ");
		double height = sc.nextDouble();
		
		double area = width*height/2;
		System.out.print("삼각형의 넓이는 " + area + "입니다.");
		
		
	}

}
