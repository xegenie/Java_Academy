package JavaMission;

import java.util.Scanner;

/*
  ?? (조건)
- do~while �?, switch �?, static 메소?�� ?��?�� �? ?��출을 반드?�� ?��?��?��?��?��.
- ?��?��1~3 ?��?�� ?��, ?��?�� 메뉴 ?��름과 주문?��?�� 문구�? 출력?��?��?��.
- ?��?�� 0~3 ?��?��?�� 번호�? ?��?��?���?, 0~3 ?��?��?�� 번호�? ?��?��?��?���? ?���??��?�� ?��?��문구�? 출력?��?��?��.
- ?��?�� 0 ?��?�� ?��, 주문?�� 메뉴 개수?? 주문?���? 메시�?�? 출력?��?��?��.

5

치킨 메뉴?��

?��?��결과
?��?���? 같이, 치킨 메뉴?��?�� 출력?���?, 메뉴번호�? ?��?��?���?, ?��?�� <?��?��결과>?? 같이 출력?��?��
?��로그?��?�� ?��?��?��?��?��.


********** 치킨 메뉴?�� **********
1. ?��금올리브 반반?�� 치킨
2. 뿌잉?�� 치킨
3. 처갓집에?�� ?��?��?���? 만든 치킨
0. 종료
********** 번호 : 2
?�뿌?��?�� 치킨?�이(/�?) 주문?��?��?��?��?��.

********** 치킨 메뉴?�� **********
1. ?��금올리브 반반?�� 치킨
2. 뿌잉?�� 치킨
3. 처갓집에?�� ?��?��?���? 만든 치킨
0. 종료
********** 번호 : 5
(0~3) ?��?��?�� 번호�? ?��?��?��주세?��.

********** 치킨 메뉴?�� **********
1. ?��금올리브 반반?�� 치킨
2. 뿌잉?�� 치킨
3. 처갓집에?�� ?��?��?���? 만든 치킨
0. 종료
********** 번호 : 0

�? 5 개의 ?��?��?�� 주문?��?��?��?��?��.
 */


public class Num5 {
	
	public static String menu(int a) {
		
		String menuName = " ";

		switch (a) {

		case 1:
			menuName = "?��금올리브 반반?�� 치킨";
			break;
		case 2:
			menuName = "뿌잉?�� 치킨";
			break;
		case 3:
			menuName = "처갓집에?�� ?��?��?���? 만든 치킨";
			break;

		default:
			break;
		}

		return menuName;

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menuNo = 0;

		int count = 0;

		do {
			System.out.println("***** 치킨 메뉴?�� *****");
			System.out.println("1. ?��금올리브 반반?�� 치킨");
			System.out.println("2. 뿌잉?�� 치킨");
			System.out.println("3. 처갓집에?�� ?��?��?���? 만든 치킨");
			System.out.println("0. 종료");
			System.out.print("***** 번호 :");
			menuNo = sc.nextInt();
			if (menuNo == 0)
				break;

			if (menuNo >= 0 && menuNo <= 3) {
				System.out.println("\n'" + menu(menuNo) + "'" + "?��(/�?) 주문?��?��?��?��?��.\n");
				count++;
			} else {
				System.out.println("\n0~3 ?��?��?�� 번호�? ?��?��?�� 주세?��.\n");
			}

		} while (menuNo != 0);
		System.out.print("\n�? " + count + " 개의 ?��?��?�� 주문?��?��?��?��?��.");

		sc.close();
	}

}
