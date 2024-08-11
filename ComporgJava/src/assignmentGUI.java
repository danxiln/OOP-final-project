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
	private JTextField txtAssingnmentName;
	private JTextField txtAssingnmentID;
	private JTextField txtAssingnmentDueDate;
	private JTextField txtAssignmentType;
	private JTextField txtAssignmentGrade;
	private JTextField txtAssingnmentWeight;
	private JTextField txtAssignmentName;
	private JTextField txtAssignmentID;
	private JTextField txtAssignmentDueDate;
	private JTextField txtAssignmentWeight;
	private JLabel lblAssingmentName;
	private JLabel lblAssingmentID;
	private JLabel lblAssingmentDueDate;
	private JLabel lblAssingmentType;
	private JLabel lblAssignmentGrade;
	private JLabel lblAssingmentWeight;
	private JLabel lblAssingmentNotes;
	private JTextArea txtAssingnmentNotes;
	private JButton btnSave;
	private JButton btnDelete;
	private JButton btnExit;

	private Assignment newa;
	private studentGUI newsg;

	public assignmentGUI(Assignment a, studentGUI sg) {
		this.newa = a;
		this.newsg = sg;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblAssingmentName = new JLabel("Assingment Name:");
		lblAssingmentName.setBounds(10, 11, 113, 14);
		contentPane.add(lblAssingmentName);

		txtAssingnmentName = new JTextField();
		txtAssingnmentName.setBounds(133, 8, 176, 20);
		contentPane.add(txtAssingnmentName);
		txtAssingnmentName.setColumns(10);

		lblAssingmentID = new JLabel("Assingment ID:");
		lblAssingmentID.setBounds(10, 36, 113, 14);
		contentPane.add(lblAssingmentID);

		txtAssingnmentID = new JTextField();
		txtAssingnmentID.setBounds(133, 33, 176, 20);
		contentPane.add(txtAssingnmentID);
		txtAssingnmentID.setColumns(10);

		lblAssingmentDueDate = new JLabel("Assingment Due Date:");
		lblAssingmentDueDate.setBounds(10, 61, 113, 14);
		contentPane.add(lblAssingmentDueDate);

		txtAssingnmentDueDate = new JTextField();
		txtAssingnmentDueDate.setBounds(133, 58, 176, 20);
		contentPane.add(txtAssingnmentDueDate);
		txtAssingnmentDueDate.setColumns(10);

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

		txtAssingnmentWeight = new JTextField();
		txtAssingnmentWeight.setBounds(133, 133, 176, 20);
		contentPane.add(txtAssingnmentWeight);
		txtAssingnmentWeight.setColumns(10);

		lblAssingmentNotes = new JLabel("Assingment Notes:");
		lblAssingmentNotes.setBounds(10, 161, 113, 14);
		contentPane.add(lblAssingmentNotes);

		txtAssingnmentNotes = new JTextArea();
		txtAssingnmentNotes.setBounds(133, 164, 176, 59);
		contentPane.add(txtAssingnmentNotes);

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
				newsg.deleteAssignment(a);
				newsg.refreshGUI();
				dispose();
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
		txtAssingnmentName.setText(newa.getName());
		txtAssingnmentID.setText(newa.getID());
		txtAssingnmentDueDate.setText(newa.getdueDate());
		txtAssignmentType.setText(newa.getType());
		txtAssignmentGrade.setText(newa.getGrade());
		txtAssingnmentWeight.setText(newa.getWeight());
	}

	public void btn_clickSave() {
		String assignmentType = txtAssignmentType.getText();
		if (assignmentType.isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Assignment Type cannot be empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Check if assignment is one of 4 possible choices, listed in README.md
		if (!assignmentType.equals("Exam") && !assignmentType.equals("Project") &&
				!assignmentType.equals("Homework") && !assignmentType.equals("Quiz")) {
			JOptionPane.showMessageDialog(contentPane,
					"Invalid Assignment Type. Please enter one of the following: Exam, Project, Homework, Quiz.",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		// ensure that the grade is between 0 and 100, any other option is not accepted
		// by the system
		String gradeText = txtAssignmentGrade.getText();
		if (gradeText.isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Assignment Grade cannot be empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		try {
			double grade = Double.parseDouble(gradeText);
			if (grade < 0 || grade > 100) {
				JOptionPane.showMessageDialog(contentPane, "Assignment Grade must be between 0 and 100.",
						"Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(contentPane, "Assignment Grade must be a valid number.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		// ensure that weight is enteredd correctly (___X) format, 'x' must be there
		String weightText = txtAssignmentWeight.getText();
		if (weightText.isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Assignment Weight cannot be empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (!weightText.endsWith("x")) {
			JOptionPane.showMessageDialog(contentPane,
					"Weight must end in 'x' in ___x format, i.e. 10x, 20x, 30x.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// also include errors if the number in weight is not formatted or valid
		try {
			double weight = Double.parseDouble(weightText.substring(0, weightText.length() - 1));
			if (weight < 0) {
				JOptionPane.showMessageDialog(contentPane, "Weight cannot be less than 0.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(contentPane, "Weight must be a valid number.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// make sure that none of the other fields are empty
		if (txtAssignmentName.getText().isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Assignment Name cannot be empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (txtAssignmentID.getText().isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Assignment ID cannot be empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (txtAssignmentDueDate.getText().isEmpty()) {
			JOptionPane.showMessageDialog(contentPane, "Assignment Due Date cannot be empty.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// set assignment details if information is inputted correctly
		newa.setName(txtAssingnmentName.getText());
		newa.setID(txtAssingnmentID.getText());
		newa.setDueDate(txtAssingnmentDueDate.getText());
		newa.setType(txtAssignmentType.getText());
		newa.setGrade(txtAssignmentGrade.getText());
		newa.setWeight(txtAssingnmentWeight.getText());
		newsg.refreshGUI();
		dispose();
	}

}
