package clw2;
import java.util.Scanner;
public class clw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int gcd=1,min;
		System.out.println("Enter a:");
		 int a=scan.nextInt();
		System.out.println("Enter b:");
		 int b=scan.nextInt();
		  
		
		min=(a<b)?a:b;
		for(int i=1;i<=min;i++) {
			if((a%i==0) && (b%i==0))
			gcd=i;
		}
		System.out.print("GCD:"+gcd);
				
	}

}
