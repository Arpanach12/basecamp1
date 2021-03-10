import java.util.*;

//import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,num;
		//  n=5;
		 System.out.print("Enter the value : ");
		 Scanner in = new Scanner(System.in);
		 n=in.nextInt();
		  num=n;
		  System.out.println("factorial of "+num+" = "+fact(n));
		 in.close();
	}

	private static int fact(int n) {
		int factorial=1;
		while(n!=1)
		  {
		  factorial=factorial*n;
		  n--;
		  }
		return factorial;
	}

}
