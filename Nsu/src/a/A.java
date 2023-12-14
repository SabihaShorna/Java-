package a;
import java.util.Scanner;
public class A {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int x=0,y=0;
int i,n,t1=0,t2=0,t=0;
n=scan.nextInt();
int [] arr = new int[n];
for( i=0;i<n;i++) {
arr[i]=scan.nextInt();
	}
for ( i=0; i< n; i++)
{
	if (arr[i] % 2 == 0)
	{
		  x++;
		  if (x==1)
		  {
		  	t1 = i+1;
		  }
		}
	else
	{
		y++;
		if (y == 1)
		{
			t2= i+1;
		}		
	}
if (t1>t2) {
	t=t1;
}
else {
	t=t2;
}
}
System.out.println(t);
}
	}


	
	








