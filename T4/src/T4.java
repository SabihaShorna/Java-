import java.util.Scanner; 
 class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double R1,R2;
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the coefficients:\n"+"a:\n");
      a= scan.nextInt();
      System.out.print("b:\n");
      b=scan.nextInt();
      System.out.print("c:\n");
      c=scan.nextInt();
      int k=(b*b)-4*a*c;
		if(k<0){
			System.out.println("No real roots");
		}
		else
		{	double l=Math.sqrt(k);
			R1=(-b-l)/2*a;
			R2=(-b+l)/2*a;
			System.out.printf("Root 1:"+R1);
			System.out.printf("Root 2:"+R2);
		}
	}

}
