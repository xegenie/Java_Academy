package TeamMission;

import java.util.Scanner;

/*
 ���� �ϳ��� �Է� �޾�, ������ ���� N�� �ʱ�ȭ��Ű��, ���� <���>�� ���� ��*�� ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

(�Է�)
5
(���)
   *
  ***
 *****
*******
 
 */

public class Num4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		sc.close();
		
	}

}
