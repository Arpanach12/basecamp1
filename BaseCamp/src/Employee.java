import java.util.*;
public class Employee {
	
	static int deptCode; 
	static String empID ;
	static String jobBand;
	
	public static void main(String[] args) {
		getDetails();
		showDetails();
	}
	static void getDetails()
	{
		System.out.print("Enter Employee ID : ");
		Scanner s1=new Scanner(System.in);
		empID = s1.nextLine();
		
		System.out.println("Enter Job Band : ");
		jobBand = s1.nextLine();
		
		System.out.println("Enter Department code : ");
		deptCode = s1.nextInt();
		
		s1.close();
	}
	
	static void showDetails()
	{
		
		boolean test1=jobBand.equals("C1")||jobBand.equals("C2")||jobBand.equals("C3")||jobBand.equals("C4");
		boolean test2=deptCode>=110 && deptCode<=125;
		if(test1&&test2)
			{
			System.out.println("Employee ID is "+empID);
			System.out.println("Employee Job Band is "+jobBand);
		    System.out.println("Department code is "+deptCode);
			}
		else
			System.out.println("INVALID");
			}

}
