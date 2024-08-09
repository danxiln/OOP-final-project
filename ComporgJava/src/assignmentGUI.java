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

public class assignmentGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAssingmentName;
	private JTextField txtAssingmentID;
	private JTextField txtAssingmentDueDate;
	private JTextField txtAssignmentType;
	private JTextField txtAssignmentGrade;
	private JTextField txtAssingmentWeight;
	private JLabel lblAssingmentName;
	private JLabel lblAssingmentID;
	private JLabel lblAssingmentDueDate;
	private JLabel lblAssingmentType;
	private JLabel lblAssignmentGrade;
	private JLabel lblAssingmentWeight;
	private JLabel lblAssingmentNotes;
	private JTextArea txtAssingmentNotes;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnExit;
	
	private Assignment a;
	private studentGUI sg;

	public assignmentGUI(Assignment a,studentGUI sg) {
		this.a=a;
		this.sg=sg;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAssingmentName = new JLabel("Assingment Name:");
		lblAssingmentName.setBounds(10, 11, 113, 14);
		contentPane.add(lblAssingmentName);
		
		txtAssingmentName = new JTextField();
		txtAssingmentName.setBounds(133, 8, 176, 20);
		contentPane.add(txtAssingmentName);
		txtAssingmentName.setColumns(10);
		
		lblAssingmentID = new JLabel("Assingment ID:");
		lblAssingmentID.setBounds(10, 36, 113, 14);
		contentPane.add(lblAssingmentID);
		
		txtAssingmentID = new JTextField();
		txtAssingmentID.setBounds(133, 33, 176, 20);
		contentPane.add(txtAssingmentID);
		txtAssingmentID.setColumns(10);
		
		lblAssingmentDueDate = new JLabel("Assingment Due Date:");
		lblAssingmentDueDate.setBounds(10, 61, 113, 14);
		contentPane.add(lblAssingmentDueDate);
		
		txtAssingmentDueDate = new JTextField();
		txtAssingmentDueDate.setBounds(133, 58, 176, 20);
		contentPane.add(txtAssingmentDueDate);
		txtAssingmentDueDate.setColumns(10);
		
		lblAssingmentType = new JLabel("Assingment Type:");
		lblAssingmentType.setBounds(10, 86, 113, 14);
		contentPane.add(lblAssingmentType);
		
		txtAssignmentType = new JTextField();
		txtAssignmentType.setBounds(133, 83, 176, 20);
		contentPane.add(txtAssignmentType);
		txtAssignmentType.setColumns(10);
		
		lblAssignmentGrade = new JLabel("Assignment Grade:");
		lblAssignmentGrade.setBounds(10, 111, 113, 14);
		contentPane.add(lblAssignmentGrade);
		
		txtAssignmentGrade = new JTextField();
		txtAssignmentGrade.setBounds(133, 108, 176, 20);
		contentPane.add(txtAssignmentGrade);
		txtAssignmentGrade.setColumns(10);
		
		lblAssingmentWeight = new JLabel("Assingment Weight:");
		lblAssingmentWeight.setBounds(10, 136, 113, 14);
		contentPane.add(lblAssingmentWeight);
		
		txtAssingmentWeight = new JTextField();
		txtAssingmentWeight.setBounds(133, 133, 176, 20);
		contentPane.add(txtAssingmentWeight);
		txtAssingmentWeight.setColumns(10);
		
		lblAssingmentNotes = new JLabel("Assingment Notes:");
		lblAssingmentNotes.setBounds(10, 161, 113, 14);
		contentPane.add(lblAssingmentNotes);
		
		txtAssingmentNotes = new JTextArea();
		txtAssingmentNotes.setBounds(133, 164, 176, 59);
		contentPane.add(txtAssingmentNotes);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setName(txtAssingmentName.getText());
				a.setID(txtAssingmentID.getText());
				a.setDueDate(txtAssingmentDueDate.getText());
				a.setType(txtAssignmentType.getText());
				a.setGrade(txtAssignmentGrade.getText());
				a.setWeight(txtAssingmentWeight.getText());
				sg.refreshGUI();
				dispose();
			}
		});
		btnSave.setBounds(26, 227, 89, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("Delete Assingment");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sg.deleteAssignment(a);
				dispose();
			}
		});
		btnDelete.setBounds(133, 234, 136, 23);
		contentPane.add(btnDelete);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(335, 227, 89, 23);
		contentPane.add(btnExit);
		txtAssingmentName.setText(a.getName());
		txtAssingmentID.setText(a.getID());
		txtAssingmentDueDate.setText(a.getdueDate());
		txtAssignmentType.setText(a.getType());
		txtAssignmentGrade.setText(a.getGrade());
		txtAssingmentWeight.setText(a.getWeight());
	}

}
