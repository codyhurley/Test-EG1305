public class Chess {

	public static void main(String[] args) {
		
		long rice;
		long currentCount = 0;
		long totalOnBoard;
		long onFinalSquare;
		
		for (rice = 0; rice <= 64; rice++) {
			
			if (rice == 0) {
				
				currentCount = rice++;
				
			} else if (rice > 0) {
				
				currentCount += (rice * 2);
				
			}
			
			
			
		}
		
		totalOnBoard = currentCount;
		
		onFinalSquare = currentCount - (currentCount - (64*2));
		
		System.out.println("The total number of grains of wheat on the board are " + currentCount);
		System.out.println("The number of grains on the final square is " + onFinalSquare);

	}

}
