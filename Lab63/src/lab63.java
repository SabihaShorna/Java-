import java.util.Scanner;

public class lab63 {
		public static String userInfo(String name, String email, String address) {
			
			String thanksMsg = "Hello, " + name + ".Thanks for running the code.\n"
					+ "Your information given below:\n";
			
			String userInformation = "Name: " + name
					+ "\nEmail: " + email + "\nAddress: " + address;
			
			return thanksMsg.concat(userInformation);
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String name; 
			String email; 
			String address;

			System.out.print("Enter Name:");
			name = scan.nextLine();
			System.out.print("Enter Email:");
			email = scan.nextLine();
			System.out.print("Enter Address:");
			address = scan.nextLine();
			
			System.out.println(userInfo(name, email, address));
		}


	}


