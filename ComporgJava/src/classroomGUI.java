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

public class classroomGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtStudentID;
	private JTextField txtClassID;
	private JTextField txtClassName;
	private JTextField txtClassYear;

	/**
	 * Launch the application.
	 */
	public classroomGUI(Classroom g) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClassName = new JLabel("Class Name:");
		lblClassName.setBounds(174, 6, 66, 16);
		contentPane.add(lblClassName);
		
		JLabel lblClassID = new JLabel("Class ID:");
		lblClassID.setBounds(6, 6, 112, 16);
		contentPane.add(lblClassID);
		
		JLabel lblClassYear = new JLabel("Class Year:");
		lblClassYear.setBounds(297, 33, 153, 16);
		contentPane.add(lblClassYear);
		
		JLabel lblClassNotes = new JLabel("ClassNotes:");
		lblClassNotes.setBounds(6, 27, 61, 29);
		contentPane.add(lblClassNotes);
		
		JTextArea txtStudents = new JTextArea();
		txtStudents.setEditable(false);
		txtStudents.setBounds(16, 151, 394, 115);
		contentPane.add(txtStudents);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classroomGUIAdder cga=new classroomGUIAdder();
				cga.setVisible(true);
			}
		});
		btnAddStudent.setBounds(328, 88, 99, 29);
		contentPane.add(btnAddStudent);
		
		JButton btnAcessStudent = new JButton("Access Student");
		btnAcessStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAcessStudent.setBounds(181, 88, 106, 29);
		contentPane.add(btnAcessStudent);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(65, 89, 112, 26);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		JButton btnDeleteClassroom = new JButton("Delete Classroom");
		btnDeleteClassroom.setBounds(277, 117, 147, 29);
		contentPane.add(btnDeleteClassroom);
		
		txtClassID = new JTextField();
		txtClassID.setEditable(false);
		txtClassID.setBounds(65, 1, 99, 26);
		contentPane.add(txtClassID);
		txtClassID.setColumns(10);
		
		txtClassName = new JTextField();
		txtClassName.setEditable(false);
		txtClassName.setBounds(243, 1, 167, 26);
		contentPane.add(txtClassName);
		txtClassName.setColumns(10);
		
		JTextArea txtClassNotes = new JTextArea();
		txtClassNotes.setEditable(false);
		txtClassNotes.setBounds(65, 35, 222, 42);
		contentPane.add(txtClassNotes);
		
		JLabel lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(6, 93, 78, 16);
		contentPane.add(lblStudentID);
		
		JLabel lblStudents = new JLabel("Students:");
		lblStudents.setBounds(6, 123, 61, 16);
		contentPane.add(lblStudents);
		
		txtClassYear = new JTextField();
		txtClassYear.setEditable(false);
		txtClassYear.setBounds(297, 50, 130, 26);
		contentPane.add(txtClassYear);
		txtClassYear.setColumns(10);
	}

}
