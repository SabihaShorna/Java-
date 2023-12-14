import java.util.Scanner;
public class LcmGcd {
	static long gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		else 
			return gcd(b,a%b);
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		long a,b,gcd=0,lcm;
		int t=scan.nextInt();
		while(t-->0) {
		a=scan.nextInt();
	    b=scan.nextInt();
	    lcm=(a*b)/gcd(a,b);
	    System.out.printf("%d %d\n",gcd(a,b),lcm);
			  }
		   }
         }
