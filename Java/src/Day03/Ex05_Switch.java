package Day03;

import java.util.Scanner;

public class Ex05_Switch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 입력해 주세요 : ");
		int channel = sc.nextInt();
		
		switch (channel) {
		case 11:
			System.out.println("MBC - 무한도전");
			break;
		case 7 :
			System.out.println("KBS - 뉴스");
			break;
		case 33 :
			System.out.println("CGV - 반지의제왕");
			break;
		case 100:
			System.out.println("넷플릭스 - 스위트홈3");

		default:
			System.out.println("요청하신 채널이 없습니다.");
			break;
		
		}
		
		sc.close();
	}

}
