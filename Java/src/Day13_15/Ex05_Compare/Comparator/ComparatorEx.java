package Day13_15.Ex05_Compare.Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User implements Comparator<User> {
	String id;
	String name;
	int age;
	
	public User() {
	}
	public User(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compare(User o1, User o2) {
		// 정렬 기준1 : 나이순 - 오름차순
		// 정렬 기준2 : 이름순 - 내림차순
		
		// o1 :해당 객체
		// o2 :비교 객체
		
		// 1. 각 개체의 나이를 가져와서 age1, age2로 선언
		// 2. 각 개체의 이름을 가져와서 name1, name2로 선언
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		//정렬 로직 작성
		// o1이 더 큰 객체 > 양수
		// o1과 o2 같은 객체 > 0
		// o1이 더 작은 객체 > 음수
		
		int result = age1 - age2; 			// 정렬기준 1 - 나이순 ↑
		int gap = name1.compareTo(name2);	// 정렬 기준 2 - 이름순 ↓
		
		// 정렬기준 1 - 나이순 ↑
//		if (result > 0) return 1;
//		if (result < 0) return -1;
//		if (result == 0) 
			// 정렬 기준 2 - 이름순 ↓
			// name1 더 큰값(사전순으로 더 뒤) : 양수(+)
			//	- name1 : 황조은, name2 : 김조은 --> 황조은이 앞에 나오게 할 것
//			if ( gap < 0 ) return 1;
//			if ( gap > 0 ) return -1;
//			if ( gap == 0 ) return 0;
//			return -gap;
		
		return result == 0 ? -gap : result; // 나이가 같은 경우에만 이름순 정렬 사용 
	}
	
}

public class ComparatorEx {
	
	public static void main(String[] args) {
		char a =0;
		System.out.println(a);
		List<User> userList = Arrays.asList(
				new User("joeun1004", "홍", 34),
				new User("user1004", "전", 25),
				new User("joeun1234", "김", 25),
				new User("tje0924", "배", 25),
				new User("aloha1001", "황", 25),
				new User("hana0315", "박", 28),
				new User("kje1111", "권", 30),
				new User("leejoeun22", "이", 22) 
				);		
		
		// 정렬 전
		System.out.println("* 정렬 전");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("-----------------------------");
		
		// 정렬
		Collections.sort(userList, new User());
		
		// 정렬 후
		System.out.println("*정렬 후");
		for (User user : userList) {
			System.out.println(user);
		}
		System.out.println("-----------------------------");
		
		List<User> userList2 = Arrays.asList(
				new User("joeun1004", "홍", 34),
				new User("user1004", "전", 25),
				new User("joeun1234", "김", 25),
				new User("tje0924", "배", 25),
				new User("aloha1001", "황", 25),
				new User("hana0315", "박", 28),
				new User("kje1111", "권", 30),
				new User("leejoeun22", "이", 22) 
				);		
		
		// Collections.sort ( 컬렉션, 정렬기준 객체 );
		// * 익명구현객체를 사용하여, 이 시점에서 정렬기준 적용 가능
		Collections.sort(userList2, new java.util.Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				//아이디를 기준으로 오름차순
				String id1 = o1.getId();
				String id2 = o2.getId();
				int result = id1.compareTo(id2);
				return result;
			}
		});
		
		System.out.println("아이디순 오름차순");
		for (User user : userList2) {
			System.out.println(user);
		}
	}

}
