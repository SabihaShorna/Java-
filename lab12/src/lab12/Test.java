package lab12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
				
				Shape s = new Shape(1, 2);
				System.out.println(s.getName()+",Area:"+s.getArea());
				
				Circle c1 = new Circle(5);
				System.out.println("Circle ID:"+c1.getcircleId()+"Radiious:"+c1.getRadious()+"Area:"+c1.getArea());
				
				Circle c2 = new Circle(7);
				System.out.println("Circle ID:"+c2.getcircleId()+"Radiious:"+c2.getRadious()+"Area:"+c2.getArea());
				
				System.out.println("Total Circle Objects created:"+Circle.getcircleCounter());
				
				Rectangular r1 = new Rectangular(5,6);
				System.out.println("Rectangular ID:"+r1.getRectangleId()+"S1:"+r1.getSide1()+"S2:"+r1.getSide2()+"Area:"+r1.getArea());
				
				Rectangular r2 = new Rectangular(7,2);
				System.out.println("Rectangular ID:"+r2.getRectangleId()+"S1:"+r2.getSide1()+"S2:"+r2.getSide2()+"Area:"+r2.getArea());
				
				System.out.println("Total rectangular Objects created:"+Rectangular.getrectangleCounter());

				
			}

	}


