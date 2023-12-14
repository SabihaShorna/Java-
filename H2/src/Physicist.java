import java.util.Scanner;
public class Physicist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n,p,q,r,sump=0,sumq=0,sumr=0;
n=scan.nextInt();
while(n-->0){
	p=scan.nextInt();
	q=scan.nextInt();
	r=scan.nextInt();
  sump+=p;
sumq+=q;
sumr+=r;
}
if(sump==0&&sumq==0&&sumr==0)
System.out.println("YES\n");
else 
System.out.println("NO\n");

}
	}

