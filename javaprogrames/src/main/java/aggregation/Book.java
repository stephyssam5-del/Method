package aggregation;

public class Book {
float c;
char e;
Student s;

	public static void main(String[] args) {
Student t=new Student(12,"Hai");
Book b=new Book(12.0f,'t',t);
b.enter();


	}
public Book(float c,char e,Student s) {
this.c=c;
this.e=e;
this.s=s;
}
public void enter() {
System.out.println(c);
System.out.println(e);
s.element();

}
}
