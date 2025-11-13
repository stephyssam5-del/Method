package multilevelinheritance;

public class FinalSettlement extends CalculationOfPayment {
double totalSalary;
public static void main(String[] args) {
FinalSettlement f=new FinalSettlement();
f.getDetails();
f.calculateDetails();
f.calculateTotalSalary();
f.displaySalarySlip();
}
public void calculateTotalSalary() {
this.totalSalary = this.basicPay + this.hra - this.pf - this.deduction + this.bonus;
}

public void displaySalarySlip() {
    System.out.println("\n--- Salary Slip ---");
    System.out.println("Basic Pay: " + this.basicPay);
    System.out.println("Deduction: " + this.deduction);
    System.out.println("Bonus: " + this.bonus);
    System.out.println("House Rent Allowance (HRA): " + this.hra);
    System.out.println("Provident Fund (PF): " + this.pf);
    System.out.println("Total Salary by Hand: " + this.totalSalary);
    System.out.println("--------------------");
   
}	
}


