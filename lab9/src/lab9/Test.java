package lab9;

public class Test {
		public static void main(String[] args) {
		Point p=new Point (1,2);
		Point q=new Point (3,4);
		Line line=new Line (p,q);
		Line line2=new Line(1,2,7,8);
		System.out.println("length="+line.getLength());
		System.out.println("length="+line.toString());
		System.out.println("length="+line2.getLength());
		System.out.println("length="+line2.toString());
		}

}
