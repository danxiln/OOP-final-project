import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ClassroomStudents extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Students;
	private JTextArea txtStudents;
	private DataModel newdm;
	
	
	public ClassroomStudents(DataModel dm) {
		this.newdm=dm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Students = new JLabel("Students:");
		Students.setBounds(10, 94, 91, 14);
		contentPane.add(Students);
		
		txtStudents = new JTextArea();
		txtStudents.setBounds(20, 113, 377, 124);
		contentPane.add(txtStudents);
		
		refreshStudents();
		
	}
	private void refreshStudents() {
		txtStudents.setText(newdm.StringOfAllStudents());
	}

}
