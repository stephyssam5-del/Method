package encapsulation;

public class Addresss{
	String street;
    String city;
    String state;
    String zipCode;
public static void main(String[] args) {
StudentDetails s=new StudentDetails("Stephy",20);
System.out.println("\n--- Student Details ---");
System.out.println("Name :- " +  s.getName() );
System.out.println("Roll Number:-" + s.getRollNumber());
Addresss a=new Addresss("konni","pathnamthitta","kerala","689692");
System.out.println( "Address Details :- " + a.getFullAddress());
}
	public Addresss(String street,String city,String state, String zipCode) {
	this.street=street;
	this.city=city;
	this.state=state;
	this.zipCode=zipCode;
	}
public String getFullAddress() {
	return street + ", " + city + ", " + state + " - " + zipCode;
}
	
	

	}


