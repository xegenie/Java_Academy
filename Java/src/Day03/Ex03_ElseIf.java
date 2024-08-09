package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
	
	public static void main(String[] args) {
		
		// 성적을 입력받아서 성적에 따른 학점 A~F를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		
		// 90점 이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 60점 미만 F
		
		char grade = 'F';
		
		if (score >= 90 && score <= 100) // if 만 사용하여 &&연산으로도 가능
			grade = 'A';

		else if (score >= 80) // if 가 만족되면 실행x 따라서 ( && score < 90) 필요 x
			grade = 'B';

		else if (score >= 70 && score < 80) 
			grade = 'C';

		else if (score >= 60 && score < 70) 
			grade = 'D';

		else
			grade = 'F';
		
		System.out.println(grade);
		
		sc.close();

	}

}
