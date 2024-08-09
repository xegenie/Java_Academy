package Day03;

public class Ex14_GuguAll {
	
	public static void main(String[] args) {
		
		// 1단 1*1=1 ... 1*9=9
		// 2단
		// ...
		// 9단			... 9*9=81
		
		// (단)*(1~9(
		// 단에 대한 반복	:1~9
		// 각 단의 곱		:1~9
		
		// 중첩 반복문(이중 반복문)
		// A * B

		for (int A = 1; A <= 9; A++) {
			
			for (int B = 1; B <= 9 ; B++) {
				int result = A*B;
				System.out.print(A+"단 : "+A+"*"+B+"="+result);
				System.out.print("\t"); // 탭(공백)
			}
			System.out.println();
		}
		
	}

}
