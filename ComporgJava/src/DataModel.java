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
			for(Student currentStudent:currentClass.getAllStudents()) {
				 System.out.println("Adding student: " + currentStudent.getstudentID());
			        boolean added = setOfStudents.add(currentStudent);
			        System.out.println("Was student added? " + added);
			}
		}
		//sorts assignments
		for(Student currentStudent:setOfStudents) {
			setOfAllAssignments.addAll(currentStudent.getAllAssignments());
		}
	}

	public String StringOfAllStudents() {
		sortSet();
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s | %-30s\n",
			       	    		 "ID", "Name");
		
		for (Student s:setOfStudents) {
			all += String.format("%-8s | %-30s\n",
				     s.getstudentID(),
				     s.getName());
		}
		return all;
	}
	public String StringOfAllStudentsByName(String name) {
		sortSet();
		String all=String.format("%-8s | %-30s\n",
 	    		 "ID", "Name");
		for (Student s:setOfStudents) {
			if((s.getName().contains(name))) {
				all += String.format("%-8s | %-30s\n",
					     s.getstudentID(),
					     s.getName());
			}
		}	
		return all;
		
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
	public Student baseStudent(String id) {
		sortSet();
		for (Student current : setOfStudents) {
			if (current.getstudentID().equals(id)) {
				return current;
			}
			}
		return null;
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
	public void SystemOutPrintStudent() {
        Iterator itr = setOfStudents.iterator();
        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
	}

	
	
	
}
