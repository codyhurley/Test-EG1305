import java.util.Scanner;
public class PaperRockScissors {

	public static void main(String[] args) {
		
		// Scanner and Integers
		Scanner sc = new Scanner(System.in);
		int playerMove;
		int compMove = (int) Math.random();
		
		// Computer's move
		
		
		System.out.println("scissors = 0, rock = 1, paper = 2: ");
		playerMove = sc.nextInt();
		
		switch (playerMove) {
		
			case 0:
				if (compMove == 1) {
					System.out.println("You lose! Rock crushes Scissors");
				} else if (compMove == 2) {
					System.out.println("You win! Scissors cut paper!");
				} else if (compMove == 0) {
					System.out.println("Damn. It's a tie.");
				} else {
					System.out.println("Um... okay, what?");
				}
				break;
				
			case 1:
				if (compMove == 2) {
					System.out.println("You lose! Paper covers Rock!");
				} else if (compMove == 0) {
					System.out.println("You win! Rock crushes scissors!");
				} else if (compMove == 1) {
					System.out.println("Damn. It's a tie.");
				} else {
					System.out.println("Um... okay, what?");
				}
				break;
				
			case 2:
				if (compMove == 0) {
					System.out.println("You lose! Scissors cut paper!");
				} else if (compMove == 1) {
					System.out.println("You win! Paper covers rock!");
				} else if (compMove == 2) {
					System.out.println("Damn. It's a tie.");
				} else {
					System.out.println("Um... okay, what?");
				}
				break;
				
			default:
				System.out.println("I... I don't even know what just happened.");
		}
		

	}

}
