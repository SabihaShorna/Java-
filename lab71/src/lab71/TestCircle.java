package lab71;
	public class TestCircle {

		public static void main(String[] args) {
			
			Circle c1 = new Circle();
			System.out.println("Radius of Circle c1: " + c1.radius);
			System.out.println("Color of Circle c1: " + c1.color);
			System.out.printf("Area of Circle c1: %.2f\n", c1.getArea());
			System.out.println(c1.toString());
			System.out.println();
			
			Circle c2 = new Circle(2.0);
			System.out.println("Radius of Circle c2: " + c2.radius);
			System.out.println("Color of Circle c2: " + c2.color);
			System.out.printf("Area of Circle c2: %.2f\n", c2.getArea());
			System.out.println(c2.toString());
			System.out.println();
			
			Circle c3 = new Circle(5.0, "blue");
			System.out.println("Radius of Circle c3: " + c3.radius);
			System.out.println("Color of Circle c3: " + c3.color);
			System.out.printf("Area of Circle c3: %.2f\n", c3.getArea());
			System.out.println(c3);
			System.out.println();
			
		}

	}


