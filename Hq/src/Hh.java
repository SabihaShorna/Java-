import java.util.Scanner;

public class Hh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t = scan.nextInt();
	    long i,a,b,sum=0;
		while(t-->0) {
		
		a=scan.nextInt();
	    b=scan.nextInt();
		for( i=a; i<=b;i++) {
		sum+=i;	
		}
		}
		System.out.println(sum);
}
}
