package shork;
import java.util.Scanner;
public class shorki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char op;
     int a,b;
     Scanner scan=new Scanner(System.in);
     System.out.print("Enter operator ( +, -, * or /): ");
 	 op = scan.next().charAt(0);
 	 System.out.print("Enter 1st Operand: ");
 	 a = scan.nextInt();
 	 System.out.print("Enter 2nd Operand: ");
 	 b = scan.nextInt();
     		switch(op){
     			case '+':
     				System.out.println("Result is:"+(a+b));
     				break;
     				
     			case '-':
     				System.out.println("Result is:"+(a-b));
     				break;
     			case '*':
     				System.out.println("Result is:"+(a*b));
     				break;
     			case '/':
     				System.out.println("Result is:"+(a/b));
     				break;
     			default:
     				 System.out.println("invalid");
     			
     			
     		}
	}

}
