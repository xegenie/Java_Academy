package operator;

public class OperationEx5 {
	
	public static void main(String[] args) {
		int num = 0B00000101; //5를 8비트 2진수로 나타냄
		
		System.out.println(num << 2); // 왼쪽으로 2비트 이동 00010100
		System.out.println(num >> 2); // 오른쪽으로 2비트이동 00000001
		System.out.println(num >>> 2); // 오른쪽으로 2비트 이동 00000001

		System.out.println(num);
		
		num = num << 2; //왼쪽으로 2비트 이동한 값을 다시 num에 대입
		System.out.println(num);
		


	}

}
