package b;
import java.util.Scanner;
public class Hajj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String line;
		int k = 1;
		while (!(line = scan.nextLine()).equals("*")) {
			switch(line) {
			case "Hajj":
			case "hajj":
				System.out.println(String.format("Case %d: Hajj-e-Akbar",k));
				k++;
		        break;
			case "Umrah":
			case "umrah":
			    System.out.println(String.format("Case %d: Hajj-e-Asghar",k));
			    k++;
			    break;
		        }
	        }
	  }
}
