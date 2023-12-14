
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizableCircle rc = new ResizableCircle(9);
		System.out.println("Radius: " + rc.radius);
		System.out.println("Area: " + rc.getArea());
		System.out.println("perimeter: " + rc.getPerimeter());
		System.out.println();
		
		
		rc.resize(90);
		System.out.println("Radius: " + rc.radius);
		System.out.println("Area: " + rc.getArea());
		System.out.println("perimeter: " + rc.getPerimeter());
		System.out.println();
		
	}

}
