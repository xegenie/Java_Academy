package _1000;

import java.util.Scanner;

class 은행 {
	int 잔고;
	
	public 은행() {
	}

	public int get잔고() {
		return 잔고;
	}
	public void set잔고(int 잔고) {
		this.잔고 += 잔고;
	}

}

public class Excercise07 {
	static 은행 bank = new 은행();
	static Scanner sc = new Scanner(System.in);
	
	static void input() {
		System.out.print("예금액 : ");
		int money = sc.nextInt();
		bank.set잔고(money);
	}
	
	static void output() {
		System.out.print("출금액 : ");
		int money = sc.nextInt();
		bank.set잔고(-money);
	}
	static void deposit() {
		System.out.println("잔고 > "+bank.get잔고()+"원");
	}
	
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		

		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			
			balance = sc.nextInt();
			
			switch (balance) {
			case 1: input();
				break;
			case 2: output();
				break;
			case 3: deposit();
				break;
			case 4: run = false;
				break;

			default:
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
