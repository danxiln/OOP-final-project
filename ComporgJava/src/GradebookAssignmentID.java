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

public class GradebookAssignmentID extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblAssingmentID;
	private JTextField txtName;
	private JTextField txtID;
	private JTextField txtDueDate;
	private JTextField txtType;
	private JTextField txtWeight;
	private JLabel lblAssingnmentDueDate;
	private JLabel lblType;
	private JLabel lblAssingmentName;
	private JLabel lblWeight;
	private JLabel lblStudents;
	private JTextArea txtStudents;
	
	
	private DataModel dm;
	private AssignmentModel am;
	private StudentModel sm;
	private String id;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	
	public GradebookAssignmentID(DataModel dm,AssignmentModel am,StudentModel sm, String id) {
		this.dm=dm;
		this.am=am;
		this.sm=sm;
		this.id=id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAssingmentName = new JLabel("Assingnment Name:");
		lblAssingmentName.setBounds(10, 11, 120, 14);
		contentPane.add(lblAssingmentName);
		
		lblAssingmentID = new JLabel("Assingnment ID:");
		lblAssingmentID.setBounds(10, 36, 120, 14);
		contentPane.add(lblAssingmentID);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setBounds(132, 8, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtID = new JTextField();
		txtID.setEditable(false);
		txtID.setBounds(132, 33, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		lblAssingnmentDueDate = new JLabel("Assignment Due Date:");
		lblAssingnmentDueDate.setBounds(10, 70, 132, 14);
		contentPane.add(lblAssingnmentDueDate);
		
		lblType = new JLabel("Assignment Type:");
		lblType.setBounds(10, 110, 120, 14);
		contentPane.add(lblType);
		
		lblWeight = new JLabel("Assignment Weight:");
		lblWeight.setBounds(10, 141, 120, 14);
		contentPane.add(lblWeight);
		
		lblStudents = new JLabel("Students:");
		lblStudents.setBounds(10, 182, 79, 14);
		contentPane.add(lblStudents);
		
		txtStudents = new JTextArea();
		txtStudents.setEditable(false);
		txtStudents.setBounds(82, 177, 187, 158);
		contentPane.add(txtStudents);
		
		txtDueDate = new JTextField();
		txtDueDate.setEditable(false);
		txtDueDate.setBounds(132, 67, 86, 20);
		contentPane.add(txtDueDate);
		txtDueDate.setColumns(10);
		
		txtType = new JTextField();
		txtType.setEditable(false);
		txtType.setBounds(132, 107, 86, 20);
		contentPane.add(txtType);
		txtType.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setEditable(false);
		txtWeight.setBounds(132, 138, 86, 20);
		contentPane.add(txtWeight);
		txtWeight.setColumns(10);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(325, 296, 89, 23);
		contentPane.add(btnExit);
		displayAssingmentDetails();
		displayStudentList();
	}
	public void displayAssingmentDetails() {
		Assignment base=am.baseAssignment(id);
		txtName.setText(base.getName());
		txtID.setText(id);
		txtWeight.setText(base.getWeight());
		txtType.setText(base.getType());
		txtDueDate.setText(base.getdueDate());
		txtStudents.setText(am.getAllStudentsByAssignment(id,sm));
	}
	public void displayStudentList() {
		txtStudents.setText(am.getAllStudentsByAssignment(id,sm));
	}


}
