package clwork;
import javax.swing.JOptionPane;

public class classwrk {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog(null,"Enter n","Input dialog box",JOptionPane.QUESTION_MESSAGE);
		int n = Integer.parseInt(str);
		
		int fact = 1;
		for(int i = 1;i<=n;i++)
		{
			fact = fact * i;
		}
		JOptionPane.showMessageDialog(null, "Factorial of"+n+ " is "+fact,"Message Dialog box",JOptionPane.INFORMATION_MESSAGE);
		
		int option = JOptionPane.showConfirmDialog(null, "Do you want to quit?","Confirmation Box",JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(option == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
		System.out.println("Take a nap man");

	}

}
