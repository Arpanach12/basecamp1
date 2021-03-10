import java.util.Scanner;

public class algoToPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a value :  ");
		a=scanner.nextInt();
		System.out.println("Enter b value :  ");
	    b=scanner.nextInt();
	    System.out.println("Before Exection");
	    System.out.println("a = "+a+" b = "+b);
	    scanner.close();
	    if(a>b)
	    	System.out.println("INVALID");
	    else if(a<=0||b<=0)
	    	System.out.println("INVALID");
	    
	    else {
	    for(i=0;i<=10;i++)
	    {
	    	a=a+b;
	    	b=b+10;
	    	System.out.println("a = "+a+" b = "+b);
	    	
	    }
	    
	    }
	}

}
