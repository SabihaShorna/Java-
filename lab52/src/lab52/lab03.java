package lab52;
import java.util.Scanner;
public class lab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner scan=new Scanner(System.in);
		int i,j,m,n;
		System.out.print("Enter row & column:");
		m=scan.nextInt();
		n=scan.nextInt();
		System.out.print("Enter Matrix1:\n");
		int M1[][]=new int [m][n];
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				M1[i][j]=scan.nextInt();
			}
		}
		System.out.print("Enter Matrix2:\n");
		int M2[][]=new int [m][n];
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				M2[i][j]=scan.nextInt();
			}
		}	
		System.out.print("Matrix1:\n");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print( M1[i][j]+" ");
			}
			System.out.println();
		}
		

		System.out.print("Matrix2:\n");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print( M2[i][j]+" ");
			}
			System.out.println();
		}
		int sum[][]=new int[m][n];
		System.out.println("Sum:");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
			sum[i][j]=M1[i][j]+M2[i][j];
		
			System.out.print( sum[i][j]+"  ");
			}
			System.out.println();
		

	}

}
}
