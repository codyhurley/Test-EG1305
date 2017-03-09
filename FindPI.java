import java.util.Scanner;
public class FindPI {
	
	static int iterations;
	static int counter;
	static long start;
	static double pi;
	static long timeSpan;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		iterations = sc.nextInt();
		
		timeTaken();
		
		
		
		
		
	}
	
	public static void timeTaken() {
		
		start = System.nanoTime();
		timeSpan = System.nanoTime() - start;
		
		for (counter = 0; counter < iterations; counter ++) {
			
			pi = 4*((Math.pow(-1,counter))/(2*counter + 1));
			
		}
		
		System.out.println("PI = " + pi + " after " + iterations + " iterations.");
		System.out.println(" ");
		System.out.println("It took " + (timeSpan) + " seconds to complete this operation.");
		
		
	}

}
