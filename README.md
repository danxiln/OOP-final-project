Title:  Student Grade Management System for professor (similar to Jupiter Ed)
Team Member details: Daniel Lin, dl4471@nyu.edu, David Hao dhh5827@nyu.edu
Description of project: System is meant for teacher to input student grades into a self calculating system that will take the weight of the assignment (test, homework, etc) and help calculate overall grade
List of proposed features - along with description
Teacher Side
Manage Multiple Classrooms
System is for a  teacher who can have multiple classrooms. In each classroom it has a name, topic, year that's being teached and average gpa for the whole class. The class can also have a class note information section. 
Add Students
Add Student( the teacher can add different students into their classroom), their StudentID, their average gpa for the class, any notes created by the teacher. Automatically sorts the list upon adding new student to the classroom based on alphabetical order
Modify Student Information
Modify Student( the teacher can remove a student from the system  | Modify/delete grade( the teacher can either change the grade or delete the grade for each student and modify the classes. 
Add Assignment to Student
Add assignment to student, the assignment class will contain information such as due date (late or not), the name of the assignment, the type of assignment (hw, test, etc), it’s worth (i.e. 100x for a test, 10x for hw), the grade, and a small notes portion about the assignment. The system will automatically calculate the different grades for the student’s taking into account the weight and output/display the average overall, test, and hw grade for example. Automatically ensures that the user does not input the same assignment name twice for each student. If they do it simply does nothing 
Search for Student via studentID or name
Allows the teacher to search for specific students by studentID, or allows the teacher to get a list of students by name throughout the system. When a teacher opens any specific student page, will application displays average overall, test, and homework grades, along with basic details of student
 Sort Based on Grade
-In each classroom the teacher can click a sort button that sorts the students from highest to lowest grade. 
View Assignments to see how each student did in that assignment
- Teacher can view all of the created assignments, if she opens one assignment she will get basic details of the assignment and a list of students with their grades in that assignment

Implementation and notes: 
There is a class for each student and another class called grade that might store a title, value, and weight of the assignment. 
In the main_GUI class that has a txt box that first displays all the classrooms by name, classID and year. The teacher can add a classroom or read a specific classroom by classID into a search bar. The classroom_GUI that displays the list of students and another search bar. In the classroom_GUI it displays the name, classroom ID, year, average gpa for the class.  There is a sort button that the teacher can press which can sort the students based on their average gpa for that class.  The teacher can also modify the classroom and add, or read specific students by their studentID. In the classroom it displays student name, average gpa and studentID. 
When a teacher views a student they can add,delete an assignment. They can also see the students average gpa, any notes related to the student or modify any information about the student. Assuming each assignment name is unique, the student can finally read a specific assignment.  
When reading the specific assignment the teacher has the ability to manage the created assignments
Note: currently we have decided that there is only going to be 1 teacher who will be the admin for the system. We can always have another layer where there are multiple teachers under 1 admin if required.

