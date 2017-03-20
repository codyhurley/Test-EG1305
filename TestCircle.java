import java.util.Scanner;
public class TestCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		
		c1.setRadius(sc.nextInt());
		
		System.out.println(c1.getRadius());
		System.out.println("The diameter is " + c1.getDiameter());
		System.out.println("The circumference is " + c1.getCircumference());
		System.out.println("The area is " + c1.getArea());
		

	}

}
