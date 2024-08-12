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
import javax.swing.JTable;

public class classroomGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentID;
	private JTextField txtClassID;
	private JTextField txtClassName;
	private JTextField txtClassYear;
	private JLabel lblClassName;
	private JLabel lblClassID;
	private JLabel lblClassYear;
	private JLabel lblClassNotes;
	private JTextArea txtStudents;
	private JButton btnAddStudent;
	private JButton btnAccessStudent;
	private JButton btnEditClassroom;
	private JTextArea txtClassNotes;
	private JLabel lblStudentID;
	private JLabel lblStudents;
	private JLabel lblOverall;
	private JLabel lblQuiz;
	private JLabel lblExam;
	private JLabel lblProject;
	private JTextField txtOverall;
	private JTextField txtExam;
	private JTextField txtProject;
	private JTextField txtQuiz;
	private JTextField txtHomework;
	private JButton btnSortByGrade;
	private JButton btnSortbyAlphabet;
	private JButton btnRefresh;
	private JLabel lblHomework;
	private JButton btnExit;
	
	private Classroom currentClassroom;
	private DataModel dm;
	
	/**
	 * Launch the application.
	 */
	public classroomGUI(DataModel dm,Classroom currentClassroom) {
		this.dm=dm;
		this.currentClassroom=currentClassroom;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblClassName = new JLabel("Class Name:");
		lblClassName.setBounds(170, 6, 88, 16);
		contentPane.add(lblClassName);
		
		lblClassID = new JLabel("Class ID:");
		lblClassID.setBounds(6, 6, 112, 16);
		contentPane.add(lblClassID);
		
		lblClassYear = new JLabel("Class Year:");
		lblClassYear.setBounds(297, 33, 153, 16);
		contentPane.add(lblClassYear);
		
		lblClassNotes = new JLabel("Class Notes:");
		lblClassNotes.setBounds(6, 27, 71, 29);
		contentPane.add(lblClassNotes);
		
		txtStudents = new JTextArea();
		txtStudents.setEditable(false);
		txtStudents.setBounds(16, 164, 394, 102);
		contentPane.add(txtStudents);
		
		btnAddStudent =  new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickAddStudent();
			}
		});
		btnAddStudent.setBounds(237, 126, 130, 29);
		contentPane.add(btnAddStudent);
		
		btnAccessStudent = new JButton("Access Student");
		btnAccessStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickAccessStudent();
			}
		});
		btnAccessStudent.setBounds(237, 86, 150, 29);
		contentPane.add(btnAccessStudent);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(65, 87, 162, 26);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		btnEditClassroom = new JButton("Edit Classroom");
		btnEditClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickEdit();
			}
		});
		btnEditClassroom.setBounds(455, 247, 147, 29);
		contentPane.add(btnEditClassroom);
		
		txtClassID = new JTextField();
		txtClassID.setEditable(false);
		txtClassID.setBounds(65, 1, 99, 26);
		contentPane.add(txtClassID);
		txtClassID.setColumns(10);
		
		txtClassName = new JTextField();
		txtClassName.setEditable(false);
		txtClassName.setBounds(257, 1, 153, 26);
		contentPane.add(txtClassName);
		txtClassName.setColumns(10);
		
		txtClassNotes = new JTextArea();
		txtClassNotes.setEditable(false);
		txtClassNotes.setBounds(87, 35, 200, 42);
		contentPane.add(txtClassNotes);
		
		lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(6, 93, 77, 16);
		contentPane.add(lblStudentID);
		
		lblStudents = new JLabel("Students:");
		lblStudents.setBounds(16, 130, 61, 16);
		contentPane.add(lblStudents);
		
		txtClassYear = new JTextField();
		txtClassYear.setEditable(false);
		txtClassYear.setBounds(297, 50, 130, 26);
		contentPane.add(txtClassYear);
		txtClassYear.setColumns(10);
		
		lblOverall = new JLabel("Overall:");
		lblOverall.setBounds(445, 7, 46, 14);
		contentPane.add(lblOverall);
		
		lblQuiz = new JLabel("Quiz:");
		lblQuiz.setBounds(445, 63, 46, 14);
		contentPane.add(lblQuiz);
		
		lblExam = new JLabel("Exam:");
		lblExam.setBounds(445, 34, 46, 14);
		contentPane.add(lblExam);
		
		lblProject = new JLabel("Project:");
		lblProject.setBounds(445, 93, 46, 14);
		contentPane.add(lblProject);
		
		txtOverall = new JTextField();
		txtOverall.setEditable(false);
		txtOverall.setBounds(532, 4, 86, 20);
		contentPane.add(txtOverall);
		txtOverall.setColumns(10);
		
		txtExam = new JTextField();
		txtExam.setEditable(false);
		txtExam.setBounds(532, 31, 86, 20);
		contentPane.add(txtExam);
		txtExam.setColumns(10);
		
		txtProject = new JTextField();
		txtProject.setEditable(false);
		txtProject.setBounds(532, 91, 86, 20);
		contentPane.add(txtProject);
		txtProject.setColumns(10);
		
		txtQuiz = new JTextField();
		txtQuiz.setEditable(false);
		txtQuiz.setBounds(532, 57, 86, 20);
		contentPane.add(txtQuiz);
		txtQuiz.setColumns(10);
		
		txtHomework = new JTextField();
		txtHomework.setEditable(false);
		txtHomework.setBounds(532, 124, 86, 20);
		contentPane.add(txtHomework);
		txtHomework.setColumns(10);
		

		lblHomework = new JLabel("Homework:");
		lblHomework.setBounds(445, 124, 77, 14);
		contentPane.add(lblHomework);
		
		btnSortByGrade = new JButton("Sort By Grade");
		btnSortByGrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentClassroom.sortByGrade();
				btn_refreshStudents();
			}
		});
		btnSortByGrade.setBounds(445, 165, 162, 23);
		contentPane.add(btnSortByGrade);
		
		btnSortbyAlphabet = new JButton("Sort Alphabet");
		btnSortbyAlphabet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentClassroom.sortByAlphabet();
				btn_refreshStudents();
			}
		});
		btnSortbyAlphabet.setBounds(445, 213, 162, 23);
		contentPane.add(btnSortbyAlphabet);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(297, 277, 89, 23);
		contentPane.add(btnExit);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_refreshStudents();
			}
		});
		btnRefresh.setBounds(75, 124, 89, 29);
		contentPane.add(btnRefresh);
	
		
		
	}
	public void btn_refreshStudents() {
		setClassGUIDetail();
		if(currentClassroom!=null) {
			setStudentList();
			}
		
		}
	public void setClassGUIDetail() {
		txtClassID.setText(currentClassroom.getClassID());
		txtClassName.setText(currentClassroom.getName());
		txtClassYear.setText(currentClassroom.getYear());
		txtClassNotes.setText(currentClassroom.getNotes());
	}
	public void setStudentList() {
		String x=currentClassroom.StringOfAllStudents();
		txtStudents.setText(x);
		// refresh grades for each student added
		txtOverall.setText(String.format("%.2f", currentClassroom.calcGrade()));
    		txtExam.setText(String.format("%.2f", currentClassroom.calcGradeByType("Exam")));
    		txtProject.setText(String.format("%.2f", currentClassroom.calcGradeByType("Project")));
    		txtQuiz.setText(String.format("%.2f", currentClassroom.calcGradeByType("Quiz")));
    		txtHomework.setText(String.format("%.2f", currentClassroom.calcGradeByType("Homework")));
	}
	public void btn_clickAccessStudent() {
		Student currentStudent = currentClassroom.selectStudent(txtStudentID.getText());
		if(currentStudent!=null) {
			studentGUI sg=new studentGUI(currentStudent,currentClassroom);
			sg.setVisible(true);
		}
		// error message to display when classroom with ID was not found
		else {
			JOptionPane.showMessageDialog(contentPane, "Student with ID " + 
					txtStudentID.getText() + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

		}
		
	}
	public void btn_clickAddStudent() {
		classroomGUIAdder cga=new classroomGUIAdder(currentClassroom);
		cga.setVisible(true);
	}
	public void btn_clickEdit() {
		classroomGUIEditor cge=new classroomGUIEditor(currentClassroom,dm);
		cge.setVisible(true);
	}
}
