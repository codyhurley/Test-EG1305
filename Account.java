import java.util.Date;
public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	
	public Account() {
		
	}
	
	public Account(int i, double b, double a) {
		
		id = i;
		balance = b;
		annualInterestRate = a;
		dateCreated = new Date();
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		annualInterestRate = (balance / 100) * 4.5;
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		
		 return annualInterestRate / 12;
		
	}
	
	public void withdraw(double w) {
		
		balance -= w;
		
	}
	
	public void deposit(double deposit) {
		
		balance += deposit;
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}
	
	
	
}
