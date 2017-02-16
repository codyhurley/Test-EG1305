import java.util.Scanner;
public class CompareNumbers {

	public static void main(String[] args) {
		
		// Scanner and integers
		
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int sum;
		int product;
		double average;
		
		System.out.println("Enter the first integer: ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second integer: ");
		num2 = sc.nextInt();
		
		System.out.println("Enter the third integer: ");
		num3 = sc.nextInt();
		
		System.out.println("For the numbers " + num1 + ", " + num2 + ", " + num3 + ", ");
		
		if ( num1 > num2 && num1 > num3) {
			System.out.println("Largest is " + num1);
		} else if ( num2 > num1 && num2 > num3) {
			System.out.println("Largest is " + num2);
		} else {
			System.out.println("Largest is " + num3);
		}
		
		if ( num1 < num2 && num1 < num3) {
			System.out.println("Smallest is " + num1);
		} else if ( num2 < num1 && num2 < num3) {
			System.out.println("Smallest is " + num2);
		} else {
			System.out.println("Smallest is " + num3);
		}
		
		sum = num1 + num2 + num3;
		System.out.println("The sum is " + sum);
		
		product = num1 * num2 * num3;
		System.out.println("The product is " + product);
		
		average = (double) (( num1 + num2 + num3 )/3);
		System.out.println("The average is " + average);

	}

}
