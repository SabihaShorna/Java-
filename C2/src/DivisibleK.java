import java.util.Scanner;
public class DivisibleK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		  int  n=scan.nextInt();
		  int k=scan.nextInt();
		  int p,r=0;
	       while(n-->0) {
		     p=scan.nextInt();
		     if(p%k==0) {
		    	 r+=1;
		     }
		     
	}
	       System.out.println(r);

}
}
