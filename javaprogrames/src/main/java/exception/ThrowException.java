package exception;

public class ThrowException {

	public static void main(String[] args) {
int age=10;
if (age>=18) {
System.out.println("qualified for voting");
}
else {
throw new ArithmeticException("not qualified for voting");
}

}

	}


