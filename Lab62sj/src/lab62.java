import java.util.Scanner;
public class lab62 {


		// TODO Auto-generated method stub
		public static int[][] getArray() {
			Scanner scan = new Scanner(System.in);
			int row,col;
			
			System.out.print("Enter rows:");
			row = scan.nextInt();
			System.out.print("Enter cols:");
			col = scan.nextInt();
			
			int[][] ara = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print("ara[" + i + "][" + j + "]=");
					ara[i][j] = scan.nextInt();
				}
			}
			return ara;
		}
		
		public static int getSum(int[][] m) {
			int sum = 0;
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					sum = sum + m[i][j];
				}
			}
			return sum;
		}
		
		public static void main(String[] args) {
			int[][] A = getArray();
			int sum = getSum(A);
			System.out.println("Sum: " + sum);
		}

	


	}


