import java.util.Scanner;

public class numberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		int num=n;
		count = countOfDigits(n);
		System.out.println("The number "+num+" has "+count+" digits");
		sc.close();
	}

	private static int countOfDigits(int n) {
		int count=0;
		while(n!=0)
		{
		  n=n/10; 
		  count++;
		}
		return count;
	}

}
