import java.util.Scanner;

public class Slogan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		String  []arr=new String[n];
		 for(int i=0; i<=n; i++ ) {
	         arr[i] = scan.nextLine();
		 }
		 System.out.println(arr);
	}
}
