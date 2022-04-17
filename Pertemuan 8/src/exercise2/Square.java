package exercise2;

public class Square extends Rectangle{
	//contstructors
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	//Getter and Setter
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		
		return "A Square with side " + getSide() + " which is a sublass of " + super.toString();
	}
	
	public double getArea() {
		return getSide()*getSide();
	}
	
	public double getPerimeter() {
		return 4*getSide();
	}
}
