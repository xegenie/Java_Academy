package Day08.Ex02_MultiImpliment;

public interface RemoteControl {
	
	// 상수
	// 최저 속력, 최고 속력 상수를 선언하시오.
	// * 인터페이스는 변수 선언 시, (public static final)이 자동으로 선언된다.
	int MAX_VOLUME = 300;
	int MIN_VOLUME = 0;
	
	// 추상메소드
	// * (public abstract)가 자동으로 선언된다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setChannel(int Channel);
	
	// 디폴트 메소드
	//	:구현한 객체가 오버라이딩하지 않아도 기본으로 사용할 수 있는 메소드
	default void parking(boolean mute) {
		if (mute) {
			System.out.println("음소거 설정되었습니다.");
			setVolume(MIN_VOLUME);
		}
		else {
			System.out.println("음소거 해제되었습니다.");
			setVolume(10);
		}
	}
	
	// static 메소드
	//	: 구현 객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changBatter() {
		System.out.println("배터리를 교체하였습니다.");
	}

}
