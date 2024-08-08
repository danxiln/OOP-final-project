public class Assignment implements Comparable<Assignment> {
	static int assignments = 0, id;
	String dueDate, name, type, grade, weight, notes;

	Assignment(String assignment_name, String assignment_dueDate, String assignment_type,
 		   String assignment_grade, String assignment_weight, String assignment_notes) {
		id = assignments;
		name = assignment_name;
		dueDate = assignment_dueDate;
		type = assignment_type;
		grade = assignment_grade;
		weight = assignment_weight;
		notes = assignment_notes;
	}

	// methods to retrieve variables from assignment
	static int getAssignments() {
		return assignments;
	}

	int getID() {
		return id;
	}

	String getName() {
		return name;
	}

	String getdueDate() {
		return dueDate;
	}

	String getType() {
		return type;
	}

	String getGrade() {
		return weight;
	}

	String getWeight() {
		return weight;
	}

	String getNotes() {
		return notes;
	}

	// method to reset assignments to 0 and add to number of assignments
	void reset() {
		assignments = 0;
	}

	static void countAssignments() {
		assignments++;
	}

	// compareTo to compare assignment name with that of other's
	public int compareTo(Assignment assignment) {
		return name.compareTo(assignment.name);
	}
}


