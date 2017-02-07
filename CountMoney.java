import java.util.Scanner;
public class CountMoney {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money;
		int dollars;
		int cents;
		int pennies;
		int nickels;
		int dimes;
		int quarters;
		
		System.out.println("Enter the amount of loot you have as an integer. For example, 3459 is 34 dollars and 59 cents: ");
		System.out.println(" ");
		money = sc.nextInt();
		dollars = money / 100;
		cents = money % 100;
		quarters = cents / 25;
		dimes = (cents % 25) / 10;
		nickels = ((cents % 25) % 10)/ 5;
		pennies = (((cents % 25) % 10) % 5);
		
		System.out.println(" ");
		
		System.out.println("Your amount consists of:");
		System.out.println("Dollars = " + dollars);
		System.out.println("Quarters = " + quarters);
		System.out.println("Dimes = " + dimes);
		System.out.println("Nickels = " + nickels);
		System.out.println("Pennies = " + pennies);
		

	}

}
