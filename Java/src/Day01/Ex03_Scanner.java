package Day01;

import java.util.Scanner; //외부 클래스를 포함시키는 키워드
// *import 패키지.클래스명;

//import 하는법
//1. 클래스 : ctrl + space
//2. 전체 import : ctrl + shift + O

public class Ex03_Scanner {
	
	
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();  //정수 하나를 입력받는 메소드
		
		System.out.println("a = "+ a);
		
		sc.close(); // 메모리에서 Scanner객체를 해제함
		
		// sc.nextInt(); // 더이상 입력 받을 수 없다(err)
		
	}

}
