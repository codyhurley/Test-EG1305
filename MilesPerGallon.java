import java.text.DecimalFormat;
import java.util.Scanner;
public class MilesPerGallon {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		Scanner sc = new Scanner(System.in);
		
		int milesDriven;
		int gallonsUsed;
		double milesPerGallon;
		
		System.out.println("Please enter the miles driven: ");
		milesDriven = sc.nextInt();
		
		System.out.println("Please enter the gallons of gas used: ");
		gallonsUsed = sc.nextInt();
		
		milesPerGallon = (double) milesDriven / gallonsUsed;
		
		
		System.out.println("Your miles per gallon are: " + formatter.format(milesPerGallon));
		
	}

}
