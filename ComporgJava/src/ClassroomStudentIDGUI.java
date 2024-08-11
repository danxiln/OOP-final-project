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
	private JTextField textField;
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
		setBounds(100, 100, 414, 363);
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
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(104, 33, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblStudentNotes = new JLabel("Student Notes:");
		lblStudentNotes.setBounds(10, 67, 84, 14);
		contentPane.add(lblStudentNotes);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(104, 64, 213, 74);
		contentPane.add(textArea);
		
		JLabel lblHomeworkGPA = new JLabel("Homework GPA:");
		lblHomeworkGPA.setBounds(10, 161, 84, 14);
		contentPane.add(lblHomeworkGPA);
		
		txtHomework = new JTextField();
		txtHomework.setEditable(false);
		txtHomework.setBounds(104, 158, 86, 20);
		contentPane.add(txtHomework);
		txtHomework.setColumns(10);
		
		JLabel lblQuizGPA = new JLabel("Quiz GPA:");
		lblQuizGPA.setBounds(10, 186, 88, 14);
		contentPane.add(lblQuizGPA);
		
		txtQuiz = new JTextField();
		txtQuiz.setEditable(false);
		txtQuiz.setBounds(104, 189, 86, 20);
		contentPane.add(txtQuiz);
		txtQuiz.setColumns(10);
		
		JLabel lblProjectGPA = new JLabel("Project GPA:");
		lblProjectGPA.setBounds(10, 221, 84, 14);
		contentPane.add(lblProjectGPA);
		
		txtProject = new JTextField();
		txtProject.setEditable(false);
		txtProject.setBounds(104, 220, 86, 20);
		contentPane.add(txtProject);
		txtProject.setColumns(10);
		
		txtExam = new JTextField();
		txtExam.setEditable(false);
		txtExam.setBounds(104, 251, 86, 20);
		contentPane.add(txtExam);
		txtExam.setColumns(10);
		
		JLabel lblExamGPA = new JLabel("Exam GPA:");
		lblExamGPA.setBounds(10, 254, 84, 14);
		contentPane.add(lblExamGPA);
		
		JLabel lblGPA = new JLabel("GPA:");
		lblGPA.setBounds(10, 287, 84, 14);
		contentPane.add(lblGPA);
		
		txtGPA = new JTextField();
		txtGPA.setEditable(false);
		txtGPA.setBounds(104, 284, 86, 20);
		contentPane.add(txtGPA);
		txtGPA.setColumns(10);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(263, 283, 89, 23);
		contentPane.add(btnExit);
	}
	public void refreshStudent() {
		Student base=newdm.baseStudent(newid);
	}

}
