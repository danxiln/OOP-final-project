import java.io.*;
import java.util.*;

public class GradeBook {
	// create an array list named student_list to hold the student objects, and a scanner to read 
	// inputs from console
	static ArrayList<Student> student_list = new ArrayList<Student>();
	static Scanner scanner = new Scanner(System.in);
	static String name, studentid, grade, notes;

	// Main Function
	public static void main(String[] args) {
		// Create searchResults array list to hold search results
		ArrayList<Student> searchResults = new ArrayList<>();
		// Create variables to hold user inputs for choices on what to do pertaining to search
		// also create searchMethod to determine whether or not you are searching by name or by studentID
		// Create delete variable to identfy which name to delete
		String choice, searchMethod, deleteChoice;
		while (true) {
			// initial starting screen UI
			System.out.println("GradeBook Classroom:");
			System.out.println("===================");
			System.out.println("Choose one of the following options:");
			System.out.println("(1) List all students");
			System.out.println("(2) Sort students");
			System.out.println("(3) Addd student");
			System.out.println("(4) Search for student");
			System.out.println("(5) Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextLine();

			// Use compare to determine which input, in the case of 1, we would then go about adding a new contact
			// Choice 5 to exit program
			if (choice.compareTo("5") == 0) {
				break;
			}
		}
	}
}
