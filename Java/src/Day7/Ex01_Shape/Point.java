package Day7.Ex01_Shape;

public class Point{
	//멤버 변수
	int x, y;
	
	//기본생성자
	public Point() {
		this(0,0);
	}
	//매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
