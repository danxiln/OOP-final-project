import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StudentModel {
	private Set<Student> setOfAllStudents;

	StudentModel() {
		setOfAllStudents = new HashSet<>();
	}

	public void sortSet(DataModel dm) {
		// sorts students
		System.out.println("x");
		for (Classroom currentClass : dm.getGradebook()) {
			setOfAllStudents.addAll(currentClass.getAllStudents());
		}
	}

	public String StringOfAllStudents() {
		// formating to print classrooms in the appropriate format
		String all = String.format("%-8s | %-30s\n",
				"ID", "Name");

		for (Student s : setOfAllStudents) {
			all += String.format("%-8s | %-30s\n",
					s.getstudentID(),
					s.getName());
		}
		return all;
	}

	public String StringOfAllStudentsByName(String name) {
		String all = String.format("%-8s | %-30s\n",
				"ID", "Name");
		for (Student s : setOfAllStudents) {
			if ((s.getName().contains(name))) {
				all += String.format("%-8s | %-30s\n",
						s.getstudentID(),
						s.getName());
			}
		}
		return all;

	}

	public Student baseStudent(String id) {
		for (Student current : setOfAllStudents) {
			if (current.getstudentID().equals(id)) {
				return current;
			}
		}
		return null;
	}

	public double getStudentGPA(String id, DataModel dm) {
		double totalGPA = 0;
		int classes = 0;
		for (Classroom c : dm.getGradebook()) {
			for (Student s : c.getAllStudents()) {
				if (s.getstudentID().equals(id)) {
					totalGPA += s.calcGrade();
					classes++;
				}
			}
		}
		return totalGPA / classes;

	}

	public double getStudentGPAByType(String id, String type, DataModel dm) {
		double totalGPA = 0;
		int classes = 0;
		for (Classroom c : dm.getGradebook()) {
			for (Student s : c.getAllStudents()) {
				if (s.getstudentID().equals(id)) {
					totalGPA += s.calcGradeByType(type);
					classes++;
				}
			}
		}
		return totalGPA / classes;

	}

	public Set<Student> getStudentModel() {
		return setOfAllStudents;
	}

}
