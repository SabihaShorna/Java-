import java.util.Scanner;
public class Sets {
		static char ch;
public  static char getRelation(int a,int b) {
	
    if (a>b) {
	ch='>';
    }
	if (a<b) {
		ch= '<';
	}
	if(a==b) {
		ch= '=';
			}
	return ch;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
while(t-->0) {
 int j=scan.nextInt();
int  k=scan.nextInt();
System.out.println(getRelation(j,k));
}
	}

}

