import java.util.Scanner;
public class OPeration {
	static int t=0,tr=0,fi=0,k;
	static long n;
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
        int  q=scan.nextInt();
       while(q-->0) {
	     n=scan.nextLong();
	 while(n!=1) {
			if(n%2==0) {
				t+=1;
				n=n/2;
			}
			if(n%3==0) {
			 tr = 1;
			 n = (2*n)/3;
			}
			if(n%5==0) {
				fi+=1;
				n=(4*n)/5;
			} 
	 }
       if(n!=1){
    	   k=-1;
       }
       if(n==1)  {
     k=t+tr+fi;
       }
   System.out.println(k);
	     }
}
}
