import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int t=scan.nextInt();
		while(t-->0) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			if(a+b+c==180) {
			System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
}
	}
}
