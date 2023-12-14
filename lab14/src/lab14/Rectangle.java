package lab14;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public Rectangle() {
		super();
	}
   public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
  public Rectangle(double length, double width,String color,boolean filled) {
	super(color,filled);
	this.length = length;
	this.width = width;
}
 public double getWidth() {
	return width;
}
  public void setWidth(double width) {
	this.width = width;
}
public double getLength() {
	return length;
}
public void setLength(double width) {
	this.length= length;
}
public double getArea() {
	return length * width;
}
public double getPerimeter() {
	return 2*(width + length);
}
public String toString() {
	return "Rectangle[ Length = "+length + " Width= "+width + "]";
}
}
