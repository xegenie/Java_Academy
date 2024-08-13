package Day07.Ex01_Shape;

public class Circle extends Shape {
	double r;
	
	public Circle() {
		this(0.0);
	}
	public Circle(double r) {
		this.r = r;
	}
	@Override
	double area() {
		return Math.PI * Math.pow(r, 2);
	}
	
	@Override
	double round() {
		return 2 * Math.PI * r;
	}
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
		
	}
}
