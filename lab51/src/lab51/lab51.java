package lab51;
import java.util.Scanner;
public class lab51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number of elements:");

        int n=scan.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=scan.nextInt();

        }
System.out.print("integer:");
int key=scan.nextInt();
for (int element : arr) {
    if (element == key)  {
    	System.out.print("found");
    }
    else
    		System.out.print(" not found");
       
  
}
   

	}
}


