import java.awt.EventQueue;
import javax.swing.JOptionPane;
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

	private JTextField txtAssignmentType;
	private JTextField txtAssignmentGrade;
	private JTextField txtAssingnmentWeight;
	private JTextField txtAssignmentName;
	private JTextField txtAssignmentID;
	private JTextField txtAssignmentDueDate;
	private JTextField txtAssignmentWeight;
	private JLabel lblAssignmentName;
	private JLabel lblAssignmentID;
	private JLabel lblAssignmentDueDate;
	private JLabel lblAssignmentType;
	private JLabel lblAssignmentGrade;
	private JLabel lblAssignmentWeight;
	private JLabel lblAssignmentNotes;
	private JTextArea txtAssignmentNotes;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnExit;

	private Assignment currentAssignment;
	private Student currentStudent;

	public assignmentGUI(Assignment currentAssignment, Student currentStudent) {
		this.currentAssignment = currentAssignment;
		this.currentStudent = currentStudent;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblAssignmentName = new JLabel("Assingment Name:");
		lblAssignmentName.setBounds(10, 11, 113, 14);
		contentPane.add(lblAssignmentName);

		txtAssignmentName = new JTextField();
		txtAssignmentName.setBounds(133, 8, 176, 20);
		contentPane.add(txtAssignmentName);
		txtAssignmentName.setColumns(10);

		lblAssignmentID = new JLabel("Assingment ID:");
		lblAssignmentID.setBounds(10, 36, 113, 14);
		contentPane.add(lblAssignmentID);

		txtAssignmentID = new JTextField();
		txtAssignmentID.setBounds(133, 33, 176, 20);
		contentPane.add(txtAssignmentID);
		txtAssignmentID.setColumns(10);

		lblAssignmentDueDate = new JLabel("Assignment Due Date:");
		lblAssignmentDueDate.setBounds(10, 61, 113, 14);
		contentPane.add(lblAssignmentDueDate);

		txtAssignmentDueDate = new JTextField();
		txtAssignmentDueDate.setBounds(133, 58, 176, 20);
		contentPane.add(txtAssignmentDueDate);
		txtAssignmentDueDate.setColumns(10);

		lblAssignmentType = new JLabel("Assignment Type:");
		lblAssignmentType.setBounds(10, 86, 113, 14);
		contentPane.add(lblAssignmentType);

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

		lblAssignmentWeight = new JLabel("Assignment Weight:");
		lblAssignmentWeight.setBounds(10, 136, 113, 14);
		contentPane.add(lblAssignmentWeight);

		txtAssignmentWeight = new JTextField();
		txtAssignmentWeight.setBounds(133, 133, 176, 20);
		contentPane.add(txtAssignmentWeight);
		txtAssignmentWeight.setColumns(10);

		lblAssignmentNotes = new JLabel("Assignment Notes:");
		lblAssignmentNotes.setBounds(10, 161, 113, 14);
		contentPane.add(lblAssignmentNotes);

		txtAssignmentNotes = new JTextArea();
		txtAssignmentNotes.setBounds(133, 164, 176, 59);
		contentPane.add(txtAssignmentNotes);

		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickSave();
			}
		});
		btnSave.setBounds(26, 227, 89, 23);
		contentPane.add(btnSave);

		btnDelete = new JButton("Delete Assingment");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickDelete();
			}
		});
		btnDelete.setBounds(143, 227, 136, 23);
		contentPane.add(btnDelete);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(335, 227, 89, 23);
		contentPane.add(btnExit);
		setAssignmentDetail();
	}
	public void setAssignmentDetail() {
		txtAssignmentName.setText(currentAssignment.getName());
		txtAssignmentID.setText(currentAssignment.getID());
		txtAssignmentDueDate.setText(currentAssignment.getdueDate());
		txtAssignmentType.setText(currentAssignment.getType());
		txtAssignmentGrade.setText(currentAssignment.getGrade());
		txtAssignmentWeight.setText(currentAssignment.getWeight());
	}

	public void btn_clickSave() {
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

		double grade;
		try {
			grade = Double.parseDouble(gradeText);
		} catch (NumberFormatException ex) {
			grade = -1;
		}

		if (grade < 0 || grade > 100) {
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

		double weight;
		try {
			String weightValue = weightText.substring(0, weightText.length() - 1);
			weight = Double.parseDouble(weightValue);
		} catch (NumberFormatException ex) {
			weight = -1;
		}
		if (weight < 0) {
			JOptionPane.showMessageDialog(contentPane, "Weight cannot be less than 0",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}


		// set assignment details if information is inputted correctly
		currentAssignment.setName(txtAssignmentName.getText());
		currentAssignment.setID(txtAssignmentID.getText());
		currentAssignment.setDueDate(txtAssignmentDueDate.getText());
		currentAssignment.setType(txtAssignmentType.getText());
		currentAssignment.setGrade(txtAssignmentGrade.getText());
		currentAssignment.setWeight(weightText);
		dispose();
	}
	public void btn_clickDelete() {
		currentStudent.deleteAssignment(currentAssignment);
		dispose();
	}

}
