package task2;

public class Overload {
	void demo (int a) {						//first constructor
		System.out.println("a: " + a);
	}

	void demo (int a, int b) {				//second constructor
		System.out.println("a and b: " + a + "," + b);
	}
	
	double demo (double a) {				//third constructor
		System.out.println("double a: " + a);
		return a*a;
	}
}
