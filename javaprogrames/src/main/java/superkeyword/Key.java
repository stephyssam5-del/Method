package superkeyword;

public class Key extends Keyword {
int a=15;

	public static void main(String[] args) {
Key k=new Key();
k.enter();

	}
public void enter() {
System.out.println(a);
System.out.println(super.a);

}
}
