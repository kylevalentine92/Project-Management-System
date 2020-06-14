package capStone;
import java.util.Date;
public class Project {
	//Attributes
	int projectNumber;
	String projectName;
	String type;
	String projectDeadline; //Would like to in future format this as a date
	String assignedArchitect;
	String assignedContractor;
	int erfNumber;
	String projectAddress;
	String projectStatus;
	double totalFee;
	double amountPaid;
	String customerName;
	String customerSurname;
	String completionDate;
	
	//Method
	public Project(int projectNumber,String projectName,String type,String projectDeadline,String assignedArchitect,String assignedContractor,int erfNumber,String projectAddress,String projectStatus,double totalFee,double amountPaid,String customerName,String customerSurname) {
		this.projectNumber=projectNumber;
		this.projectName=projectName;
		this.type=type;
		this.projectDeadline=projectDeadline;
		this.assignedArchitect=assignedArchitect;
		this.assignedContractor=assignedContractor;
		this.erfNumber=erfNumber;
		this.projectAddress=projectAddress;
		this.projectStatus=projectStatus;
		this.totalFee=totalFee;
		this.amountPaid=amountPaid;
		this.customerName=customerName;
		this.customerSurname=customerSurname;
		this.completionDate="N/A";
	}
	
	public String projectInfo() {
		String output="Project Number: "+projectNumber+"\n"+"Project Name: "+projectName+"\n"+"Project Type: "+type+"\n"+"Project Deadline: " +projectDeadline+"\n"+"Assigned Architect: "+assignedArchitect+"\n"+"Assigned Contractor: "+assignedContractor+"\n"+"Erf Number: "+erfNumber+"\n"+"Project Address: "+projectAddress+"\n"+"Project Status: "+projectStatus+"\n"+"Total Cost: "+totalFee+"\n"+"Amount Paid: "+amountPaid+"\n"+"Customer Name: "+customerName+"\n"+"Customer Surname: "+customerSurname;
		return output;
		
	}
		
		public void dueDate(String new_date) {
			this.projectDeadline=new_date;
			
		}
		
		
		public void amountUpdate(double amountPaid) {
			this.amountPaid=this.amountPaid+amountPaid;
			String newAmount=String.valueOf(this.amountPaid);
			String totalFeestr=String.valueOf(this.totalFee);
			double currentBalance=this.totalFee-this.amountPaid;
			String output="Total fee: "+totalFeestr+"\n"+"Total Amount Paid to date: "+newAmount+"\n"+"Current Balance: "+String.valueOf(currentBalance);
			System.out.println(output);
			
		}
		
		public String projectFinalise(String completionDate) {
			this.projectStatus="Completed";
			this.completionDate=completionDate;
			double currentBalance=this.totalFee-this.amountPaid;
			String output="The is an Offical Invoice for: "+"\t"+this.customerName+" "+this.customerSurname+"\n\n\n"+"After the completion of the "+this.type+ " at "+this.projectAddress+" on "+this.completionDate+"\n\n\n"+"The remaining balance owed by "+ this.customerName+" "+this.customerSurname+" is "+ String.valueOf(currentBalance);
			return output;
		}
	

}	


