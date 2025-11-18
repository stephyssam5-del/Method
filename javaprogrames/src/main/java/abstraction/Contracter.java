package abstraction;

public class Contracter extends Employee{
int workingHours;
public Contracter(String name,int paymentPerHour,int workingHours) {
super(name,paymentPerHour);
this.workingHours=workingHours;
}
@Override
public int calculateSalary() {
return getPaymentPerHour() * workingHours ;
	}
public void setWorkingHours(int workingHours) {
this.workingHours=workingHours;
}
public int getWorkingHours() {
return workingHours;



	
}
}
