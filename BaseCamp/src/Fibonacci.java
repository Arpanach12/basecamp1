import java.util.*;
public class Fibonacci {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter n value : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[50];
		
		a[0]=1;
		a[1]=2;
		for(int i=2;i<=n;i++)
		{
			a[i]=a[i-2]+a[i-1];
			
		}
		
		for(int j=0;j<=n;j++)
		{
			System.out.print(a[j]+" ");
			
		}
		
		int sum=0;
		for(int k=0;k<=n;k++)
		{
			if(a[k]%2==0)
				sum=sum+a[k];
		}
		
		System.out.println("Sum of even fibbonaci terms are "+sum);
		sc.close();
	}

}
