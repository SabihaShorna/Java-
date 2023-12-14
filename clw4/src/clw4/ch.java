package clw4;
import java.util.Scanner;
public class ch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch;
		System.out.print("Enter a character:");
		ch = scan.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') && (ch >= 'A' && ch <= 'Z')) {
		System.out.println("It is a letter");
		}
		else if ((ch >= '0' && ch <= '9')) {
		System.out.println("It is a digit");
		}
		else {
		System.out.println("It is a symbol");
		}
		}
		

	}


