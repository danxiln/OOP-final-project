import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class classroomGUIEditor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtClassName;
	private JTextField txtClassID;
	private JTextField txtClassYear;
	private JLabel lblClassName;
	private JLabel lblClassID;
	private JLabel lblClassYear;
	private JButton btnSave;
	private JButton btnDeleteClass;
	private JButton btnExit;
	private JLabel lblClassNotes;
	private JTextArea txtClassNotes;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public classroomGUIEditor(Classroom g,classroomGUI cgu) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblClassName = new JLabel("Class Name:");
		lblClassName.setBounds(10, 25, 94, 14);
		contentPane.add(lblClassName);
		
		lblClassID = new JLabel("Class ID:");
		lblClassID.setBounds(10, 63, 79, 14);
		contentPane.add(lblClassID);
		
		lblClassYear = new JLabel("Class Year:");
		lblClassYear.setBounds(10, 101, 79, 14);
		contentPane.add(lblClassYear);
		
		txtClassName = new JTextField();
		txtClassName.setBounds(94, 22, 131, 20);
		contentPane.add(txtClassName);
		txtClassName.setColumns(10);
		
		txtClassID = new JTextField();
		txtClassID.setBounds(94, 60, 131, 20);
		contentPane.add(txtClassID);
		txtClassID.setColumns(10);
		
		txtClassYear = new JTextField();
		txtClassYear.setBounds(94, 98, 131, 20);
		contentPane.add(txtClassYear);
		txtClassYear.setColumns(10);
		
		btnSave = new JButton("Save Edits");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.setClassID(txtClassID.getText());
				g.setClassName(txtClassName.getText());
				g.setClassYear(txtClassYear.getText());
				g.setClassNotes(txtClassNotes.getText());
				cgu.refreshStudents();
				cgu.refreshGradebook();
				dispose();
			}
		});
		btnSave.setBounds(38, 204, 89, 23);
		contentPane.add(btnSave);
		
		btnDeleteClass = new JButton("Delete Classroom");
		btnDeleteClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cgu.deleteClassroom();
				dispose();
				
			}
		});
		btnDeleteClass.setBounds(165, 204, 120, 23);
		contentPane.add(btnDeleteClass);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(306, 204, 89, 23);
		contentPane.add(btnExit);
		
		lblClassNotes = new JLabel("Class Notes:");
		lblClassNotes.setBounds(10, 136, 79, 14);
		contentPane.add(lblClassNotes);
		
		txtClassNotes = new JTextArea();
		txtClassNotes.setBounds(94, 131, 284, 62);
		contentPane.add(txtClassNotes);
		
		txtClassID.setText(g.getClassID());
		txtClassName.setText(g.getName());
		txtClassYear.setText(g.getYear());
		txtClassNotes.setText(g.getNotes());		
		
	}

}
