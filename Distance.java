import java.util.Scanner;
public class Distance {
	
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	static double distance;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your x and y coordinates.(x1, then x2, then y1, then y2)");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		
		getDistance();
		
		
		
	}

	public static double getDistance() {
		
		distance = Math.sqrt(Math.pow((x1+x2), 2)+(Math.pow((y1+y2), 2)));
		
		System.out.println(distance);
		
		
		return distance;
	}
}
