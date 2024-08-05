public class Student implements Comparable<Student> {
	static int students = 0;
	static int name_format = 0;
	static int studentid_format = 0;
	static int grade_format = 0;
	static int currentid;

	Contact(String student_name, String studentid, String student_grade, String student_note) {
		currentid = students;
		name = student_name;
		idNumber = studentid;
		grade = student_grade;
		notes = student_note;
	}

	// Methods to return attributes of Student variable
	static int getStudents() {
		return students;
	}

	int getcurrentID() {
		return currentid;
	}

	String getName() {
		return name;
	}

	String getstudentID() {
		return idNumber;
	}

	String getGrade() {
		return grade
	}

	String getNotes() {
		return notes;
	}
	
	// method to reset the number of studnets to 0 or to add a static student
	void reset(){
		students = 0;
	}

	static void incramentStudent() {
		students++;
	}

	// compare current student's name to that of another, used for sorting contacts by name in main
	public int compareTo(Student student) {
		return name.compareTo(student.name);
	}
}
		



