package _1000;

/*두 정수를 입력받아 아래와 같이 출력하시오.

예)  3 2

3+2=5
3-2=1
3*2=6
3/2=1
*/
import java.util.Scanner;

public class _1116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + (a/b));
	}

}
