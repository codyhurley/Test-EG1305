import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		// Scanner and Integer Values
		
		
		
		Scanner sc = new Scanner(System.in);
		int playerGuess;
		int actualNumber = (int) (Math.random() * 100 + 1);
		
		// Take user input
		System.out.println("Pick a number between 1 and 100, inclusive: ");
		
		// Loop if playerGuess is not actualNumber
		
		do {
			
			playerGuess = sc.nextInt();
			
			if (playerGuess > actualNumber) {
				System.out.println("Too high!");
			} else if (playerGuess < actualNumber) {
				System.out.println("Too low!");
			}
			
		} while (playerGuess > actualNumber || playerGuess < actualNumber);
		
		// If playerGuess IS actualNumber
		
		if (playerGuess == actualNumber) {
			System.out.println("You got it!");
		}
		
		

	}

}
