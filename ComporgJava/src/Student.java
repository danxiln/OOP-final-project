import java.util.ArrayList;
import java.util.*;
public class Student implements Comparable<Student> {
	private static int students = 0;
	private static int currentid;
	private String name, idNumber, notes;
	private ArrayList<Assignment> assignments;
	private double grade;

	Student(String student_name, String studentid , String student_note) {
		currentid = students;
		name = student_name;
		idNumber = studentid;
		notes = student_note;
		assignments=new ArrayList<Assignment>();
		grade = 0;
	}

	// Methods to return attributes of Student variable
	public static int getStudents() {
		return students;
	}
	
	// currentID refers to the id of the current student that is being called, used for organizational purposes
	// not to get confused with StudentID which is a specific attribute to student's
	public int getcurrentID() {
		return currentid;
	}

	public String getName() {
		return name;
	}

	public String getstudentID() {
		return idNumber;
	}
	public String getGrade() {
		return String.format("%.2f", grade);
	}
	public double getGradeDouble() {
		return grade;
	}

	public String getNotes() {
		return notes;
	}
	public int getStudentSize() {
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
	public void reset(){
		students = 0;
	}

	public static void incramentStudent() {
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
	
	public String StringOfAllAssignments() {
		// formating to print classrooms in the appropriate format
		String all=String.format("%-8s |%-24s |%-12s| %-8s\n",
		       	    		 "ID", "Name","Due Date","Grade");
		if(assignments!=null) {
		for (Assignment current : assignments) {
			all += String.format("%-8s |%-24s |%-12s |%-8s\n",
					     current.getID(),
					     current.getName(),
					     current.getdueDate(),
					     current.getGrade());
		}
		}
		return all;
	}

	public void deleteAssignment(Assignment a) {
		assignments.remove(a);
		
	}

	// method to calcualte overall assignment grade
        public double calcGrade() {
                double totalGrades = 0;
                double totalWeights = 0;

                for (Assignment assignment : assignments) {
                        // parse through grade and weight from the assignments and convert string to numerical
                        double grade = Double.parseDouble(assignment.getGrade());
                        double weight = Double.parseDouble(assignment.getWeight().replace("x", ""));

                        // multiply the grade by the weight to get how much the assignment is worth
                        // and add it total
                        totalGrades += grade * weight;

                        // find the total weights by adding the weight of each assignment together
                        totalWeights += weight;
                }
                // stop error if no assignments are added
                if (totalWeights == 0) {
                        return 0;
                }

                double overallGrade = (totalGrades / totalWeights);
                grade = overallGrade;
		return grade;
        }

	// calculate grade by type of assignment
	public double calcGradeByType(String type) {
                double totalGrades = 0;
                double totalWeights = 0;

		for (Assignment assignment : assignments) {
			if (type == null || assignment.getType().equalsIgnoreCase(type)) {
				double grade = Double.parseDouble(assignment.getGrade());
				double weight = Double.parseDouble(assignment.getWeight().replace("x",""));

				totalGrades += grade * weight;
				totalWeights += weight;
			}
		}

		if (totalWeights == 0) {
			return 0;
		}

		double typeGrade = (totalGrades / totalWeights);
		return typeGrade;
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
		@Override
        public int hashCode() {
                return Objects.hash(idNumber);
	}
        @Override
        public boolean equals(Object o) {
        	System.out.println("used");
            if (this==o) {
            	System.out.println("true");
            	return true;
            }
            if (o == null || getClass() != o.getClass()) {
            	System.out.println("false");
            	return false;
            }
            Student student = (Student) o;
            boolean isEqual = Objects.equals(idNumber, student.idNumber);
            return isEqual;
        }
        
        public 	ArrayList<Assignment> getAllAssignments(){
        	return assignments;
        }
}
		



