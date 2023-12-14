import java.util.Scanner;
public class Planet {
	
	static int getIt {
	long mod=1000000007;  
		int n;    
		long sum=1,pow=2;  
		int b=n-1;  
		while(b>0)  
		{  
		if(b&1)sum=(sum*pow)%mod;  
		b>>=1;  
		pow=(pow*pow)%mod;  
		}  
		System.out.printf("%lld\n",(n*sum)%mod);  
		}  
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); 
		int kj=1,tt;  
		tt=scan.nextInt();  
		while(tt-->0)  {
			n=scan.nextInt(); 
			System.out.printf("Case #%d: ",kj++);  
		getIt();  
		}  
		}  
	}

