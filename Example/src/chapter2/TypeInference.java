package chapter2;

public class TypeInference {
	
	//var 알아서 인식,처리
	
	public static void main(String[] args) {
		var i = 10;			//int i = 10
		var j = 10.0;		//double j = 10.0
		var str = "hello";	//String str = "hello"
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; // 다른문자열 가능
		//str = 3; 정수 오류
	}

}
