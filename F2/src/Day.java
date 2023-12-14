
import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		  int  n=scan.nextInt();
		  int i;
		  int []arr=new int[7];
		  for(i=0;i<7;i++)
			  arr[i]=scan.nextInt();i=0;

		  while(n>0) {
			  n=n-arr[i%7];
			  i++;
		  }
		  System.out.println((i-1)%7+1);
		  
		     }
	
}
