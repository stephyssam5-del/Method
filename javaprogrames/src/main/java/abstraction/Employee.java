package abstraction;

public abstract class Employee {
String name;
int paymentPerHour;
abstract int calculateSalary();
public Employee(String name,int PaymentPerHour) {
this.name=name;
this.paymentPerHour=paymentPerHour;
}
public void setName(String name) {
this.name=name;
}
public String getName() {
return name;
}
public void setPaymentPerHour(int paymentPerHour) {
this.paymentPerHour=paymentPerHour;

}
public int getPaymentPerHour() {
return paymentPerHour;

}
}
