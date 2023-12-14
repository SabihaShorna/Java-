package lab14;

public class Square extends Rectangle {
	public Square() {
		super();
	}
public Square(double side) {
		super(side,side);
	}
 public Square(double side,String color,boolean filled) {
	super(side,side,color,filled);
}
public double getSide() {
	return getWidth();
}
public  void setSide(double side) {
	setLength(side);
	setWidth(side);
}
  public double getArea() {
	return getLength()* getWidth();
}
public double getPerimeter() {
	return 4*getWidth();
}
public   String toString() {
	return "Square[side = "+getLength() + ", Color = "+getColor() + ", Filled = "+isFilled() +"]";

}
}
