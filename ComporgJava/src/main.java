
import java.util.*;

public class main {
	public static void main (String[] args) {
		DataModel d=new DataModel();
		AssignmentModel AM=new AssignmentModel();
		StudentModel SM=new StudentModel();
		Set<Assignment> setOfAllAssignments=new HashSet<>();
		Set<Student> setOfStudents=new HashSet<>();
		GradebookGUI g =new GradebookGUI(d,AM,SM);
		g.setVisible(true);
	}
}
