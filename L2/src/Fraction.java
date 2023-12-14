
import java.util.Scanner;
public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		  int  n=scan.nextInt();
		  int a=1,b=1;
		  if(n%2!=0) {
		  int Ab=1,Bb=n-1;
		  int d;	  
		  for(a=1;a<=n/2;a++) {
			  b=n-a;
			  boolean cp=true;
			  for(d=2;d<=a;d++) {
				  if(a%d==0 & b%d==0) {
					  cp=false;
					  if((a/b)>(Ab/Bb)) {
						  Ab=a;
						  Bb=b;
					  }
				  }
			  }
		  }
		  System.out.printf("%d %d",Ab,Bb);
		  }
		  if(n%2==0){
			  if(n%4!=0) {
				  a=(n/2)-1;
				  b=(n/2)+1;
			  }
			  else {
				  a=(n/2)-2;
			  b=(n/2)+2;
				  
			  }  
		  
	       System.out.printf("%d %d",a,b);
		  }
}
}

