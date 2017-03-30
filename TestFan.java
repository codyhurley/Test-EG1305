import java.util.Scanner;
public class TestFan {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int speed;
		boolean fanStatus;
		int radius;
		String color;
		
		
		
		
		System.out.println("Please enter your fan's speed.");
		speed = sc.nextInt();
		
		System.out.println("Turn it on? True or false?");
		fanStatus = sc.nextBoolean();
		
		System.out.println("What's the radius?");
		radius = sc.nextInt();
		
		System.out.println("What color is it?");
		color = sc.next();
		
		
		
		
		Fan f1 = new Fan(speed, fanStatus, radius, color);
		System.out.println(f1.toString());
		
		
	}
	
}
