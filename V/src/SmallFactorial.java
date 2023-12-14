import java.util.Scanner;
public class SmallFactorial {
	static int getFactorial(int n) {  
		int i=1,f=1;
		while(i<=n)
        {
            f *= i;
            i++;
        }
       return f; 
  } 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		
		    while(t-->0 ) {
			int n=scan.nextInt();
			
			System.out.println(getFactorial(n));
			  }
	}
}
