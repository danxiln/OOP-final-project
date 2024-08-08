import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Classroom {
	static int classrooms = 0,
		   id_format = 0,
		   name_format = 0,
		   year_format = 0,
		   current_class;

	String classID, className, classNotes;
	int classYear;
	ArrayList<Student> students;

	Classroom(String id, String name, int year, String notes) {
		current_class = classrooms;
		classID = id;
		className = name;
		classYear = year;
		classNotes = notes;
		students = new ArrayList<>();
	}

	//method to count classrooms
	static int countClassrooms() {
		return classrooms;
	}

	int getCurrentClass() {
		return current_class;
	}
	
	static void incramentClassroom() {
		classrooms++;
	}

	// methods to retrieve requested information
	String getClassID() {
		return classID;
	}

	String getName() {
		return className;
	}

	int getYear() {
		return classYear;
	}

	String getNotes() {
		return classNotes;
	}

	// student methods
	public void addStudent(Student student) {
		students.add(student);
		Collections.sort(students);
		Student.incramentStudent();
	}

	// method to compare current classroom's id to that of another
	public int compareTo(Classroom classroom) {
		return className.compareTo(classroom.classID);
	}

	// organize classroom information to be listed for display
	public String translateString() {
		String id_string = String.format("%1$-"+(id_format + 5) + "s", getClassID());
		String name_string = String.format("%1$-"+(name_format + 5) + "s", getName());
		String year_string = String.format("%1$-"+(year_format + 5) + "s", getYear());
		String classroomLine = (getCurrentClass() + " |" + 
					id_string + "|" +
					name_string + "|" + 
					year_string + "|" +
					getNotes());
		return classroomLine;
	}
}


