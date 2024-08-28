package Day16.Ex04_Serialization;

import java.io.Serializable;

// 직렬화
// * Seralizable 인터페이스를 구현해야 직렬화 개체를 정의할 수 있다.
public class Person implements Serializable {

	// 직렬화 버전 UID
	private static final long serialVersionUID = 8987500998854844562L;
//	( ID 달라지면 오류 ) 역직렬화 불가
//	private static final long serialVersionUID = -404074865738361825L;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
