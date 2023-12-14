package lab10;
import java.util.Scanner;
public class TestDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String expr;
		boolean result;
		
		DelimiterMatching dMatching = new DelimiterMatching();
		
		System.out.println("Enter a string:");
		expr = scan.nextLine();
		
		result = dMatching.isDelimiterMatching(expr);
		
		System.out.println(expr + "==>" + result);
	}

}
