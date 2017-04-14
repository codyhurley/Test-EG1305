import java.util.Scanner;
public class Array {
	
	private static int [] array;

	public static void main(String[] args) {
		
		System.out.println("This program will find the highest, lowest, average, and sum of the numbers you will enter.");
		
		getArray();
		
		showHighest();
		
		showLowest();
		
		showTotal();
		
		
		
		
	}
	
	public static int[] getArray() {
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		int number;
		
		System.out.println("How many numbers do you want?");
		size = sc.nextInt();
		
		array = new int [size];
		
		System.out.println("Please enter a series of " + size + " numbers.");
		
		for (int counter = 0; counter < array.length; counter ++) {
			
			System.out.print("Enter number " + counter + ": ");
			number = sc.nextInt();
			System.out.println(" ");
			
			
		}
		
		return array;
		
		
	}
	
	public static int showHighest() {
		
		int highest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > highest) {
				
				highest = array[i];
				
			}
			
			
		}
		
		System.out.println("The highest number is " + highest);
		
		return highest;
		
	}
	
	public static int showLowest() {
		
		int lowest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < lowest) {
				
				lowest = array[i];
				
			}
			
		}
		
		System.out.println("The lowest number is " + lowest);
		
		return lowest;
	}
	
	public static int showTotal() {
		
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			total += array[i];
			
		}
		
		System.out.println("The total is " + total);
		
		return total;
	}
	
	public static double showAverage() {
		
		double total = 0;
		double average;
		
		for (int i = 0; i < array.length; i++) {
			
			total += array[i];
			
		}
		
		average = (double) total / array.length;
		
		return average;
		
	}
}
