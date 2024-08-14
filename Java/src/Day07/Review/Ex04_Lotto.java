package Day07.Review;

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		
		//Math.random() : 0.xxxx ~ 0.9xxxx
		
		//(int)(Math.random() * 10)		:0~9
		//(int)(Math.random() * 10)+1	:1~10
		System.out.println((int)(Math.random() * 10)+1);
		
		int dice = (int)(Math.random() * 6 +1);
		System.out.println("주사위 : "+dice);
		
		// 공식 : (int)(Math.random() * 개수) +시작숫자);
		System.out.println("(1~20)");
		System.out.println((int)(Math.random()*20)+1);
		// -20~20 사이의 랜덤수
		System.out.println("(-20~20)");
		System.out.println((int)(Math.random()*41)-20);
		
		// 1~45 사이의 랜덤수 6개를 배열에 지정하시오.
		System.out.println("arr[6]");
		int arr[] = new int[6];
		
		// 중복제거, 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random() * 45) + 1;
			arr[i] = r;
			
			for (int j = i-1; j >= 0; j--) {
				if (r == arr[j]) {
					i--;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
