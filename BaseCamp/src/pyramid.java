
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(2*n);j++)
			{
				if(j < (n-i) || j > (n+i))
					System.out.print(" ");
				else {
					if(j%2 == i%2)
						System.out.print(String.valueOf(i+1));
					else
						System.out.print(" ");
				}
			}	
			System.out.println();
		}
				
	}
	
}
