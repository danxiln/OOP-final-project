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

public class studentGUIEditor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStudentName;
	private JTextField txtStudentID;
	private JLabel lblStudentName;
	private JLabel lblStudentID;
	private JLabel lblStudentNotes;
	private JTextArea txtStudentNotes;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnExit;
	
	Student currentStudent;
	Classroom currentClassroom;
	
	public studentGUIEditor(Student currentStudent,Classroom currentClassroom) {
		this.currentStudent=currentStudent;
		this.currentClassroom=currentClassroom;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblStudentName = new JLabel("Student Name:");
		lblStudentName.setBounds(10, 11, 89, 14);
		contentPane.add(lblStudentName);
		
		txtStudentName = new JTextField();
		txtStudentName.setBounds(109, 8, 152, 20);
		contentPane.add(txtStudentName);
		txtStudentName.setColumns(10);
		
		lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(10, 51, 89, 14);
		contentPane.add(lblStudentID);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(109, 48, 152, 20);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		lblStudentNotes = new JLabel("Student Notes:");
		lblStudentNotes.setBounds(10, 103, 89, 14);
		contentPane.add(lblStudentNotes);
		
		txtStudentNotes = new JTextArea();
		txtStudentNotes.setBounds(109, 98, 187, 106);
		contentPane.add(txtStudentNotes);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickSave();

			}
		});
		btnSave.setBounds(37, 215, 89, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("Delete Student");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickDelete(); 
			}
		});
		btnDelete.setBounds(157, 215, 104, 23);
		contentPane.add(btnDelete);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(302, 215, 89, 23);
		contentPane.add(btnExit);
		setStudentDetail();
	}
	public void setStudentDetail() {
		txtStudentID.setText(currentStudent.getstudentID());
		txtStudentName.setText(currentStudent.getName());
		txtStudentNotes.setText(currentStudent.getNotes());
	}
	public void btn_clickSave() {
		currentStudent.setID(txtStudentID.getText());
		currentStudent.setName(txtStudentName.getText());
		currentStudent.setNotes(txtStudentNotes.getText());
		dispose();
	}
	public void btn_clickDelete() {
		currentClassroom.deleteStudent(currentStudent);
		dispose();
	}
	

}
