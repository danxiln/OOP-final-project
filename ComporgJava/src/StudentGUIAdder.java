import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentGUIAdder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAssignmentName;
	private JTextField txtAssignmentID;
	private JTextField txtAssingnmentDueDate;
	private JTextField txtAssignmentType;
	private JTextField txtAssignmentGrade;
	private JTextField txtAssignmentWeight;
	private JLabel lblAssignmentName;
	private JLabel lblAssignmentID;
	private JLabel lblAssignmentType;
	private JLabel lblAssingmentDueDate;
	private JLabel lblAssigmentGrade;
	private JButton btnSave;
	private JButton btnExit;
	private JLabel lblAssignmentWeight;
	private JLabel lblAssignmentNotes;
	private JTextArea txtAssignmentNotes;
	
	private Student s;
	private studentGUI sg;

	public StudentGUIAdder(Student s, studentGUI sg) {
		this.s=s;
		this.sg=sg;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAssignmentName = new JLabel("Assignment Name:");
		lblAssignmentName.setBounds(10, 11, 123, 14);
		contentPane.add(lblAssignmentName);
		
		txtAssignmentName = new JTextField();
		txtAssignmentName.setBounds(143, 8, 156, 20);
		contentPane.add(txtAssignmentName);
		txtAssignmentName.setColumns(10);
		
		lblAssignmentID = new JLabel("Assignment ID:");
		lblAssignmentID.setBounds(10, 36, 123, 14);
		contentPane.add(lblAssignmentID);
		
		txtAssignmentID = new JTextField();
		txtAssignmentID.setEditable(false);
		txtAssignmentID.setBounds(143, 33, 156, 20);
		contentPane.add(txtAssignmentID);
		txtAssignmentID.setColumns(10);
		
		txtAssingnmentDueDate = new JTextField();
		txtAssingnmentDueDate.setBounds(143, 58, 156, 20);
		contentPane.add(txtAssingnmentDueDate);
		txtAssingnmentDueDate.setColumns(10);
		
		lblAssingmentDueDate = new JLabel("Assignment Due Date:");
		lblAssingmentDueDate.setBounds(10, 61, 132, 14);
		contentPane.add(lblAssingmentDueDate);
		
		lblAssignmentType = new JLabel("Assingnment Type:");
		lblAssignmentType.setBounds(10, 86, 123, 14);
		contentPane.add(lblAssignmentType);
		
		txtAssignmentType = new JTextField();
		txtAssignmentType.setBounds(143, 83, 156, 20);
		contentPane.add(txtAssignmentType);
		txtAssignmentType.setColumns(10);
		
		lblAssigmentGrade = new JLabel("Assignment Grade");
		lblAssigmentGrade.setBounds(10, 111, 123, 14);
		contentPane.add(lblAssigmentGrade);
		
		txtAssignmentGrade = new JTextField();
		txtAssignmentGrade.setBounds(143, 108, 156, 20);
		contentPane.add(txtAssignmentGrade);
		txtAssignmentGrade.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtAssignmentName.getText();
				String dueDate = txtAssingnmentDueDate.getText();
				String type = txtAssignmentType.getText();
				String grade = txtAssignmentGrade.getText();
				String weight = txtAssignmentWeight.getText();
				String notes = txtAssignmentNotes.getText();
				Assignment current=new Assignment(name,dueDate,type,grade,weight,notes);
				s.addAssignment(current);
				sg.refreshGUI();
				dispose();
			}
		});
		btnSave.setBounds(33, 227, 89, 23);
		contentPane.add(btnSave);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(298, 227, 89, 23);
		contentPane.add(btnExit);
		
		lblAssignmentWeight = new JLabel("Assignment Weight:");
		lblAssignmentWeight.setBounds(10, 142, 123, 14);
		contentPane.add(lblAssignmentWeight);
		
		txtAssignmentWeight = new JTextField();
		txtAssignmentWeight.setBounds(143, 139, 156, 20);
		contentPane.add(txtAssignmentWeight);
		txtAssignmentWeight.setColumns(10);
		
		lblAssignmentNotes = new JLabel("Assignment Notes:");
		lblAssignmentNotes.setBounds(10, 189, 123, 14);
		contentPane.add(lblAssignmentNotes);
		
		txtAssignmentNotes = new JTextArea();
		txtAssignmentNotes.setBounds(153, 170, 266, 53);
		contentPane.add(txtAssignmentNotes);
		txtAssignmentID.setText(Integer.toString(Assignment.getIdCounter()));
		
	}
}
