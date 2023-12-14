package lab8;

public class Test {
	public static void main (String[]args){
		Box b1= new Box();
		System.out.println("Printing info of Box b1:");
		System.out.println(b1 +"==> Volume:"+ b1.volume());
		System.out.println();

		Box b2= new Box(5);
		System.out.println("Printing info of Box b2:");
		System.out.println(b2 +"==> Volume:"+ b2.volume());
		System.out.println();

		Box b3= new Box(5,4,3);
		System.out.println("Printing info of Box b2:");
		System.out.println(b3 +"==> Volume:"+ b3.volume());
		System.out.println();

		Box b4= new Box(4,2,3);
		System.out.println("Printing info of Box b4:");
		System.out.println(b4 +"==> Volume:"+ b4.volume());
		System.out.println();

		Box b5= new Box(b4);
		System.out.println("Printing info of Box b5:");
		System.out.println(b5 +"==> Volume:"+ b5.volume());
		System.out.println();

		System.out.println("Are Box b3 and b4 equal?:" + b3.equalTo(b4));
		System.out.println("Are Box b4 and b5 equal?:" + b4.equalTo(b5));
	}
}
		
	


