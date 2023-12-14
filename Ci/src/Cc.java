import java.util.Scanner;
public class Cc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		int Nc2=fact(N)/(fact(2)*fact(N-2));
        int Mc2=fact(M)/(fact(2)*fact(M-2));
int w=Nc2 + Mc2 ;
System.out.println(w);
	}
public static int fact(int n) {
int i,f=1;
    for(i=1;i<=n;i++)
    {
        f=f*i;
    } 
    return f;
}  
}