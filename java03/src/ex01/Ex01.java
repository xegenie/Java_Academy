package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// if - else ��
		
		System.out.print("�����Ը� �Է��ϼ���:");
		Scanner scan = new Scanner(System.in);
		int weight = scan.nextInt();
		
		// �����԰� 70Ű�� �����̸� "ġŲ", �ƴϸ� "������"
//		if (weight <= 70) {
//			System.out.println("ġŲ");
//		} else {
//			System.out.println("������");
//		}
		
		// if - else if - else��
		// �����԰� 70Ű�� �����̸� "ġŲ"
		if (weight <= 70) {
			System.out.println("ġŲ");
		} else if (weight <= 75) { // 70Ű�� �ʰ� 75Ű�� ����
			System.out.println("�߰�����");
		} else if (weight <= 80) { // 75Ű�� �ʰ� 80Ű�� ����
			System.out.println("������");
		} else { // 80�ʰ�
			System.out.println("����");
		}
	}

}
