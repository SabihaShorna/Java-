import java.util.Scanner;
public class Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int x=0,y=0,n=0;
int x1=scan.nextInt();
int y1=scan.nextInt();
int x2=scan.nextInt();
int y2=scan.nextInt();
if(x1>x2) {
x=x1-x2;
}
if(x2>x1) {
	x=x2-x1;
}
if(y1>y2) {
y=y1-y2;
}
if(y2>y1) {
	y=y2-y1;
}
	if(x==y) {
		n=x;
	}
	if(x<y) {
		n=x+(y-x);
	}
	if(y<x) {
		n=y+(x-y);
	}
	if(x==y) {
		n=x;
	}
System.out.println(n);
}
}