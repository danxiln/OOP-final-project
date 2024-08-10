import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClassroomGUIAdder extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudentName;
	private JTextField txtStudentID;
	private JLabel lblStudentID ;
	private JLabel lblStudentNotes ;
	private JLabel studentName;
	private JButton btnAddStudent;
	private JButton btnExit;
	private JTextArea txtStudentNotes;

	public ClassroomGUIAdder(Classroom g,classroomGUI cgu) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(10, 71, 73, 14);
		contentPane.add(lblStudentID);
		
		lblStudentNotes = new JLabel("Student Notes:");
		lblStudentNotes.setBounds(10, 115, 89, 14);
		contentPane.add(lblStudentNotes);
		
		studentName = new JLabel("Student Name:");
		studentName.setBounds(10, 25, 89, 14);
		contentPane.add(studentName);
		
		btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=txtStudentID.getText();
				String name=txtStudentName.getText();
				String notes=txtStudentNotes.getText();
				Student newStudent =new Student(id, name, notes);
				g.addStudent(newStudent);	
				cgu.refreshStudents();
				dispose();
			}
		});
		btnAddStudent.setBounds(54, 208, 112, 23);
		contentPane.add(btnAddStudent);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(228, 208, 89, 23);
		contentPane.add(btnExit);
		
		txtStudentName = new JTextField();
		txtStudentName.setBounds(95, 22, 86, 20);
		contentPane.add(txtStudentName);
		txtStudentName.setColumns(10);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(95, 68, 86, 20);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		txtStudentNotes = new JTextArea();
		txtStudentNotes.setBounds(98, 110, 219, 75);
		contentPane.add(txtStudentNotes);
	}

}
