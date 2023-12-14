package lab16;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] ara=new int[100];
		int index,result;
		for (int i=0;i<ara.length;i++) {
			int a=(int)(Math.random()*100);
			ara[i]=a;
		}
		System.out.println("Enter an index:");
		index=scan.nextInt();
		try {
			System.out.println("The value in index"+index +"is "+ ara[index]);
			result=ara[index]/0;
			System.out.println("Result:"+result);
		}
		catch (ArithmeticException e){
			System.out.println("Cannot devide by zero:"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out Of Array Size:"+e);
		}
		System.out.println("Program Ends");
	}

}
