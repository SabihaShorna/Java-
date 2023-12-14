package clw3;
import java.util.Scanner;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int min = 5, max = 20, N;
		System.out.print("How many random numbers:");
		N = scan.nextInt();
		for (int i = 0; i <= N; i++) {
		int n = (int)(min + (Math.random() * (max - min +1)));
		System.out.print(n + " ");
		}
		}
		

	}

