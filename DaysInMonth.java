import java.util.Scanner;
public class DaysInMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year;
		int month;
		
		System.out.println ("Please enter your year. ");
		year = sc.nextInt();
		System.out.println("Please enter the number of your month (i.e.: 1 - 12)");
		month = sc.nextInt();
		
		// if the Month is February (2)
		if (month == 2) {
			if (month % 4 == 0 && year % 100 == 0) {
				System.out.println("There are 29 days in " + month + "/" + year);
			} else {
				System.out.println("There are 28 days in " + month + "/" + year);
			}
			// if Month is Jan, Mar, May, Jul, August, Oct, or Dec
			
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("There are 31 days in " + month + "/" + year);
		    
			// Otherwise,
		} else {
			System.out.println("There are 30 days in " + month + "/" + year);
		}
		
		

	}

}
