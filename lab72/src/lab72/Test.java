package lab72;


	public class Test {

		public static void main(String[] args) {
			
			Account a1 = new Account(141);
			a1.credit(50);
			System.out.println(a1);
			System.out.println();
			
			Account a2 = new Account(152, 100);
			a2.debit(30);
			System.out.println(a2);
			System.out.println();
			
			a2.setAccountNumber(112);
			System.out.println(a2);
			System.out.println();
			
			System.out.println("Balance of a2: " + a2.getBalance());
		}

	}


