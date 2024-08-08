import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class AssignmentAdderGUI extends JFrame {
    	private JPanel contentPane;
    	private JTextField name;
    	private JTextField dueDate;
    	private JTextField type;
    	private JTextField grade;
    	private JTextField weight;
    	private JTextArea notes;
   	private JButton btnAddAssignment;
    	private JButton btnCancel;

    	private DataModel dataModel;
    	private Student student;

	public AssignmentAdderGUI(DataModel dm, Student student) {
		this.dataModel = dm;
		this.student = student;
		setTitle("Add Assignment");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Jlabels for inputting assignment information 
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10,10,80,25);
		contentPane.add(lblName);

		name = new JTextField();
		name.setBounds(100, 10, 300, 25);
		contentPane.add(name);
		name.setColumns(10);

		JLabel lblGrade = new JLabel("Grade:");
                lblGrade.setBounds(10,50, 80,25);
                contentPane.add(lblName);

                grade = new JTextField();
                grade.setBounds(100, 50, 300, 25);
                contentPane.add(grade);
                grade.setColumns(10);

		JLabel lbldueDate = new JLabel("Due date:");
                lbldueDate.setBounds(10,90,50,25);
                contentPane.add(lbldueDate);

                dueDate= new JTextField();
                dueDate.setBounds(100, 90, 300, 25);
                contentPane.add(dueDate);
                dueDate.setColumns(10);

		JLabel lblType = new JLabel("Type:");
                lblType.setBounds(10,130,80,25);
                contentPane.add(lblType);

                type = new JTextField();
                type.setBounds(100, 130, 300, 25);
                contentPane.add(type);
                type.setColumns(10);

                JLabel lblWeight = new JLabel("Weight:");
                lblWeight.setBounds(10,170, 80,25);
                contentPane.add(lblWeight);

                weight = new JTextField();
                weight.setBounds(100, 170, 300, 25);
                contentPane.add(weight);
                weight.setColumns(10);

                JLabel lblNotes = new JLabel("Notes:");
                lblNotes.setBounds(10,210,50,25);
                contentPane.add(lblNotes);

                notes = new JTextArea();
                notes.setBounds(100, 210, 300, 25);
                contentPane.add(notes);
                notes.setColumns(10);

		btnAddAssignment = new JButton("Add Assignment");
		btnAddAssignment.setBounds(100, 320, 150, 25);
		contentPane.add(btnAddAssignment);
		// add assignment button
		btnAddAssignment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addAssignmentItem();
			}
		});
		
		// introduce cancel button in case user does not want to add assignement
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(260, 320, 140, 25);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
	
	// method to add actual assignment item, not specifically to student but more so to system
	private void addAssignmentItem() {
		String assignment_name = name.getText();
		String assignment_dueDate = dueDate.getText();
		String assignment_type = type.getText();
		String assignment_grade = grade.getText();
		String assignment_weight = weight.getText();
		String assignment_notes = notes.getText();

		// use user inputted information to generate assingment item and then ADD to specific student
		Assignment newAssignment = new Assignment(assignment_name,
							  assignment_dueDate,
							  assignment_type,
							  assignment_grade,
							  assignment_weight,
							  assignment_notes);
		student.addAssignment(newAssignment);

		JOptionPane.showMessageDialog(this, "Assignment added!");
		dispose();
	}
}


		
