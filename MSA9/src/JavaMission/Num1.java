package JavaMission;

import java.util.Scanner;

public class Num1 {
	/*
	 �л��� ����, ����, �ڹ� ������ ���� ������ ���� eng, math, java �� �����ϰ�, ������� ������ �Է� �޾� ������ �� ��
	��� ����� ����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	�Է�
	80 90 100 
	
	���
	���� ���� : 80
	���� ���� : 90
	�ڹ� ���� : 100
	���� : 270
	��� : 90.0
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		
		System.out.println("���� ���� : "+eng);
		System.out.println("���� ���� : "+math);
		System.out.println("�ڹ� ���� : "+java);
		
		int sum = eng+math+java;
		double avg = (double)sum/3;
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
		sc.close();
		
	}
}
