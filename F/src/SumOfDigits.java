import java.util.Scanner;
public class SumOfDigits {
static int getSum(int n) {     
	        int sum = 0; 
	       while (n != 0) 
	        { 
	         sum+=n % 10; 
	         n= n/10; 
	        } 
	       return sum; 
      } 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int n=scan.nextInt();
			System.out.println(getSum(n));
		}

	}

}
