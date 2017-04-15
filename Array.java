import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		System.out.println("This program will find the highest, lowest, average, and sum of the numbers you will enter.");
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		System.out.println("How many numbers do you want?");
		size = sc.nextInt();
		
		int [] array = new int [size];
		
		getValues(array);
		
		System.out.println("The highest element is: " + showHighest(array));
		
		System.out.println("The lowest element is: " + showLowest(array));
		
		System.out.println("The total of the elements is: " + showTotal(array));
		
		System.out.println("The average of the elements is: " + showAverage(array));
		
		
	}
	
	public static void getValues(int [] array) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a series of " + array.length + " numbers.");
		
		for (int counter = 0; counter < array.length; counter ++) {
			
			System.out.print("Enter number " + counter + ": ");
			
			array[counter] = sc.nextInt();
			System.out.println(" ");
			
			
		}
		

	}
	
	public static int showHighest(int [] array) {
		
		int highest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > highest) {
				
				highest = array[i];
				
			}
			
			
		}
		
		return highest;
		
		
		
	}
	
	public static int showLowest(int [] array) {
		
		int lowest = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < lowest) {
				
				lowest = array[i];
				
			}
			
		}
		
		
		return lowest;
	}
	
	public static int showTotal(int [] array) {
		
		int total = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			total += array[i];
			
		}
		
		return total;
	}
	
	public static double showAverage(int [] array) {
		
		double total = 0;
		double average;
		
		for (int i = 0; i < array.length; i++) {
			
			total += array[i];
			
		}
		
		average = (double) total / array.length;
		
		return average;
		
	}
}
