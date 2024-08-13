import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StudentGUIAdder extends JFrame {

	private JPanel contentPane;
	private JTextField txtAssignmentName;
	private JTextField txtAssignmentID;
	private JTextField txtAssignmentDueDate;
	private JTextField txtAssignmentType;
	private JTextField txtAssignmentGrade;
	private JTextField txtAssignmentWeight;
	private JLabel lblAssignmentName;
	private JLabel lblAssignmentID;
	private JLabel lblAssignmentType;
	private JLabel lblAssignmentDueDate;
	private JLabel lblAssignmentGrade;
	private JButton btnSave;
	private JButton btnExit;
	private JLabel lblAssignmentWeight;
	private JLabel lblAssignmentNotes;
	private JTextArea txtAssignmentNotes;
	private JScrollPane scrollPane;

	private Student currentStudent;

	public StudentGUIAdder(Student currentStudent) {
		this.currentStudent = currentStudent;
		
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
		txtAssignmentID.setBounds(143, 33, 156, 20);
		contentPane.add(txtAssignmentID);
		txtAssignmentID.setColumns(10);
		
		txtAssignmentDueDate = new JTextField();
		txtAssignmentDueDate.setBounds(143, 58, 156, 20);
		contentPane.add(txtAssignmentDueDate);
		txtAssignmentDueDate.setColumns(10);
		
		lblAssignmentDueDate = new JLabel("Assignment Due Date:");
		lblAssignmentDueDate.setBounds(10, 61, 132, 14);
		contentPane.add(lblAssignmentDueDate);
		
		lblAssignmentType = new JLabel("Assingnment Type:");
		lblAssignmentType.setBounds(10, 86, 123, 14);
		contentPane.add(lblAssignmentType);
		
		txtAssignmentType = new JTextField();
		txtAssignmentType.setBounds(143, 83, 156, 20);
		contentPane.add(txtAssignmentType);
		txtAssignmentType.setColumns(10);
		
		lblAssignmentGrade = new JLabel("Assignment Grade");
		lblAssignmentGrade.setBounds(10, 111, 123, 14);
		contentPane.add(lblAssignmentGrade);
		
		txtAssignmentGrade = new JTextField();
		txtAssignmentGrade.setBounds(143, 108, 156, 20);
		contentPane.add(txtAssignmentGrade);
		txtAssignmentGrade.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAssignmentDetail();
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
		scrollPane = new JScrollPane(txtAssignmentNotes);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBounds(153,170,266,53);
                contentPane.add(scrollPane);	
		
		contentPane.add(txtAssignmentNotes);
		
		
		
	}
	public void setAssignmentDetail() {
		if (txtAssignmentName.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(contentPane, "Assignment Name cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
    	return;
	}

	if (txtAssignmentID.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(contentPane, "Assignment ID cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
    		return;
	}

	if (txtAssignmentDueDate.getText().isEmpty()) {
    		JOptionPane.showMessageDialog(contentPane, "Assignment Due Date cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
    		return;
	}


	String assignmentType = txtAssignmentType.getText();
	if (assignmentType.isEmpty()) {
    		JOptionPane.showMessageDialog(contentPane, "Assignment Type cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
    		return;
	}

	// check that it follows the instructoins as written in the README.
	// only "Exam", "Homework", "Project", "Quiz" are valid
	if (!assignmentType.equals("Exam") && !assignmentType.equals("Project") &&
		    !assignmentType.equals("Homework") && !assignmentType.equals("Quiz")) {
    		JOptionPane.showMessageDialog(contentPane, "Invalid Assignment Type. Please enter one of the following: Exam, Project, Homework, Quiz."
                    , "Error", JOptionPane.ERROR_MESSAGE);
    		return;
	}

	// grade must be a double value between 0 and 100
	String gradeText = txtAssignmentGrade.getText();
	if (gradeText.isEmpty()) {
    		JOptionPane.showMessageDialog(contentPane, "Assignment Grade cannot be empty.");
    		return;
	}

	double grade_valid;
	try {
    		grade_valid = Double.parseDouble(gradeText);
	} catch (NumberFormatException ex) {
    		grade_valid = -1;
	}

	if (grade_valid < 0 || grade_valid > 100) {
    		JOptionPane.showMessageDialog(contentPane, "Assignment Grade must be between 0 and 100",
            	                "Error", JOptionPane.ERROR_MESSAGE);
   			return;
	}

	 	// weight must be the corret format (___x i.e. 10x, 100x)
	String weightText = txtAssignmentWeight.getText();
	if (!weightText.endsWith("x") || weightText.isEmpty()) {
    		JOptionPane.showMessageDialog(contentPane, "Weight must end in 'x' in the format '__x' such as 10x for example",
                    		"Error", JOptionPane.ERROR_MESSAGE);
    		return;
	}

	double weight_valid;
	try {
    		String weightValue = weightText.substring(0, weightText.length() - 1);
    		weight_valid = Double.parseDouble(weightValue);
	} catch (NumberFormatException ex) {
    		weight_valid = -1;
		}
	if (weight_valid < 0) {
   	 		JOptionPane.showMessageDialog(contentPane, "Weight cannot be less than 0",
    	                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


String name = txtAssignmentName.getText();
String dueDate = txtAssignmentDueDate.getText();
String type = txtAssignmentType.getText();
String grade = txtAssignmentGrade.getText();
String weight = txtAssignmentWeight.getText();
String notes = txtAssignmentNotes.getText();
String id=txtAssignmentID.getText();
Assignment current=new Assignment(name,dueDate,type,grade,weight,notes,id);
currentStudent.addAssignment(current);
dispose();
	}
	public void btn_clickSave() {
		String name = txtAssignmentName.getText();
		String dueDate = txtAssignmentDueDate.getText();
		String type = txtAssignmentType.getText();
		String grade = txtAssignmentGrade.getText();
		String weight = txtAssignmentWeight.getText();
		String notes = txtAssignmentNotes.getText();
		String id=txtAssignmentID.getText();
		Assignment current=new Assignment(name,dueDate,type,grade,weight,notes,id);
		currentStudent.addAssignment(current);
		dispose();
	}
}
