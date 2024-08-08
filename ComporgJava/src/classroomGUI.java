import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class classroomGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		lblClassName.setBounds(136, 6, 78, 16);
		contentPane.add(lblClassName);
		
		JLabel lblClassID = new JLabel("Class ID:");
		lblClassID.setBounds(6, 6, 112, 16);
		contentPane.add(lblClassID);
		
		JLabel lblClassYear = new JLabel("Class Year:");
		lblClassYear.setBounds(297, 33, 153, 16);
		contentPane.add(lblClassYear);
		
		JLabel lblClassNotes = new JLabel("ClassNotes:");
		lblClassNotes.setBounds(6, 26, 78, 29);
		contentPane.add(lblClassNotes);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(16, 151, 394, 115);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(91, 120, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Student");
		btnNewButton_1.setBounds(333, 88, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.setBounds(214, 88, 117, 29);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(81, 88, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Delete Classroom");
		btnNewButton_3.setBounds(243, 120, 189, 29);
		contentPane.add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 1, 67, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(214, 1, 171, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(96, 34, 189, 42);
		contentPane.add(textArea_1);
		
		JLabel lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(6, 93, 78, 16);
		contentPane.add(lblStudentID);
		
		JLabel lblStudents = new JLabel("Students:");
		lblStudents.setBounds(6, 123, 61, 16);
		contentPane.add(lblStudents);
		
		textField_3 = new JTextField();
		textField_3.setBounds(297, 50, 130, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
