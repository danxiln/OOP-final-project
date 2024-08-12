import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AssignmentModel {
		private Set<Assignment> setOfAllAssignments;
		
		AssignmentModel(){
			setOfAllAssignments=new HashSet<>();

		}

		public void sortSet(DataModel dm) {
			 ArrayList<Classroom> Gradebook=dm.getGradebook();
			for(Classroom currentClass:Gradebook) {
				setOfStudents.addAll(currentClass.getAllStudents());
			}
			//sorts assignments
			for(Student currentStudent:setOfStudents) {
				setOfAllAssignments.addAll(currentStudent.getAllAssignments());
			}
		}

		public String StringOfAllAssignments() {
			sortSet();
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
			sortSet();
			// formating to print classrooms in the appropriate format
			
			for (Assignment current : setOfAllAssignments) {
				if (current.getID().equals(id)) {
					return current;
				}
				}
			return null;
		}
		public String getAllStudentsByAssignment(String id) {
			sortSet();
			String all=String.format("%-8s |%-30s| %-8s\n",
	 	    		 "ID", "Name","Grade");
			for (Student s:setOfStudents) {
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
		public double getStudentGPA(String id) {
			double totalGPA=0;
			int classes=0;
			for(Classroom c:Gradebook) {
				for(Student s:c.getAllStudents()) {
					if(s.getstudentID().equals(id)) {
						totalGPA+=s.calcGrade();
						classes++;
					}
				}
			}
			return totalGPA/classes;
			
		}
		
		public double getStudentGPAByType(String id,String type) {
			double totalGPA=0;
			int classes=0;
			for(Classroom c:Gradebook) {
				for(Student s:c.getAllStudents()) {
					if(s.getstudentID().equals(id)) {
						totalGPA+=s.calcGradeByType(type);
						classes++;
					}
				}
			}
			return totalGPA/classes;
			
		}

}
