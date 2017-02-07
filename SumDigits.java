import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		
		// Allows the input
		Scanner sc = new Scanner(System.in);
		
		// The variables
		int number;     // The user's input
		int oneDigit;
		int tenDigit;
		int hunDigit;
		int thouDigit;
		int digitSum;
		
		System.out.println("Pick a number between 0 and 1000: ");
				// Asks the user for their number
		number = sc.nextInt();     // the user's number
		oneDigit = number % 10;    // the One digit
		tenDigit = (number / 10) % 10;      // the Ten digit
		hunDigit = ((number / 10) / 10) % 10;     // the Hundred Digit
		thouDigit = (((number / 10) / 10) / 10) % 10;     // the Thousand digit
		
		digitSum = oneDigit + tenDigit + hunDigit + thouDigit;
				// Adds the digits
		
		
		System.out.print("Add 'em up, and you get " + digitSum);
				// Prints the result
		

	}

}
