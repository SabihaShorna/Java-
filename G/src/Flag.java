import java.util.Scanner;
public class Flag {
	static double pi=Math.PI;
	public static double getAreaOfRed(double L) {
		double r=(double)(0.2)*L;
		return (double) pi *r*r;	
	}
	public static double getAreaOfGreen(double L) {
		double r=(double)(0.2)*L;
		double w=0.6*L;
		return (double)(L*w)-getAreaOfRed(L);
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
while (t-->0) {
	double  L=scan.nextDouble();
	System.out.printf( "%.2f %.2f\n",getAreaOfRed(L),getAreaOfGreen(L));
}
	}

}
