package lab53;

public class lab53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] A= {{5,2,1},{0,3,7},{6,8,4}};
		int j,sum=0;
		for (int i=0;i<A.length;i++) {
			sum=sum+A[i][i];
		}
		System.out.println("sum:"+ sum);
		}

}
