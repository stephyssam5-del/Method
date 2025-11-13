package multipleinheritance;

public class Task implements ParentInterface,SuperInterface{

	public static void main(String[] args) {
Task t=new Task();
t.enter();
t.display();

	}
@Override
public void enter() {
System.out.println("Text");
}
@Override
public void display() {
System.out.println("Hai");
	
}
	
}

