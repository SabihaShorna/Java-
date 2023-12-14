package task1;

public class Rectangle extends Shape {
	public double  width;
	public double  length;

public Rectangle() {
	super();
}
public Rectangle (double width,double length,String color,boolean filled) {
	this.width=width;
	this.length=length;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width=width;
}
public void setLength(double length) {
	this.length=length;
}
public double getArea() {
	return width*length;
}
public double getPerimeter() {
	return 2*(width*length);
}
public String toString() {
return "Rectangle[width="+",length="+length+",getColor()="+ getColor() +",isFilled()="	+isFilled()+"]";
}
}