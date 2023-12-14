import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0,count=0;
		int n=scan.nextInt();
		int []arr=new int[n];
		 for( i=0;i<n;i++)
		 {
	            arr[i]=scan.nextInt();
		 }
	            for (int j = i + 1; j < n; j++) { 
	                if (arr[i] < arr[j]) 
	                {
	                  count++;
	                }
	         
	            }
		  if (count==n) {
	                System.out.println("psbl");
	        
		  }
		  else 
			  System.out.println("impsbl");
		  
}
}
