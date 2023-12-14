import java.util.Arrays;
import java.util.Scanner;
public class Drinks {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
int l=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int p=scan.nextInt();
int nl=scan.nextInt();
int np=scan.nextInt();
int q=(k*l)/nl;
int r=c*d/1;
int s=p/np;
int []arr= {s,r,q};
Arrays.sort(arr);
int min=arr[0];
int t=min/n;
System.out.println(t);
	}

}
