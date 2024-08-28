package Day16.Ex01_ByteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteTestInput {
	
	public static void main(String[] args) {
		
		// 바이트 스트림 클래스
		// FileInputStream 객체로 바이트 코드(이전 데이터)를 그대로 입력
		//	-> 문자 스트림 클래스는 데이터를 문자로 변환
		//	-> 바이트 스트림 클래스는 데이터를 문자로 변환하는 작업을 직접 하지 않는다.
		
		byte[] data = new byte[1024];
		
		try {
			FileInputStream fis = new FileInputStream("./src/Day16/Test.txt");
			int i = 0, b;
			
			int byteText = fis.read(data);	// 바이트 배열에 데이터 입력
			// 바이트 배열 data를 인덱스 0부터 마지막 바이트(byteText)까지 UTF-8 인코딩 후 무자열 반환
			String text = new String(data, 0, byteText, StandardCharsets.UTF_8);
			System.out.println(text);
			
		} catch (IOException e) {
			System.err.println("입출력시, 예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}

}
