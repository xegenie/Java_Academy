package Day04;

public class Ex04_Foreach {
	
	public static void main(String[] args) {
		
		// 배열 선언 및 초기화
		String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		
		// foreach : ctrl + space
		// - for ( 자료형 반복요소명 : 배열 ) { }
		// 배열 또는 컬렉션의 모든 요소를 순서대로 "전부"반복
		for (String day : week) {
			System.out.print(day + " ");	//day
		}
		System.out.println();
		// 기본 for문
		// 초기식과 조건에 따라 변칙적으로 반복
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
		}
		System.out.println();
	}

}
