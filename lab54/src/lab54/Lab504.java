package lab54;
import java.util.Scanner;
public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int i,j;
		System.out.print("row:");
		int r=scan.nextInt();
		System.out.print("column:");
		int c=scan.nextInt();
		int matr[][]=new int [r][c];
		System.out.println("Enter elements:");
		for( i=0;i<r;i++) {
			for( j=0;j<c;j++){
				matr[i][j]=scan.nextInt();
			}
		}
	    System.out.print("Matrix :\n");
	    for(i=0;i<r;i++){  
		    for(j=0;j<c;j++){  
		          System.out.print(matr[i][j]+" ");  
		    }  
		          System.out.println();
	    }  
		    System.out.println("Transpose :"); 
		 for(i= 0;i<r;i++){  
	          for(j= 0;j<c;j++){  
	                System.out.print(matr[j][i]+" ");  
	          }  
	            System.out.println();
	     }  
    }
}
