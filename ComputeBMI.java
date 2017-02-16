import javax.swing.JOptionPane;
public class ComputeBMI {

	public static void main(String[] args) {
		
		String inputWeight;  // User's weight in pounds
		String inputHeight;  // User's height in inches
		int height = 0;
		int weight = 0;
		double BMI;
		double results;
		
		// Get the weight
		inputWeight =
		        JOptionPane.showInputDialog("Please enter your weight " + "in pounds. ");
				
				weight = Integer.parseInt(inputWeight);
		
		// Get the height
		inputHeight =
		        JOptionPane.showInputDialog("Please enter your height " + "in inches. ");
		
				height = Integer.parseInt(inputHeight);
		
		// Calculate BMI
		
		BMI = (double) (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
		
		
		// Display Results
		
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + BMI);
		
		System.exit(0);


		
		

	}

}
