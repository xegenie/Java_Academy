package JavaMission;

/*
  	���� 1���� 100���� �� ���� ����ϸ鼭, �ش� �� �� 3 �Ǵ� 6 �Ǵ� 9�� �ش��ϴ� ���
	 �ش� ���� ��ſ� 3, 6, 9�� ���ԵǴ� ������ŭ ��*�� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Num3 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int result = 0; //�ʱ�ȭ
			
			int a = i/10;	//10���ڸ�
			int b = i%10;	//1���ڸ�
			
			if (a == 3 || a == 6 || a == 9) {
				result++;
			}
			if (b == 3 || b == 6 || b == 9) {
				result++;
			}
			
			if (result == 1) { 
				
				System.out.println("*");
				
			} else if (result == 2) {
				
				System.out.println("**");
				
			} else {
				
				System.out.println(i);
			}
		}
		
	}

}
