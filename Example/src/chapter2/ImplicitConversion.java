package chapter2;

public class ImplicitConversion {
	
	public static void main(String[] args) {
		byte bNum =10; // -128 ~ 127 까지만 가능
		int iNum = bNum; // byte형 값이 int형 변수로 대입
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}

}
