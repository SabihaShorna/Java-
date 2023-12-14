package lab71;

public class Circle {
	public double radius;
	public String color;
	
	//No-Arg Constructor
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	

	public String toString() {
		return "Circle[Radius: " + radius + ", color: " + color + "]";
	}
	
}
