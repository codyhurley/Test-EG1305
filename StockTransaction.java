import java.text.DecimalFormat;
public class StockTransaction {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		final double COMMISSION_RATE = .02;
		double amountPaid = 32.87;
		double amountReceived = 33.92;
		double commissionPrior = (amountPaid * COMMISSION_RATE);
		double commissionAfter = (amountReceived * COMMISSION_RATE);
		double resultAmount = ((amountReceived - commissionAfter) - (amountPaid - commissionPrior));
		
		System.out.println("Joe purchased a stock of 1000 shares for $" + amountPaid);
		System.out.print("He also paid his broker $" + formatter.format(commissionPrior));
		System.out.println(" at this time.");
		System.out.println(" ");
		
		
		System.out.println("Joe sold the whole stock later,");
		System.out.print("for $" + amountReceived);
		System.out.println(", and paid his broker $" + formatter.format(commissionAfter));
		
		System.out.println(" ");
		System.out.println("Joe ended up with $" + formatter.format(resultAmount));

	}

}
