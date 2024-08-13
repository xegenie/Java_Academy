package JavaMission;

import java.util.Scanner;

/*
  ? •?ˆ˜ ?•˜?‚˜ë¥? ?…? ¥ ë°›ì•„, ? •?ˆ˜?˜• ë³??ˆ˜ N?— ì´ˆê¸°?™”?‹œ?‚¤ê³?, ? •?ˆ˜ 1ë¶??„° Nê¹Œì? ???ˆ˜?˜ ?•©ê³„ì? ì§ìˆ˜?˜ ?•©ê³? ê·¸ë¦¬ê³? ? •?ˆ˜ N?˜ ?•½
?ˆ˜ë¥? êµ¬í•˜?—¬ ?˜ˆ?‹œ <ì¶œë ¥>ê³? ê°™ì´ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•˜?‹œ?˜¤. ( 1 ?‰¤ N ?‰¤ 100 )


?? (?„¤ëª?)
10?„ ?…? ¥ë°›ì•„?„œ,
1ë²? ì¤„ì—?Š” 1~N?— ???•œ ???ˆ˜?˜ ?ˆ˜?‹ ë°? ?•©ê³?,
2ë²? ì¤„ì—?Š” 1~N?— ???•œ ì§ìˆ˜?˜ ?ˆ˜?‹ ë°? ?•©ê³?,
3ë²? ì¤„ì—?Š” N?˜ ?•½?ˆ˜ë¥? ì¶œë ¥?•˜?‹œ?˜¤.

?…? ¥
10 

ì¶œë ¥
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
		
		//???ˆ˜
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
		
		//ì§ìˆ˜
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
		
		//?•½?ˆ˜
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



