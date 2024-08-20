package Day09.Ex07_Review.추상클래스;

public class User {

	public static void main(String[] args) {
		Computer computer = new Desktop();
//		Computer computer2 = new Laptop(); 추상 클래스는 객체로 생성할 수 없다.
		Computer computer2 = new MacBook();
		
		Laptop laptop = new MacBook();
		MacBook macbook = new MacBook();
		
		computer.on();
		computer.display();
		computer.typing();
		computer.off();
		System.out.println();
		
		computer2.on();
		computer2.display();
		computer2.typing();
		computer2.off();
		System.out.println();
		
		laptop.on();
		laptop.display();
		laptop.typing();
		laptop.off();
		System.out.println();
		
		macbook.on();
		macbook.display();
		macbook.typing();
		macbook.off();
		System.out.println();
	}
	
}
