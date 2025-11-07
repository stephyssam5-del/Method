package polymorphism;

public class Methodoverriding extends Runtime {
public void element(int a) {
super.element(12);
System.out.println(a);
System.out.println("Hai");
}
public static void main(String[] args) {
Runtime m=new Methodoverriding();
m.element(20);


	}

}
