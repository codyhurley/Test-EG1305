import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// Scanner and variables
		
		Scanner sc = new Scanner(System.in);
		int usersNumber;
		int num;
		boolean primeNumber;
		
		// User's input
		System.out.println("Please enter an integer: ");
		usersNumber = sc.nextInt();
		
		for (num = 2; num < usersNumber; num++) {
			
			if (usersNumber % num == 0) {
				
				primeNumber = false;
				
				
			} else if (usersNumber % num != 0){
				
				primeNumber = true;
				
				if (primeNumber == true) {
					
					System.out.print(num + " ");
					
				}
				
			}
			
			
			
				
			}
			
			
			

		}
	} 


