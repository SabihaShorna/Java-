package lab14;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape s1 = new Circle(6,"Red",true);
		System.out.println("Color = "+s1.getColor());
		System.out.println("Filled =  "+s1.isFilled());
		System.out.println("Area =  "+s1.getArea());
		System.out.println("Perimeter = "+s1.getPerimeter());
		   if(s1 instanceof Circle) {
			Circle c1 = (Circle)s1;
			System.out.println("Color = "+c1.getColor());
			System.out.println("Filled =  "+c1.isFilled());
			System.out.println("Radius = "+c1.getRadius());
			System.out.println("Area =  "+c1.getArea());
			System.out.println("Perimeter = "+c1.getPerimeter());
		    }
		System.out.println();
		System.out.println("Recntagle class ");
		System.out.println();
		Shape s2 = new Rectangle(6,6,"Red",true);
	    System.out.println("Color = "+s2.getColor());
		System.out.println("Filled =  "+s2.isFilled());
		System.out.println("Area =  "+s2.getArea());
		System.out.println("Perimeter = "+s2.getPerimeter());
	        if(s2 instanceof Rectangle) {
			Rectangle r1 = (Rectangle)s2;
			System.out.println("Color = "+r1.getColor());
			System.out.println("Filled =  "+r1.isFilled());
			System.out.println("Length = "+r1.getLength());
			System.out.println("Width = "+r1.getWidth());
			System.out.println("Area =  "+r1.getArea());
			System.out.println("Perimeter = "+r1.getPerimeter());
		    }
		System.out.println("Square class ");
		System.out.println();
		Shape s3 = new Square(6,"Red",true);
        System.out.println("Color = "+s3.getColor());
		System.out.println("Filled =  "+s3.isFilled());
		System.out.println("Area =  "+s3.getArea());
		System.out.println("Perimeter = "+s3.getPerimeter());
		    if(s3 instanceof Square) {
			Square sq1 = (Square)s3;
			System.out.println("Color = "+sq1.getColor());
			System.out.println("Filled =  "+sq1.isFilled());
			System.out.println("Side = "+sq1.getLength());
			System.out.println("Area =  "+sq1.getArea());
			System.out.println("Perimeter = "+sq1.getPerimeter());
		    }
	}
	}


