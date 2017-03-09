import java.util.Scanner;
import java.util.Random;
public class GeneratePassword {
	
	static int input;
	static int counter;
	static int digit;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many digits do you want in your numeric password?");
		input = sc.nextInt();
		
		
		
		randomGenerator();
		//System.out.print(randomGenerator());
			
		

	}
	
	public static void randomGenerator() {
		
		for (counter = 0; counter < input; counter++) {
			
			digit = (int) (Math.random() * 10);
			
			System.out.print(digit);
			
		}
		return ;
		
	}

}
