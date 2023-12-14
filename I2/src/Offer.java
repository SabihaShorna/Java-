
import java.util.Scanner;
public class Offer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		  int  t=scan.nextInt();
		  int p,q;
		  double price=0;
	       while(t-->0) {
	    	 q=scan.nextInt();
		     p=scan.nextInt();
		     price=p*q;
		     if(q>1000) {
		    	 price-=(( price* 10.0)/100.0);
		     }
		       System.out.printf("%.6f\n", price);
	       }
	}
}

