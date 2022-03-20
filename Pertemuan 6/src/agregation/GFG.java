package agregation;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Delvito", 211524039, 234, "Jl. Sukasari IV", 40345, "Cimahi");
		Lecturer lecturer = new Lecturer("Fulan", 197002282, 4, "Jl. Sukajadi", 14045, "Bandung");
		
		student.printStudent();
		lecturer.printLecturer();
	}

}
