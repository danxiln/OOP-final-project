import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AssignmentModel {
		private Set<Assignment> setOfAllAssignments;
		
		AssignmentModel(){
			setOfAllAssignments=new HashSet<>();

		}

		public void sortSet(DataModel dm,StudentModel sm) {
			sm.sortSet(dm);
			//sorts assignments
			for(Student currentStudent:sm.getStudentModel()) {
				setOfAllAssignments.addAll(currentStudent.getAllAssignments());
			}
		}

		public String StringOfAllAssignments() {
			// formating to print classrooms in the appropriate format
			String all=String.format("%-8s |%-24s |%-12s| %-8s\n",
			  		 "ID", "Name","Due Date","Grade");
			for (Assignment current : setOfAllAssignments) {
				all += String.format("%-8s |%-24s |%-12s |%-8s\n",
				    current.getID(),
				    current.getName(),
				    current.getdueDate(),
				    current.getGrade());
				}
			return all;
		}
		public Assignment baseAssignment(String id) {
			// formating to print classrooms in the appropriate format
			
			for (Assignment current : setOfAllAssignments) {
				if (current.getID().equals(id)) {
					return current;
				}
				}
			return null;
		}
		public String getAllStudentsByAssignment(String id,StudentModel sm) {
			String all=String.format("%-8s |%-30s| %-8s\n",
	 	    		 "ID", "Name","Grade");
			for (Student s:sm.getStudentModel()) {
				ArrayList<Assignment> current=s.getAllAssignments();
				for(Assignment x:current ) {
					if(x.getID().equals(id)) {
						all += String.format("%-8s |%-30s| %-8s\n",
								s.getstudentID(),
								s.getName(),
								x.getGrade());
					}
				}
			}	
			return all;
		}
		

}
