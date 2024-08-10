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

public class classroomGUI extends JFrame {

	private static final long serialVersionUID = 1L;
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
	private JButton btnAcessStudent;
	private JButton btnEditClassroom;
	private JTextArea txtClassNotes;
	private JLabel lblStudentID;
	private JLabel lblStudents;
	private Classroom g;
	private DataModel dm;
	private GradebookGUI cbg;
	/**
	 * Launch the application.
	 */
	public classroomGUI(DataModel dm,Classroom g,GradebookGUI cbg) {
		this.cbg=cbg;
		this.dm=dm;
		this.g=g;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		
		btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classroomGUIAdder cga=new classroomGUIAdder(g,classroomGUI.this);
				cga.setVisible(true);
			}
		});
		btnAddStudent.setBounds(87, 124, 130, 29);
		contentPane.add(btnAddStudent);
		
		btnAcessStudent = new JButton("Access Student");
		btnAcessStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student currentStudent = g.selectStudent(txtStudentID.getText());
				if(currentStudent!=null) {
					studentGUI sg=new studentGUI(currentStudent,g,classroomGUI.this);
					sg.setVisible(true);
				}
				// error message to display when classroom with ID was not found
				else {
					JOptionPane.showMessageDialog(contentPane, "Student with ID " + 
							txtStudentID.getText() + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

				}
			}
		});
		btnAcessStudent.setBounds(237, 86, 150, 29);
		contentPane.add(btnAcessStudent);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(65, 87, 162, 26);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		btnEditClassroom = new JButton("Edit Classroom");
		btnEditClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classroomGUIEditor cge=new classroomGUIEditor(g,classroomGUI.this);
				cge.setVisible(true);
			}
		});
		btnEditClassroom.setBounds(250, 124, 147, 29);
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
	
		refreshStudents();
		
		
	}
	public void refreshStudents() {
		txtClassID.setText(g.getClassID());
		txtClassName.setText(g.getName());
		txtClassYear.setText(g.getYear());
		txtClassNotes.setText(g.getNotes());
		if(g!=null) {
			String x=g.StringOfAllStudents();
			txtStudents.setText(x);
			}
		}
	public void refreshGradebook() {
		cbg.refreshClassrooms();
	}
	public void deleteClassroom() {
		dm.delete(g);
		cbg.refreshClassrooms();
		dispose();
	}
}
