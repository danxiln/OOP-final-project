import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentID;
	private JTextField txtStudentName;
	private JTextField txtStudentGPA;
	private JTextField txtExamGrade;
	private JTextField txtProjectGrade;
	private JTextField txtQuizGrade;
	private JTextField txtHomeworkGrade;
	private JTextField txtAssignmentID;
	private JLabel lblStudentID ;
	private JLabel lblStudentName;
	private JLabel lblStudentNotes;

	private JLabel lblStudentGPA;
	private JLabel lblExamGrade;
	private JLabel lblProjectGrade;
	private JLabel lblQuizGrade;
	private JLabel lblHomeworkGrade;

	private JTextArea txtStudentNotes;
	private JLabel lblAssignmentID;
	private JLabel lblAssignments;
	private JButton btnAddAssignment;
	private JButton btnEditStudent;
	private JButton btnAccessAssignment;
	private JTextArea txtAssignments;	

	private Student s;
	private Classroom g;
	private classroomGUI cg;
	private JButton btnExit;
	
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public studentGUI(Student s,Classroom g, classroomGUI cg) {
		this.s=s;
		this.g=g;
		this.cg=cg;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(10, 11, 66, 14);
		contentPane.add(lblStudentID);
		
		txtStudentID = new JTextField();
		txtStudentID.setEditable(false);
		txtStudentID.setBounds(83, 8, 86, 20);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		lblStudentName = new JLabel("Student Name:");
		lblStudentName.setBounds(193, 11, 86, 14);
		contentPane.add(lblStudentName);
		
		txtStudentName = new JTextField();
		txtStudentName.setEditable(false);
		txtStudentName.setBounds(289, 8, 135, 20);
		contentPane.add(txtStudentName);
		txtStudentName.setColumns(10);
		
		lblStudentNotes = new JLabel("Student Notes:");
		lblStudentNotes.setBounds(0, 36, 98, 14);
		contentPane.add(lblStudentNotes);
		
		lblStudentGPA = new JLabel("GPA:");
		lblStudentGPA.setBounds(450, 10, 100, 20);
		contentPane.add(lblStudentGPA);
		
		txtStudentGPA = new JTextField();
		txtStudentGPA.setEditable(false);
		txtStudentGPA.setBounds(520, 10, 50, 20);
		contentPane.add(txtStudentGPA);
		txtStudentGPA.setColumns(10);
		
	        lblExamGrade = new JLabel("Exam:");
		lblExamGrade.setBounds(450, 40, 100, 20);
	        lblExamGrade = new JLabel("Exam GPA:");
		lblExamGrade.setBounds(434, 93, 113, 14);
        	contentPane.add(lblExamGrade);

        	txtExamGrade = new JTextField();
        	txtExamGrade.setEditable(false);
        	txtExamGrade.setBounds(520, 40, 50, 20);
        	contentPane.add(txtExamGrade);
        	txtExamGrade.setColumns(10);

		lblProjectGrade = new JLabel("Project:");
        	lblProjectGrade.setBounds(450, 70, 100, 14);
        	txtExamGrade.setBounds(545, 90, 100, 20);
        	contentPane.add(txtExamGrade);
        	txtExamGrade.setColumns(10);

		lblProjectGrade = new JLabel("Project GPA:");
        	lblProjectGrade.setBounds(434, 58, 113, 14);
        	contentPane.add(lblProjectGrade);

        	txtProjectGrade = new JTextField();
        	txtProjectGrade.setEditable(false);
        	txtProjectGrade.setBounds(520, 70, 50, 20);
        	contentPane.add(txtProjectGrade);
        	txtProjectGrade.setColumns(10);

		lblQuizGrade = new JLabel("Quiz:");
        	lblQuizGrade.setBounds(450, 100, 100, 20);
        	txtProjectGrade.setBounds(545, 62, 100, 20);
        	contentPane.add(txtProjectGrade);
        	txtProjectGrade.setColumns(10);

		lblQuizGrade = new JLabel("Quiz GPA:");
        	lblQuizGrade.setBounds(434, 36, 113, 14);
        	contentPane.add(lblQuizGrade);

        	txtQuizGrade = new JTextField();
        	txtQuizGrade.setEditable(false);
        	txtQuizGrade.setBounds(520, 100, 50, 20);
        	contentPane.add(txtQuizGrade);
        	txtQuizGrade.setColumns(10);

        	lblHomeworkGrade = new JLabel("Homework:");
        	lblHomeworkGrade.setBounds(450, 130, 100, 20);
        	txtQuizGrade.setBounds(545, 33, 100, 20);
        	contentPane.add(txtQuizGrade);
        	txtQuizGrade.setColumns(10);

        	lblHomeworkGrade = new JLabel("Homework GPA:");
        	lblHomeworkGrade.setBounds(437, 11, 113, 14);
        	contentPane.add(lblHomeworkGrade);

        	txtHomeworkGrade = new JTextField();
        	txtHomeworkGrade.setEditable(false);
       	 	txtHomeworkGrade.setBounds(520, 130, 50, 20);
       	 	txtHomeworkGrade.setBounds(545, 8, 100, 20);
        	contentPane.add(txtHomeworkGrade);
        	txtHomeworkGrade.setColumns(10);

		txtStudentNotes = new JTextArea();
		txtStudentNotes.setEditable(false);
		txtStudentNotes.setBounds(83, 39, 190, 49);
		contentPane.add(txtStudentNotes);
		
		lblAssignmentID = new JLabel("Assignment ID:");
		lblAssignmentID.setBounds(10, 108, 86, 14);
		contentPane.add(lblAssignmentID);
		
		txtAssignmentID = new JTextField();
		txtAssignmentID.setBounds(93, 105, 152, 20);
		contentPane.add(txtAssignmentID);
		txtAssignmentID.setColumns(10);
		
		txtAssignmentID = new JTextField();
		txtAssignmentID.setBounds(93, 105, 152, 20);
		contentPane.add(txtAssignmentID);
		txtAssignmentID.setColumns(10);

		lblAssignments = new JLabel("Assignments:");
		lblAssignments.setBounds(10, 133, 88, 14);
		contentPane.add(lblAssignments);
		
		btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentGUIAdder sga=new StudentGUIAdder(s,studentGUI.this);
				sga.setVisible(true);

				// calculate grade after entering assignments
				s.calcGrade();
				txtStudentGPA.setText(s.getGrade());
				txtExamGrade.setText(String.format("%.2f", s.calcGradeByType("Exam")));
				txtProjectGrade.setText(String.format("%.2f", s.calcGradeByType("Project")));
				txtQuizGrade.setText(String.format("%.2f", s.calcGradeByType("Quiz")));
				txtHomeworkGrade.setText(String.format("%.2f", s.calcGradeByType("Homework")));
				refreshGUI();
			}
		});

		btnAddAssignment.setBounds(103, 129, 150, 23);
		contentPane.add(btnAddAssignment);
		
		btnEditStudent = new JButton("Edit Student");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentGUIEditor sge=new studentGUIEditor(s,studentGUI.this,cg);
				sge.setVisible(true);
			}
		});
		btnEditStudent.setBounds(289, 129, 135, 23);
		contentPane.add(btnEditStudent);
		
		btnAccessAssignment = new JButton("Access Assignment");
		btnAccessAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String assignmentID = txtAssignmentID.getText();
				Assignment currentAssignment = s.selectAssignment(txtAssignmentID.getText());
				if(currentAssignment!=null) {
					assignmentGUI ag=new assignmentGUI(currentAssignment,studentGUI.this);
					ag.setVisible(true);
				}
				// error message to display when assignment with ID was not found
				else {
					JOptionPane.showMessageDialog(contentPane, "Assignment with ID " + 
							txtAssignmentID.getText() + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

				}
				
				String id=txtAssignmentID.getText();
				Assignment a= s.selectAssignment(id);
				assignmentGUI ag=new assignmentGUI(a,studentGUI.this);
				ag.setVisible(true);
			}
		});
		btnAccessAssignment.setBounds(272, 104, 152, 23);
		contentPane.add(btnAccessAssignment);
		
		txtAssignments = new JTextArea();
		txtAssignments.setBounds(10, 158, 414, 92);
		contentPane.add(txtAssignments);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(580, 227, 89, 23);
		contentPane.add(btnExit);
		refreshGUI();
	}
	public void refreshGUI() {
		txtStudentID.setText(s.getstudentID());
		txtStudentName.setText(s.getName());
		txtStudentGPA.setText(s.getGrade());
		txtStudentNotes.setText(s.getNotes());
		if(s!=null) {
			String x=s.StringOfAllAssigments();
			txtAssignments.setText(x);
			        
			// Update the specific grade fields for each type of assignment
			txtStudentGPA.setText(s.getGrade());
        		txtExamGrade.setText(String.format("%.2f", s.calcGradeByType("Exam")));
        		txtProjectGrade.setText(String.format("%.2f", s.calcGradeByType("Project")));
        		txtQuizGrade.setText(String.format("%.2f", s.calcGradeByType("Quiz")));
        		txtHomeworkGrade.setText(String.format("%.2f", s.calcGradeByType("Homework")));
		}
	}
	public void deleteStudent() {
		g.deleteStudent(s);
		dispose();
	}
	public void deleteAssignment(Assignment a) {
		s.deleteAssignment(a);
		cg.refreshStudents();
		dispose();
	}
}
