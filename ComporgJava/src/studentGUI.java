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
	private JTextField txtAssigmentID;
	private JLabel lblStudentID ;
	private JLabel lblStudentName;
	private JLabel lblStudentNotes;
	private JLabel lblStudentGPA;
	private JTextArea txtStudentNotes;
	private JLabel lblAssigmentID;
	private JLabel lblAssigments;
	private JButton btnAddAssigment;
	private JButton btnEditStudent;
	private JButton btnAccessAssigment;
	private JTextArea txtAssigments;
	

	private Student s;
	private Classroom g;
	private classroomGUI cg;
	
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
		setBounds(100, 100, 450, 300);
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
		
		lblStudentGPA = new JLabel("Student GPA:");
		lblStudentGPA.setBounds(289, 39, 113, 14);
		contentPane.add(lblStudentGPA);
		
		txtStudentGPA = new JTextField();
		txtStudentGPA.setEditable(false);
		txtStudentGPA.setBounds(289, 55, 135, 20);
		contentPane.add(txtStudentGPA);
		txtStudentGPA.setColumns(10);
		
		txtStudentNotes = new JTextArea();
		txtStudentNotes.setEditable(false);
		txtStudentNotes.setBounds(83, 39, 190, 49);
		contentPane.add(txtStudentNotes);
		
		lblAssigmentID = new JLabel("Assigment ID:");
		lblAssigmentID.setBounds(10, 108, 86, 14);
		contentPane.add(lblAssigmentID);
		
		txtAssigmentID = new JTextField();
		txtAssigmentID.setBounds(93, 105, 152, 20);
		contentPane.add(txtAssigmentID);
		txtAssigmentID.setColumns(10);
		
		lblAssigments = new JLabel("Assignments:");
		lblAssigments.setBounds(10, 133, 88, 14);
		contentPane.add(lblAssigments);
		
		btnAddAssigment = new JButton("Add Assignment");
		btnAddAssigment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentGUIAdder sga=new StudentGUIAdder(s,studentGUI.this);
				sga.setVisible(true);
			}
		});
		btnAddAssigment.setBounds(103, 129, 150, 23);
		contentPane.add(btnAddAssigment);
		
		btnEditStudent = new JButton("Edit Student");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				studentGUIEditor sge=new studentGUIEditor(s,studentGUI.this,cg);
				sge.setVisible(true);
			}
		});
		btnEditStudent.setBounds(289, 129, 135, 23);
		contentPane.add(btnEditStudent);
		
		btnAccessAssigment = new JButton("Access Assignment");
		btnAccessAssigment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Assignment currentAssigment = s.selectAssignment(txtAssigmentID.getText());
				if(currentAssigment!=null) {
					assignmentGUI ag=new assignmentGUI(currentAssigment,studentGUI.this);
					ag.setVisible(true);
				}
				// error message to display when classroom with ID was not found
				else {
					JOptionPane.showMessageDialog(contentPane, "Assignment with ID " + 
							txtAssigmentID.getText() + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

				}
				
				String id=txtAssigmentID.getText();
				Assignment a= s.selectAssignment(id);
				assignmentGUI ag=new assignmentGUI(a,studentGUI.this);
				ag.setVisible(true);
			}
		});
		btnAccessAssigment.setBounds(272, 104, 152, 23);
		contentPane.add(btnAccessAssigment);
		
		txtAssigments = new JTextArea();
		txtAssigments.setBounds(10, 158, 414, 92);
		contentPane.add(txtAssigments);
		refreshGUI();
	}
	public void refreshGUI() {
		txtStudentID.setText(s.getstudentID());
		txtStudentName.setText(s.getName());
		txtStudentGPA.setText(s.getGrade());
		txtStudentNotes.setText(s.getNotes());
		if(s!=null) {
			String x=s.StringOfAllAssigments();
			txtAssigments.setText(x);
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
