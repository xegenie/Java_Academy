package JavaMission;

import java.util.Scanner;

/*
  ?��?�� ?��?���? ?��?�� 받아, ?��?��?�� �??�� N?�� 초기?��?��?���?, ?��?�� 1�??�� N까�? ???��?�� ?��계�? 짝수?�� ?���? 그리�? ?��?�� N?�� ?��
?���? 구하?�� ?��?�� <출력>�? 같이 출력?��?�� ?��로그?��?�� ?��?��?��?��?��. ( 1 ?�� N ?�� 100 )


?? (?���?)
10?�� ?��?��받아?��,
1�? 줄에?�� 1~N?�� ???�� ???��?�� ?��?�� �? ?���?,
2�? 줄에?�� 1~N?�� ???�� 짝수?�� ?��?�� �? ?���?,
3�? 줄에?�� N?�� ?��?���? 출력?��?��?��.

?��?��
10 

출력
1+3+5+7+9=25
2+4+6+8+10=30
1 2 5 10
*/
public class Num2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		
		//???��
		for (int i = 1; i <= N; i++) {
			if (i%2 == 1) {
				System.out.print(i);
				sum1 += i;
			}
			else if (i<N) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum1);
		
		//짝수
		for (int i = 1; i <= N; i++) {
			if (i%2 == 0) {
				System.out.print(i);
				sum2 += i;
			}
			else if (1 < i && i < N) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum2);
		
		//?��?��
		int divisor = 1;
		
		for (int i = 0; i < N; i++) {
			if ( N%divisor == 0 ) {
				System.out.print(divisor+" ");
			}
			divisor++;
		}
		
		sc.close();
	}
	
}



