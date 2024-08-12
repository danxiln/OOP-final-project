
import java.util.*;

public class main {
	public static void main (String[] args) {
		DataModel d=new DataModel();
		AssignmentModel am=new AssignmentModel();
		StudentModel sm=new StudentModel();
		GradebookGUI g =new GradebookGUI(d,am,sm);
		g.setVisible(true);
	}
}
