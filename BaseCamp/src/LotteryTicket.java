import java.util.Scanner;

 public class LotteryTicket {
	 
 int ret(int a,int b,int c)
{
	if(a==b && b==c)
		return 20;
	else if(a==b || b==c || c==a)
		return 10;
	else return 0;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,x,y,z;
		LotteryTicket LT= new LotteryTicket();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value :  ");
		x=sc.nextInt();
		System.out.println("Enter 2nd value :  ");
		y=sc.nextInt();
		System.out.println("Enter 3rd value :  ");
		z=sc.nextInt();
        r=LT.ret(x,y,z);
        System.out.println("LotteryTicket( "+x+","+y+","+z+")"+"->"+" "+r);
        sc.close();
	}

}
