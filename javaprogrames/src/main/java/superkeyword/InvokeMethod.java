package superkeyword;

public class InvokeMethod extends Method{

	public static void main(String[] args) {
InvokeMethod m=new InvokeMethod();
m.details();
}
public void element() {
System.out.println("Hai");
}
public void details() {
element();
super.element();
}
}


