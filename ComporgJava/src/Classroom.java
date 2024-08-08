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

	public void addStudent(Student student) {
		students.add(student);
		Collections.sort(students);
		Student.incramentStudent();
	}
	public static Classroom searchGradeBookByID(ArrayList<Classroom> gradebook, String ID) {
		for (Classroom c1:gradebook) {
			if(c1.getName().equals(ID)) {
				return c1;
			}
		}
		return null;
	}
	public String StringOfAllStudents() {
		String all="ID: Name: \n";
		for (int i=0;i<students.size();i++) {
			Student current=students.get(i);
			all+=current.getcurrentID()+" "+current.getName()+" "+"\n";
		}
		return all;
	}
	
	
}

