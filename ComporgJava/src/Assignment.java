public class Assignment implements Comparable<Assignment> {
	static int IdCounter=0;
	String dueDate, name, type, grade, weight, notes,id;

	Assignment(String assignment_name, String assignment_dueDate, String assignment_type,
 		   String assignment_grade, String assignment_weight, String assignment_notes) {
		id = Integer.toString(IdCounter);
		name = assignment_name;
		dueDate = assignment_dueDate;
		type = assignment_type;
		grade = assignment_grade;
		weight = assignment_weight;
		notes = assignment_notes;
		IdCounter+=1;
	}

public static int getIdCounter() {
	return IdCounter;
}
	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getdueDate() {
		return dueDate;
	}

	public String getType() {
		return type;
	}

	// use getGrade and getWeight methods to retrieve grade's to be used as part of 
	// auto calculation
	public String getGrade() {
		return grade;
	}

	public String getWeight() {
		return weight;
	}

	public String getNotes() {
		return notes;
	}

	public void setID(String i) {
		id=i;
	}

	public void setName(String n) {
		name=n;
	}

	public void setDueDate(String sdd) {
		dueDate=sdd;
	}

	public void setType(String t) {
		type=t;
	}

	public void setGrade(String g) {
		grade=g;
	}

	public void setWeight(String w) {
		weight=w;
	}

	public void setNotes(String n) {
		notes=n;
	}
	

	// method to reset assignments to 0 and add to number of assignments

	// compareTo to compare assignment name with that of other's
	public int compareTo(Assignment assignment) {
		return name.compareTo(assignment.name);
	}
}


