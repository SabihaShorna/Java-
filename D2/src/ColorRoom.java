import java.util.Scanner;
public class ColorRoom{
	public static int colorNumber(String s){
		int r=0,g=0,b=0;
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='R'){
		r++;
		}
		else if(s.charAt(i)=='G'){
		g++;
		}
		else if(s.charAt(i)=='B'){
		b++;
		}
		}
		int m=Math.max(g, b);
		int clr=Math.max(m, r);
		return s.length()-clr;
		}
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		int n=scan.nextInt();
		scan.nextLine();
		String s=scan.nextLine();
		System.out.println(colorNumber(s));
		}
		}
	}

	