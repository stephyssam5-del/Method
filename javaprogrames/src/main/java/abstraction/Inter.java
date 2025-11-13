package abstraction;

public class Inter implements Interface{

	public static void main(String[] args) {
Inter a=new Inter();
a.element();
a.enter(4,6);

	}
@Override
public void element() {
System.out.println("text");
}
public void enter(int a,int b) {
int c=a+b;
System.out.println(c);
System.out.println("Hai");
	
}
}
