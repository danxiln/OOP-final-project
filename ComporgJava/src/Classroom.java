import java.util.*;

public class Classroom {
	private static int classAmount=0;
	private String classID;
	private String className;
	private String classYear;
	private ArrayList<Student> students;
	private String classNotes;
	
	public Classroom(String id, String name, String year, String notes) {
		classID=id;
		className=name;
		classYear=year;
		classNotes=notes;
		students =new ArrayList<Student>();
		classAmount+=1;
	}
	static public int getClassAmount() {
		return classAmount;
	}

	public String getClassID() {
		return classID;
	}

	public String getName() {
		return className;
	}

	public String getYear() {
		return classYear;
	}

	public String getNotes() {
		return classNotes;
	}
	public void setClassID(String id) {
		classID=id;
	}
	public void setClassName(String name) {
		className=name;
	}
	public void setClassYear(String year) {
		classYear=year;
	}
	public void setClassNotes(String notes) {
		classNotes=notes;
	}

	public void addStudent(Student student) {
		students.add(student);
		Collections.sort(students);
		Student.incramentStudent();
	}
	public Student selectStudent(String studentID) {
		for (Student s : students) {
			if (s.getstudentID().equals(studentID)) {
				return s;
			}
		}
		
		// return null if not possible
		return null;
	}
	public int getClassSize() {
		return students.size();
	}
	
	public String StringOfAllStudents() {
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s | %s\n",
		       	    		 "ID", "Name");
		for (Student current : students) {
			all += String.format("%-8s | %s\n",
					     current.getstudentID(),
					     current.getName());
		}
		return all;
	}
	public void deleteStudent(Student s) {
		students.remove(s);
	}
	
	
}

