package Day02;

public class Ex03_Byte {

	public static void main(String[] args) {
		// byte는 1byte 범위에서 정수 데이터를 표현
		// 8bits (0000 0000) :2^8(256개)
		// 양수와 음수로 나누면, -128~127 범위로 표현
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = (byte) 128; // 127이후로 되돌아가서 -128출력
		//128은 기본형 int 여서 byte로 강제 형변환
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
	}
}
