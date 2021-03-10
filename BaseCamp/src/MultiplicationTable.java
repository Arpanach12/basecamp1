import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter the number : ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<13;i++)
    	  System.out.println(n+" x "+i+" = "+n*i);
		
		in.close();
	}

}
