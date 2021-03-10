import java.util.*;
public class HailstoneSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		System.out.print("Enter the number : ");
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		count = totalSteps(n);
		System.out.println("There are total "+count+ " steps to reach 1");
		in.close();
	}

	private static int totalSteps(int n) {
		int count=0;
		while(n!=1)
		{
			if(n%2==0)
			{   
				System.out.println(n+" is even so I take half = "+n/2);
				n=n/2;
				count++;
			}
			
			else if(n%2!=0)
			{   
				System.out.println(n+" is odd so I make 3n+1 = "+(3*n+1));
				n=3*n+1;
				count++;
			}
			 continue;
		}
		return count;
	}

}
