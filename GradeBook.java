import java.io.*;
import java.util.*;

public class GradeBook {
	// create an array list to hold Classroom Objects
	static ArrayList<Classroom> classroomList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	// function to add a classroom when the user prompts it
	public static void addClassroom() {
		System.out.println();
		System.out.print("Please enter the classroom ID: ");
		String classID = scanner.nextLine();
		System.out.print("Please enter the classroom name: ");
		String className = scanner.nextLine();
		
		// loop to ensure that a valid year is inputted
		int classYear;
		while (true) {
			System.out.print("Please enter the classroom year: ");
			String Input = scanner.nextLine();
			try {
				classYear = Integer.parseInt(Input);
				break;
			}
			catch (NumberFormatException e) {
				System.out.println("\nInvalid Input. Please enter a valid year (i.e. '2020').\n");
			}
		}
		
		System.out.print("Please enter classroom notes: ");
		String classNotes = scanner.nextLine();
		
		// Use user inputted classroom information to generate a new classroom with the associated information
		Classroom newClassroom = new Classroom(classID, className, classYear, classNotes);
		
		// Add classroom to array of classrooms
		classroomList.add(newClassroom);
		System.out.printf("\n%s added successfully\n", classID);
	}

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
			System.out.println("(1) Add a classroom");
			System.out.println("(2) Select a classroom");
			System.out.println("(3) Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextLine();

			// Choice 1 to add a new classroom
			if (choice.compareTo("1") == 0) {
				addClassroom();
				System.out.println();
			}
			// Choice 3 to exit program
			if (choice.compareTo("3") == 0) {
				break;
			}
		}
	}
}
