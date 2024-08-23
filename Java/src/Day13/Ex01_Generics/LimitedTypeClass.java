package Day13.Ex01_Generics;

class X {}

class A extends X {}
class B extends A {}
class C extends A {}

// 타입 매개변수를 A클래스와 그 하위 클래스로만 가능하도록 제한
class D <T extends A> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

// *Number 클래스 타입 매개변수로 사용가능하도록 제한
//	(Integer, Double 등 숫자타입 클래스만 사용가능하도록 제한)
class E < T extends Number > {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class LimitedTypeClass {

	public static void main(String[] args) {
		
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
//		D<X> d4 = new D<X>(); (에러)
	// D클래스는 타입 매개변수를 A클래스로 제한하고 있기 때문에,
	// X클래스로 타입 매개변수 지정 불가
		
		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());
		
		d1.setT(new B());	
		d1.setT(new C());	// 부모클래스인 A클래스로 업캐스팅
		
//		d2.setT(new A());
//		d3.setT(new A());	(에러)
		// d2<B>, d3<C>  <-- 부모객체인 A 대입 불가
		
		
		// * 타입 지정을 생략한 경우,
		// 제네릭 타입을 제한한 A클래스를 기본으로 타입지정하여 생성한다.
		D d5 = new D();		// D<A> d5 .. 
		d5.setT(new B());	
		d5.setT(new C());
		
		
		// E <T extends Number>
		// * Number 클래스로 제한하여 숫자 타입인 클래스들만 타입지정 가능
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
//		E<Boolean> e4 = new E<Boolean>(); (에러) 숫자타입 아님
		
		e1.setT(100);
		System.out.println(e1.getT());
		
		e2.setT(12.34);
		System.out.println(e2.getT());
		
		e3.setT((byte)127); // 그냥 쓴 정수 127은 int타입(4byte)으로 인식
							// e3객체에서 지정한타입을 Byte(1byte)이기 때문에 강제 형변환이 필요하다
		System.out.println(e3.getT());
	}
	
}
