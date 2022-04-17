package exercise2;

public class Shape {
	private String color;
	private boolean filled;
	
	//Constructors
	public Shape() {
		color = "red";
		filled = true;
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	//Setter & Getter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		String filledStr;
		if(!filled) {
			filledStr = "not Filled";
		} else {
			filledStr = "filled";
		}
		
		return "A Shape with color of " + color + " and " + filledStr;
	}
	
	
}
