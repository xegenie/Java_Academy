package test;


// 클래스 호출

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(sum);
	
		name();
	}

	private static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
	
	public static void name() {
		int a = 1;
		int b = 2;
		int sum1 = add(a,b);
		System.out.println(sum1);
	}

}
