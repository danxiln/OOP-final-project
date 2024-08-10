import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClassroomStudents extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Students;
	private JTextArea txtStudents;
	private DataModel newdm;
	private JLabel lblAcessStudent;
	private JTextField txtID;
	private JButton btnSearch;
	
	
	public ClassroomStudents(DataModel dm) {
		this.newdm=dm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Students = new JLabel("Students:");
		Students.setBounds(10, 114, 91, 14);
		contentPane.add(Students);
		
		txtStudents = new JTextArea();
		txtStudents.setBounds(10, 139, 377, 111);
		contentPane.add(txtStudents);
		
		lblAcessStudent = new JLabel("Access Student by ID:");
		lblAcessStudent.setBounds(10, 11, 126, 14);
		contentPane.add(lblAcessStudent);
		
		txtID = new JTextField();
		txtID.setBounds(139, 8, 86, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSearch.setBounds(249, 7, 89, 23);
		contentPane.add(btnSearch);
		
		refreshStudents();
		
	}
	private void refreshStudents() {
		txtStudents.setText(newdm.StringOfAllStudents());
	}

}
