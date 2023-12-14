import java.util.Arrays;
import java.util.Scanner;
public class SmallSum {
static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int length=scan.nextInt();
			int arr[]=new int[length];
			 for(int i=0; i<length; i++ ) {
		         arr[i] = scan.nextInt();
			 }
			Arrays.sort(arr);
			 sum=arr[0]+arr[1];
System.out.println(sum);
		}
}
}

