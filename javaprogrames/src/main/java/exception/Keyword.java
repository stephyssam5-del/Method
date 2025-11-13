package exception;

public class Keyword {

	public static void main(String[] args) {
try {
	int a[]=new int [3];
	a[3]=10/0;
}
catch(ArrayIndexOutOfBoundsException e1) {
	System.out.println(e1);
}
catch(ArithmeticException e2) {
	System.out.println(e2);
	
}

	}

}
