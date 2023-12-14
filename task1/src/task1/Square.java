package task1;
public class Square extends Rectangle{
	private double side;
	public Square() {
		super();
	}
	public Square(double side) {
		super();
		this.side = side;
	}
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double length) {
		this.side = side;
	}
	@Override
	public double getArea() {
		return side*side;
	}
	@Override
	public double getPerimeter() {
		return 4*side;
	}
	@Override
	public String toString() {
		return "Circle [Side=" +side+ ",color=" +getColor+ "filled=" +isFilled+ "]";
	}
}



