import java.util.Scanner;
public class DigitFL {
	public static int getDigits(int number) {
	     int total = 0;
	     while(number!=0) {
	        total++;
	        number=number/10;
	     }
	     return total;
	  }
		  public static int getSum(int number) {
		     int lD, fD, divisor;
		     int totalDigits = 0;
		     int sum = 0;
		     lD = number%10;
		     totalDigits = getDigits(number);
		     divisor=(int)Math.pow(10, totalDigits-1);
		     fD = number/divisor;
		     sum = fD+lD;
             return sum;
		  }
		 public static void main(String[] args) {
		     int number;
		     int sum = 0;
		     Scanner scan=new Scanner (System.in);
				int t=scan.nextInt();
				while(t-->0) {
			  number=scan.nextInt();
				sum = getSum(number);
		     System.out.println(sum);
		  }
		  }
	}


