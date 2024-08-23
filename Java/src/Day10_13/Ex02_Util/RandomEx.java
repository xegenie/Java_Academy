package Day10_13.Ex02_Util;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random random = new Random();
		
		// 동전 던지기
		boolean randomTF = random.nextBoolean();
		System.out.println("동전 앞뒤 : "+randomTF);
		
		System.out.println("동전 던지기");
		if (randomTF) System.out.println("앞면");
		else System.out.println("뒷면");
		
		// 정수형 랜덤 수
		// * 4byte : 32bits (2^32 : -21억~21억..) 사이의 난수
		int fourByteRandom = random.nextInt();
		System.out.println("fourByteRandom : "+fourByteRandom);
		
		// 주사위 던지기
		// random.nextInt(N)	: ( 0~N -1 ) 사이의 임의 정수 반환
		// [공식] random.nextInt( 갯수 ) + 시작숫자
		int dice = random.nextInt(6) + 1;
		System.out.println("주사위 : "+dice);
		
		// 로또
		int lotto = random.nextInt(45) + 1;
		System.out.println("로또번호 : " + lotto);
		
		// 실수형 랜덤 수
		double randomDouble = random.nextDouble();
		System.out.println("실수형 랜덤 수 : " + randomDouble);
		
	}
	
}
