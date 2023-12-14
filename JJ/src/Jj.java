import java.util.Scanner;
public class Jj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int c=0;
		int a=scan.nextInt();
		int b=scan.nextInt();
		int x=scan.nextInt();
		for(int i=a ;i<=b;i++) {
			if(i%x==0) {
				c++;
			}
		}
		if(c==0) {
			System.out.printf("There are no integer between %d and %d, inclusive,that is divisible by %x ", a,b,x);
		}
		if(c>0) {
			System.out.println(c);
		System.out.printf("There are %d integers between %d and %d,inclusive.that are divisible by %x :" ,c,a,b,x);
		}
		for(int i=a ;i<=b;i++) {
			
				if(i%x==0) {
				
		System.out.printf("%d,",i);
				}
		}

}
}
