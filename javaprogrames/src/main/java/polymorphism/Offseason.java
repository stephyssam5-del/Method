package polymorphism;

public class Offseason extends Onseason {

	public static void main(String[] args) {
Offseason s=new Offseason();
s.discount(1000);
}
@Override
public void discount(double price) {
this.price=price;
super.discount(price);
double discountedPrice=price * (1-0.15);
System.out.println("Discounted price on Offseason :-" + discountedPrice);
}
}
