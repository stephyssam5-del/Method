package exception;

public class ThrowsException {

	public static void main(String[] args) throws VotingException{
int age=5;
if(age>=18) {
System.out.println("Qualified for voting");
}
else {
throw new VotingException("Not qualified for voting");
}

	}

}
