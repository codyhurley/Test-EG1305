import java.text.DecimalFormat;
public class Circle {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		int r = 9;
		int d = 2 * r;
		float area = (float)(r * r * Math.PI);
		float perimiter = (float) (2 * Math.PI * r);
		
		System.out.println("The circle's radius is " + r);
		System.out.println("Its diameter is " + d);
		System.out.println("The area is " + formatter.format(area));
		System.out.println("The perimeter is " +formatter.format(perimiter));
		
		

	}

}