package sh1;
import java.util.Scanner;
public class shoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		
	    int n,i,j;
		System.out.print("Enter any number :");
		n = scan.nextInt();
		//System.out.print("The number from 1 to " +n+ " is : ");
		
		
		for(i = 1; i <= n; i++) {
	      
		for(j = 1; j <= i*2-1; j++) {
	     if (i % 2 == 0) {
	    	 System.out.print("+");
	     }
		else {
			System.out.print("*");
	       	}
		}
		System.out.print("\n");
		}
	}
}