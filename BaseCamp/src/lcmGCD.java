import java.util.Scanner;

public class lcmGCD {
	int l, gcd, rem, a, b;

	void hcf(int n1, int n2) {
		int x, y;

		if (n1 > n2) {
			x = n1;
			y = n2;
		} else {
			x = n2;
			y = n1;
		}

		do {

			rem = x % y;
			x = y;
			y = rem;

		} while (rem > 0);
		gcd = x;
		System.out.println("GCD is " + gcd);
	}

	void lc() {
		l = (a * b) / gcd;
		System.out.println("LCM is " + l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lcmGCD lg = new lcmGCD();
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		lg.a = s1.nextInt();
		lg.b = s1.nextInt();

		lg.hcf(lg.a, lg.b);
		lg.lc();
		s1.close();
	}

}
