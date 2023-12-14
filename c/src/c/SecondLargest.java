package c;
import java.util.Scanner;
public class SecondLargest {
public static int i,t,a = 0,b = 0,c = 0,m=0,l=0;
public static int getSecondLargest(int i,int j,int k) {
		i=a;
		j=b;
		k=c;
		if(a>b)
		{

				if(a>c)

				l=a;

				else

				l=c;

				}

				else

				{

				if(b>c)

				l=b;

				else

				l=c;

				}

				if(a==l)

				{

				if(b>c)

				m=b;

				else

				m=c;

				}

				if(b==l)

				{

				if(a>c)

				m=a;

				else

				m=c;

				}

				if(c==l)

				{

				if(b>a)

				m=b;

				else

				m=a;

				}

			return m;
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	t=scan.nextInt();
	while(t-->0) {
		 a=scan.nextInt();
	     b=scan.nextInt();
		 c=scan.nextInt();
	System.out.println(getSecondLargest(a,b,c));
}
}
}

