
import java.util.Scanner;
public class Probability {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		  int  t=scan.nextInt();
		  int a,b,i,p=0,q;
	       while(t-->0) {
		     a=scan.nextInt();
		     b=scan.nextInt();
		    for(i=a;i<=b;i++) {
		    	if(i%10==0) {
		    		p+=1;
		    		}
		    } 
	         if(p>0) {
	    	  q=(b-a)+1;
	       System.out.printf("%d/%d\n",p,q);
	        }
           if (p==0) {
			 System.out.printf("0\n");
			  }
	       }
}
}
