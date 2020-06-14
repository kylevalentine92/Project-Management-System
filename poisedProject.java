package capStone;

public class poisedProject {

	public static void main(String[] args) {
		//Creating a new project Object
		Project project1=new Project(1,"Vally House","House","2020/10/31","John Green","Tommy Blue",154,"21 Wilson Street","On Track",14000.00,4000.00,"Jeff","Vally");
		//Displaying the information of this project
		//System.out.println(project1.projectInfo());
		
		//Creating a new person object
		person architectJohn=new person("John Green","097 455 4879","johngreen@gmail.com","35 Smith Street","Architect");
		//Displaying person details
		//System.out.println(architectJohn.personInfo());
		
		
		//Changing project due date
		project1.dueDate("2020/10/15");
		//System.out.println(project1.projectInfo());
		
		//Updating amount paid
		//project1.amountUpdate(1000.00);
		//Testing the finaliasing of project
		System.out.println(project1.projectFinalise("2020/06/06"));
		
		}

}
