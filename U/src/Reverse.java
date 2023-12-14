import java.util.Scanner;
public class Reverse {
	static int getReverse(int n) {     
        int r = 0; 
        for(;n != 0; n /= 10) {
            int digit = n % 10;
            r = r * 10 + digit;
        }
       return r; 
  } 
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int t=scan.nextInt();
		while(t-->0) {
		int  n=scan.nextInt();
			
         System.out.println(getReverse(n));
		}
	   }
	}
	


