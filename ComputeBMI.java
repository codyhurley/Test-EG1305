import javax.swing.JOptionPane;
public class ComputeBMI {

	public static void main(String[] args) {
		
		String inputWeight;  // User's weight in pounds
		String inputHeight;  // User's height in inches
		int height = 0;
		int weight = 0;
		double BMI = 0;
		
		// Get the weight
		inputWeight =
		        JOptionPane.showInputDialog("Please enter your weight " + "in pounds. ");
		
		// Get the height
		inputHeight =
		        JOptionPane.showInputDialog("Please enter your height " + "in inches. ");
		
		//You have not parsed the information you received from the user to height and weight.
		//At this point weight and height are still 0.
		//Please check the example in your slides how to parse from String to int.
		
		// Calculate BMI
		
		BMI = (double) (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
		
		// Display Results
		
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + BMI);
		
		System.exit(0);


		
		

	}

}
