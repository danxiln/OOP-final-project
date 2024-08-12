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

public class ClassroomStudentsGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel Students;
	private JTextArea txtStudents;
	private DataModel dm;
	private JLabel lblAcessStudent;
	private JTextField txtID;
	private JButton btnSearch;
	private JButton btnExit;
	private JButton btnSort;
	private JLabel lblSortName;
	private JTextField txtName;
	private JButton btnRefresh;
	
	
	public ClassroomStudentsGUI(DataModel dm) {
		this.dm=dm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Students = new JLabel("Students:");
		Students.setBounds(10, 86, 91, 14);
		contentPane.add(Students);
		
		txtStudents = new JTextArea();
		txtStudents.setBounds(20, 111, 377, 111);
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
				btn_clickSearch();
			}
		});
		btnSearch.setBounds(249, 7, 89, 23);
		contentPane.add(btnSearch);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(297, 233, 89, 23);
		contentPane.add(btnExit);
		
		btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtStudents.setText(dm.StringOfAllStudentsByName(txtName.getText()));
				
			}
		});
		btnSort.setBounds(249, 51, 89, 23);
		contentPane.add(btnSort);
		
		lblSortName = new JLabel("Sort By Name:");
		lblSortName.setBounds(10, 55, 112, 14);
		contentPane.add(lblSortName);
		
		txtName = new JTextField();
		txtName.setBounds(139, 52, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		btnRefresh = new JButton("refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickrefreshStudents();
			}
		});
		btnRefresh.setBounds(68, 82, 89, 23);
		contentPane.add(btnRefresh);
		
	}
	private void btn_clickrefreshStudents() {
		txtStudents.setText(dm.StringOfAllStudents());
	}
	public void btn_clickSearch() {
		ClassroomStudentIDGUI CSGUI=new ClassroomStudentIDGUI(dm,txtID.getText());
		CSGUI.setVisible(true);
	}

}
