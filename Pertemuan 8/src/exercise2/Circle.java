package exercise2;

public class Circle extends Shape{
	// private instance variable, not accessible from outside this class 
		private double radius; 
		
		// Constructors 
		public Circle() {  
			super();
			radius = 1.0;
		}

		 /** Constructs a Circle instance with the given radius and default color */ 
		public Circle(double radius) {  // 2nd constructor 
			super();
			this.radius = radius; 
		}
		
		public Circle(double radius, String color, boolean filled) {  // 2nd constructor 
			super(color, filled);
			this.radius = radius;
		}
		
		 /** Returns the radius */ 
		public double getRadius() { 
			return radius; 
		}
		
		public void setRadius(double radius) {
			this.radius = radius;
		}

		
		public double getArea() { 
			return radius*radius*Math.PI; 
		}
		
		public double getPerimeter() {
			return 2*Math.PI*radius;
		}
		
		@Override
		public String toString() {
			
			return "A Circle with radius " + radius + " which is a sublass of " + super.toString();
		}
}
