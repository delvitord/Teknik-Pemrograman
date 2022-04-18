package task2;

public class MethodOverloading {
	public static void main (String args []) {
		Overload Obj = new Overload();
		double result;
		Obj.demo(10);				//first constructor
		Obj.demo(10,20);			//second constructor
		result = Obj.demo(5.5);		//third constructor
		System.out.println("O/P: " + result);
	}
}
