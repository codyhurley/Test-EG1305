
public class Circle {

	private double PI = Math.PI;
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(int r) {
		radius = r;
	}
	

	public double getArea() {
		return PI * radius * radius;
	}
	
	public double getDiameter() {
		return radius*2;
	}
	
	public double getCircumference() {
		return 2 * PI * radius;
	}
	
}