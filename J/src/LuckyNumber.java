import java.util.Scanner;
public class LuckyNumber {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
long n=scan.nextLong();
long d;
int j=0;
while(n!=0) {
 d=n % 10; 
 n= n/10; 
 if(d==4 || d==7) {
	j++; 
 }
}
 if (j==4 || j==7) {
	 System.out.println("YES");
 }
 else
	 System.out.println("NO") ;
	}

}
