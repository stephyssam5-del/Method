package superkeyword;

public class DivisibleChecker extends Addition {

	public static void main(String[] args) {
DivisibleChecker d=new DivisibleChecker();
d.divisibleByTen();

	}
public void divisibleByTen() {
super.operate(10, 10);
int sum =super.operate(10,10);
if (sum  % 10 ==0) {
System.out.println(sum  + " is divisible by 10");
}
else {
System.out.println(sum + " is not divisible by 10");
}
	
}
}


