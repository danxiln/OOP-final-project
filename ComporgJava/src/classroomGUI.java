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
		contentPane.setBorder(new EmptyBorder(15, 15, 15, 15));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClassName = new JLabel("Class Name:");
		lblClassName.setBounds(181, 10, 61, 16);
		contentPane.add(lblClassName);
		
		JLabel lblClassID = new JLabel("Class ID:");
		lblClassID.setBounds(6, 10, 78, 16);
		contentPane.add(lblClassID);
		
		JLabel lblClassYear = new JLabel("Class Year:");
		lblClassYear.setBounds(249, 37, 78, 16);
		contentPane.add(lblClassYear);
		
		JLabel lblClassNotes = new JLabel("ClassNotes:");
		lblClassNotes.setBounds(6, 37, 78, 16);
		contentPane.add(lblClassNotes);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(23, 147, 380, 62);
		contentPane.add(textArea);
		
		JButton btnNewButton_1 = new JButton("Add Student");
		btnNewButton_1.setBounds(23, 220, 150, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnSearch = new JButton("Access Student");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(307, 88, 117, 29);
		contentPane.add(btnSearch);
		
		txtStudentID = new JTextField();
		txtStudentID.setBounds(72, 94, 167, 26);
		contentPane.add(txtStudentID);
		txtStudentID.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Delete Classroom");
		btnNewButton_3.setBounds(210, 220, 180, 29);
		contentPane.add(btnNewButton_3);
		
		txtClassID = new JTextField();
		txtClassID.setEditable(false);
		txtClassID.setBounds(72, 10, 99, 26);
		contentPane.add(txtClassID);
		txtClassID.setColumns(10);
		
		txtClassName = new JTextField();
		txtClassName.setEditable(false);
		txtClassName.setBounds(239, 10, 192, 26);
		contentPane.add(txtClassName);
		txtClassName.setColumns(10);
		
		JTextArea txtClassNotes = new JTextArea();
		txtClassNotes.setEditable(false);
		txtClassNotes.setBounds(16, 57, 250, 26);
		contentPane.add(txtClassNotes);
		
		JLabel lblStudentID = new JLabel("Student ID:");
		lblStudentID.setBounds(6, 94, 78, 16);
		contentPane.add(lblStudentID);
		
		JLabel lblStudents = new JLabel("Students:");
		lblStudents.setBounds(6, 123, 61, 16);
		contentPane.add(lblStudents);
		
		txtClassYear = new JTextField();
		txtClassYear.setEditable(false);
		txtClassYear.setBounds(294, 51, 130, 26);
		contentPane.add(txtClassYear);
		txtClassYear.setColumns(10);
	}

}
