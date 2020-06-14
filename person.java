package capStone;

public class person {

	//Attributes
	String personName;
	String telephoneNumber;
	String email;
	String physicalAddress;
	String personProfession;
	
	
	public person(String personName,String telephoneNumber,String email,String physicalAddress,String personProfession) {
		this.personName=personName;
		this.telephoneNumber=telephoneNumber;
		this.email=email;
		this.physicalAddress=physicalAddress;
		this.personProfession=personProfession;
	}
	
	
	public String personInfo() {
		String output="Person Name: "+personName+"\n"+"Telephone Number: "+telephoneNumber+"\n"+"Email: "+email+"\n"+"Person Address: "+physicalAddress+"\n"+"Project Role: "+personProfession+"\n";
		return output;
	}
	
	public void updateContactInfo(String newNumber) {
		this.telephoneNumber=newNumber;
	}
	
	

}
