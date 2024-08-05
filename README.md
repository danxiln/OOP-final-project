# Student Grade Management System

## Overview
The Student Grade Management System is designed for teachers to manage student grades efficiently. Similar to Jupiter Ed, this system allows teachers to input student grades, calculate overall grades based on assignment weights, and manage multiple classrooms.

## Team Members
- **Daniel Lin**
  - Email: dl4471@nyu.edu
- **David Hao**
  - Email: dhh5827@nyu.edu

## Project Description
This system is intended for teachers to input student grades into a self-calculating system that will consider the weight of each assignment (test, homework, etc.) and help calculate the overall grade.

## Features

### Teacher Side

#### Manage Multiple Classrooms
- **Classroom Management**: Teachers can manage multiple classrooms. Each classroom has a name, topic, year, average GPA for the class, and a class notes section.

#### Add Students
- **Add Student**: Teachers can add different students to their classroom. Each student will have a StudentID, average GPA for the class, and any notes created by the teacher. The student list is automatically sorted in alphabetical order upon adding a new student.

#### Modify Student Information
- **Modify Student**: Teachers can remove a student from the system.
- **Modify/Delete Grade**: Teachers can change or delete the grades for each student and modify the classes.

#### Add Assignment to Student
- **Assignment Management**: Teachers can add assignments to students. Each assignment contains information such as due date, assignment name, type (hw, test, etc.), worth, grade, and a notes section. The system will automatically calculate different grades for students, taking into account the weight, and display the average overall, test, and homework grades. Duplicate assignment names for a student are not allowed.

#### Search for Student
- **Search**: Teachers can search for specific students by StudentID or name. When a teacher opens a specific student page, the application displays average overall, test, and homework grades, along with basic details of the student.

#### Sort Based on Grade
- **Sort**: In each classroom, teachers can sort students from highest to lowest grade.

#### View Assignments
- **Assignment Overview**: Teachers can view all created assignments. By opening an assignment, they can get basic details and a list of students with their grades in that assignment.

## Implementation and Notes
- There is a class for each student and another class called `Grade` that stores the title, value, and weight of the assignment.
- The `main_GUI` class has a text box that displays all the classrooms by name, classID, and year. Teachers can add a classroom or search for a specific classroom by classID.
- The `classroom_GUI` displays the list of students and another search bar. It displays the classroom name, classroom ID, year, and average GPA for the class. A sort button allows teachers to sort students based on their average GPA for that class.
- Teachers can modify the classroom, add, or search for specific students by their StudentID. In the classroom, it displays the student name, average GPA, and StudentID.
- When a teacher views a student, they can add or delete an assignment, see the student's average GPA, any notes related to the student, or modify any information about the student. Assuming each assignment name is unique, the teacher can read a specific assignment. When reading a specific assignment, the teacher can manage the created assignments.

### Note
Currently, the system is designed for a single teacher who will act as the admin. In future versions, we can add a layer where multiple teachers are managed under one admin if required.

## License
This project is licensed under the MIT License.
