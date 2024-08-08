import java.util.*;

public class DataModel {
	private ArrayList<Classroom> Gradebook;
	
	DataModel(){
		Gradebook= new ArrayList<Classroom>();
	}
	public void addClass(Classroom nclass) {
		Gradebook.add(nclass);
	}
	public Classroom searchClass(String id) {
		 return Classroom.searchGradeBookByID(Gradebook,id);
	}
	
	public String StringOfAllClasses() {
		String all="ID: Name: Year: \n";
		for (int i=0;i<Gradebook.size();i++) {
			Classroom current=Gradebook.get(i);;
			all+=current.getClassID()+" "+current.getName()+" "+ current.getYear()+"\n";
		}
		return all;
	}
}
