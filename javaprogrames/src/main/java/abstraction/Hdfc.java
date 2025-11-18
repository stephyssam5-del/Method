package abstraction;

public class Hdfc implements Rbi{

public static void main(String[] args) {
	Hdfc customerAccount = new Hdfc();
    double monthlyDeposit = 5000; // in Rupees
    int tenureYears = 5; // in years
double totalAmount=customerAccount.recurringDeposit(20000.56d,5);

    System.out.println("Customer depositing a monthly amount of: \u20B9" + monthlyDeposit);
    System.out.println("For a duration of: " + tenureYears + " years (" + (tenureYears * 12) + " months)");
    System.out.println("At an annual interest rate of: " + Rbi.INTEREST_RATE + "%");
    System.out.println("Total amount receivable at maturity: \u20B9" + String.format("%.2f", totalAmount));

	}
@Override
public double recurringDeposit(double monthlyAmount, int durationYears) {
int durationMonths = durationYears * 12;
double monthlyInterestRate = (INTEREST_RATE / 100) / 12;
double totalDeposited = monthlyAmount * durationMonths;
double totalInterest = (monthlyAmount * durationMonths * (durationMonths + 1) * (INTEREST_RATE / 100)) / (2 * 12);
double maturityAmount = totalDeposited + totalInterest;
return maturityAmount;
		
	}
}
