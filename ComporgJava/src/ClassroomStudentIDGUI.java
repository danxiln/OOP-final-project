import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClassroomStudentIDGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStudentName;
	private JTextField txtID;
	private JTextField txtHomework;
	private JTextField txtQuiz;
	private JTextField txtProject;
	private JTextField txtExam;
	private JTextField txtGPA;
	DataModel newdm;
	String newid;

	/**
	 * Launch the application.
	 */
	public ClassroomStudentIDGUI(DataModel dm,String id) {
		newdm=dm;
		newid=id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setBounds(10, 11, 84, 14);
		contentPane.add(lblStudentName);
		
		txtStudentName = new JTextField();
		txtStudentName.setEditable(false);
		txtStudentName.setBounds(104, 8, 86, 20);
		contentPane.add(txtStudentName);
		txtStudentName.setColumns(10);
		
		JLabel lblStudentID = new JLabel("Student ID");
		lblStudentID.setBounds(10, 36, 84, 14);
		contentPane.add(lblStudentID);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(104, 33, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblHomeworkGPA = new JLabel("Homework GPA:");
		lblHomeworkGPA.setBounds(10, 70, 84, 14);
		contentPane.add(lblHomeworkGPA);
		
		txtHomework = new JTextField();
		txtHomework.setEditable(false);
		txtHomework.setBounds(104, 64, 86, 20);
		contentPane.add(txtHomework);
		txtHomework.setColumns(10);
		
		JLabel lblQuizGPA = new JLabel("Quiz GPA:");
		lblQuizGPA.setBounds(10, 95, 88, 14);
		contentPane.add(lblQuizGPA);
		
		txtQuiz = new JTextField();
		txtQuiz.setEditable(false);
		txtQuiz.setBounds(104, 95, 86, 20);
		contentPane.add(txtQuiz);
		txtQuiz.setColumns(10);
		
		JLabel lblProjectGPA = new JLabel("Project GPA:");
		lblProjectGPA.setBounds(10, 132, 84, 14);
		contentPane.add(lblProjectGPA);
		
		txtProject = new JTextField();
		txtProject.setEditable(false);
		txtProject.setBounds(104, 126, 86, 20);
		contentPane.add(txtProject);
		txtProject.setColumns(10);
		
		txtExam = new JTextField();
		txtExam.setEditable(false);
		txtExam.setBounds(104, 157, 86, 20);
		contentPane.add(txtExam);
		txtExam.setColumns(10);
		
		JLabel lblExamGPA = new JLabel("Exam GPA:");
		lblExamGPA.setBounds(10, 157, 84, 14);
		contentPane.add(lblExamGPA);
		
		JLabel lblGPA = new JLabel("GPA:");
		lblGPA.setBounds(10, 192, 84, 14);
		contentPane.add(lblGPA);
		
		txtGPA = new JTextField();
		txtGPA.setEditable(false);
		txtGPA.setBounds(104, 188, 86, 20);
		contentPane.add(txtGPA);
		txtGPA.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(277, 225, 89, 23);
		contentPane.add(btnExit);
		refreshStudent();
	}
	public void refreshStudent() {
		Student base=newdm.baseStudent(newid);
		txtStudentName.setText(base.getName());
		txtID.setText(base.getstudentID());
		double gpa=newdm.getStudentGPA(newid);
		double quiz=newdm.getStudentGPAByType(newid,"Quiz");
		double exam=newdm.getStudentGPAByType(newid,"Exam");
		double Project=newdm.getStudentGPAByType(newid,"Project");
		double Homework=newdm.getStudentGPAByType(newid,"Homework");
		txtGPA.setText(Double.toString(gpa));
		txtQuiz.setText(Double.toString(quiz));
		txtExam.setText(Double.toString(exam));
		txtProject.setText(Double.toString(Project));
		txtHomework.setText(Double.toString(Homework));
	}

}
