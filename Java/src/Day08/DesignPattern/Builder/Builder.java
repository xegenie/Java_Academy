package Day08.DesignPattern.Builder;

public class Builder {
	
	public static void main(String[] args) {
		//new Pikachu(100,"전기"); 에너지 타입
		//new Pikachu(1,"전기"); 	레벨 타입
		// 빌더 : 겹치는 타입의 변수를 각각 호출해주기 위함
		Pikachu pikachu = new Pikachu.Builder()
				.energy(100)
				.type("전기")
				.level(10)
				.build();
		System.out.println(pikachu);
	}

}
