import java.util.ArrayList;
import java.util.*;
public class Student implements Comparable<Student> {
	static int students = 0;
	static int currentid;
	String name, idNumber, grade, notes;
	ArrayList<Assignment> assignments;

	Student(String student_name, String studentid , String student_note) {
		currentid = students;
		name = student_name;
		idNumber = studentid;
		notes = student_note;
		assignments=new ArrayList<Assignment>();
	}

	// Methods to return attributes of Student variable
	static int getStudents() {
		return students;
	}
	
	// currentID refers to the id of the current student that is being called, used for organizational purposes
	// not to get confused with StudentID which is a specific attribute to student's
	int getcurrentID() {
		return currentid;
	}

	String getName() {
		return name;
	}

	String getstudentID() {
		return idNumber;
	}

	String getGrade() {
		return grade;
	}

	String getNotes() {
		return notes;
	}
	int getStudentSize() {
		return assignments.size();
	}
	public void setName(String n) {
		name=n;
	}
	public void setID(String id) {
		idNumber=id;
	}
	public void setNotes(String n) {
		notes=n;
	}
	// method to reset the number of studnets to 0 or to add a static student
	void reset(){
		students = 0;
	}

	static void incramentStudent() {
		students++;
	}

	// compare current student's name to that of another, used for sorting contacts by name in main
	public int compareTo(Student student) {
		return name.compareTo(student.name);
	}
	
	// method to add assignment item to individual student
	public void addAssignment(Assignment assignment) {
		assignments.add(assignment);
	}
	public Assignment selectAssigment(String assigmentID) {
		for (Assignment a : assignments) {
			if (a.getID().equals(assigmentID)) {
				return a;
			}
		}
		
		// return null if not possible
		return null;
	}
	
	public String StringOfAllAssigments() {
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s |%-8s |%12s| %8s\n",
		       	    		 "ID", "Name","Due Date","Grade");
		if(assignments!=null) {
		for (Assignment current : assignments) {
			all += String.format("%-8s |%-8s |%12s |%8s\n",
					     current.getID(),
					     current.getName(),
					     current.getdueDate(),
					     current.getGrade());
		}
		}
		return all;
	}
	public String toString() {
		String all="";
		for (Assignment current : assignments) {
			all += String.format("%-8s |%-8s |%12s |%8s\n",
					     current.getID(),
					     current.getName(),
					     current.getdueDate(),
					     current.getGrade());
		}
		return all;
	}
	public void deleteAssignment(Assignment a) {
		assignments.remove(a);
		
	}
	public Assignment selectAssignment(String AssigmentID) {
		for (Assignment a : assignments) {
			if (a.getID().equals(AssigmentID)) {
				return a;
			}
		}
		
		// return null if not possible
		return null;
	}
    public int hashCode() {
        return Objects.hash(currentid);
    }
}
		



