package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
Methodoverloading m=new Methodoverloading();
m.element(10,2);
System.out.println(m.element(10.0f,5.0f));
System.out.println(m.element("Hai"));

	}
public void element(int a,int b) {
int c=a/b;
System.out.println(c);
}
public float element(float a,float b) {
float c=a*b;
return c;
}
public String element(String b) {
return b;




}

}
