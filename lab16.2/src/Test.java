import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int sum=0;
		for(int i=0;i<10;i++) {
			System.out.println("Enter a number:");
			num=scan.nextInt();
			try {
				if (num<0) {
					throw new ArithmeticException();
				}
				sum=sum+num;
			}
			catch (ArithmeticException e) {
				i=i-1;
				System.out.println("Negative number is not allowed: "+e);
				
			}
		}
		System.out.println("Sum is "+sum);
	}

}
