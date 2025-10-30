package inheritance;

public class Daughter extends Mother{

	public static void main(String[] args) {
Daughter d=new Daughter();
d.sum(5,6);
d.display();
	}
public void sum(int a,int b) {
int c=a+b;
System.out.println(c);
}
}
