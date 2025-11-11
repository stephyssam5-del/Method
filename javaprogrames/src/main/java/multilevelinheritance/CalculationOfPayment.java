package multilevelinheritance;

public class CalculationOfPayment extends PaymentDetails {
double hra;
double pf;
public void calculateDetails() {
this.hra=0.05 * this.basicPay;//5% OF BASIC PAY
this.pf=0.20 * this.basicPay;//20% OF BASIC PAY

}
}
