import java.util.*;
import java.util.ArrayList;

public class DataModel {
	private ArrayList<Classroom> Gradebook;
	private Set<Student> setOfStudents;
	private Set<Assignment> setOfAllAssignments;
	DataModel(){
		Gradebook= new ArrayList<Classroom>();
		setOfStudents = new HashSet<>();
		setOfAllAssignments=new HashSet<>();

	}
	
	// function to add a classroom
	public void addClass(Classroom nclass) {
		Gradebook.add(nclass);
		sortSet();
	}
	public int getSize() {
		return Gradebook.size();
	}


	// function to select a classroom by classID
	public Classroom selectClass(String classID) {
		for (Classroom classroom : Gradebook) {
			if (classroom.getClassID().equals(classID)) {
				return classroom;
			}
		}
		
		// return null if not possible
		return null;
	}

	public String StringOfAllClasses() {
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s | %-30s | %s\n",
		       	    		 "ID", "Name", "Year");
		for (Classroom current : Gradebook) {
			all += String.format("%-8s | %-30s | %s\n",
					     current.getClassID(),
					     current.getName(),
					     current.getYear());
		}
		return all;
	}
	public void delete(Classroom g) {
		Gradebook.remove(g);
		sortSet();
	}
	public void sortSet() {
		//sorts students
		
		for(Classroom currentClass:Gradebook) {
			setOfStudents.addAll(currentClass.getAllStudents());
		}
		//sorts assignments
		for(Student currentStudent:setOfStudents) {
			setOfAllAssignments.addAll(currentStudent.getAllAssignments());
		}
	}

	public String StringOfAllStudents() {
		sortSet();
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s | %s\n",
			       	    		 "ID", "Name");
		
		for (Student s:setOfStudents) {
			all += String.format("%-8s | %s\n",
				     s.getstudentID(),
				     s.getName());
		}
		return all;
	}
	public String StringOfAllStudentsByName(String name) {
		sortSet();
		String all=String.format("%-8s | %s\n",
 	    		 "ID", "Name");
		for (Student s:setOfStudents) {
			if(s.getName()==name) {
				all += String.format("%-8s | %s\n",
					     s.getstudentID(),
					     s.getName());
			}
		}	
		return all;
		
	}
	public String StringOfAllAssignments() {
		sortSet();
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s |%-8s |%12s| %8s\n",
		  		 "ID", "Name","Due Date","Grade");
		for (Assignment current : setOfAllAssignments) {
			all += String.format("%-8s |%-8s |%12s |%8s\n",
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
			if (current.getID()==id) {
				return current;
			}
			}
		return null;
	}
	public String getAllStudentsByAssignment(String id) {
		sortSet();
		String all=String.format("%-8s | %s\n",
 	    		 "ID", "Name");
		for (Student s:setOfStudents) {
			ArrayList<Assignment> current=s.getAllAssignments();
			for(Assignment x:current ) {
				if(x.getID()==id) {
					all += String.format("%-8s |%-8s \n",
							s.getstudentID(),
							s.getName());
				}
			}
		}	
		return all;
	}
	public Student baseStudent(String id) {
		sortSet();
		for (Student current : setOfStudents) {
			if (current.getstudentID()==id) {
				return current;
			}
			}
		return null;
	}
	
	
	
}
