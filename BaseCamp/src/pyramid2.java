import java.util.Scanner;
public class pyramid2 {

	static Scanner scanner =new Scanner(System.in);
	static int i,j,k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        System.out.println("Enter the number of rows : ");
        int n = scanner.nextInt();
        pattern(n);
        
	}
	
	private static void pattern(int n) {
		for(i=1;i<=n;i++)
        {
        	for(k=1;k<=n-i;k++)
        	{
        		
        	System.out.print(" ");
        	}
        	
        	for(j=1;j<=i;j++)
        	{  if(i<10)
        		System.out.print(i+"  ");
        	   else if(i>=10||i<=99)
        	    System.out.print(i+" ");	
        	}
        	System.out.println();
        }
        		
	}

}
