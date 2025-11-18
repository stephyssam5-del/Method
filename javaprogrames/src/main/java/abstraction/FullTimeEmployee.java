package abstraction;

public class FullTimeEmployee  extends Employee {
final int STANDARD_WORKING_HOURS=8;

	public static void main(String[] args) {
FullTimeEmployee f=new FullTimeEmployee ("Stephy", 1000) ;
f.setName("Stephy");
System.out.println("Name Of Employee :-" +f.getName());
f.setPaymentPerHour(1000);
System.out.println("Payment per Hour :-" +f.getPaymentPerHour());
System.out.println("Payment for Employee with constant working 8 hours for a day:- " +f.calculateSalary());
Contracter c=new Contracter("Stephy",2000, 9);
c.setWorkingHours(9);
System.out.println("Working Hours for employee :-" +c.getWorkingHours());
c.setPaymentPerHour(2000);
System.out.println("Payment per Hour for 9 working hours :-" +c.getPaymentPerHour());
System.out.println("Payment for Employee with given working hours for a day:- " + c.calculateSalary());
}

public FullTimeEmployee(String name,int paymentPerHour) {
super(name,paymentPerHour);
}
@Override
public int calculateSalary() {
return  getPaymentPerHour() * 8;
	}
		

}

