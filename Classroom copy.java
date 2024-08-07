import java.util.*;

public class Classroom {
	private String classID;
	private String className;
	private int classYear;
	private ArrayList<Student> students;
	private String classNotes;
	
	public Classroom(String id, String name, int year, String notes) {
		classID=id;
		className=name;
		classYear=year;
		classNotes=notes;
		students =new ArrayList<Student>();
		
	}

	public String getClassID() {
		return classID;
	}

	public String getName() {
		return className;
	}

	public int getYear() {
		return classYear;
	}

	public String getNotes() {
		return classNotes;
	}

	public void addStudent(Student student) {
		students.add(student);
		Collections.sort(students);
		Student.incramentStudent();
	}
}
