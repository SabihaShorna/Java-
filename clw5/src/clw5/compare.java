package clw5;
import java.util.Scanner;
public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String city1;
		String city2;
		System.out.print("Enter first city:");
		city1 = scan.nextLine();
		System.out.print("Enter second city:");
		city2 = scan.nextLine();
		if(city1.compareTo(city2) < 0) {
		System.out.println("The cities in alphabetical orders are " + city1 + " and " +
		city2);
		}
		else if(city1.compareTo(city2) > 0) {
		System.out.println("The cities in alphabetical orders are " + city2 + " and " +
		city1);
		}
		else {
		System.out.println("The cities in alphabetical orders are " + city1 + " and " +
		city2);
		}
		}
		

	}


