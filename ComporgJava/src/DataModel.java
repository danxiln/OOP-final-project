import java.util.*;
import java.util.ArrayList;

public class DataModel {
	private ArrayList<Classroom> Gradebook;
	
	DataModel(){
		Gradebook= new ArrayList<Classroom>();
	}
	
	// function to add a classroom
	public void addClass(Classroom nclass) {
		Gradebook.add(nclass);
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
	}
}
