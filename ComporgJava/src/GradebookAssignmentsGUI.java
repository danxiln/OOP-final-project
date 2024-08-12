import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class GradebookAssignmentsGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblAssignments;
	private JTextArea txtAssignments;
	private JButton btnExit;
	private JLabel lblAssingnmentID;
	private JTextField txtID;
	private JButton btnSearch;
	private JButton btnRefresh;
	private DataModel dm;
	private AssignmentModel am;
	private StudentModel sm;
	public GradebookAssignmentsGUI(DataModel dm,AssignmentModel am,StudentModel sm) {
		this.dm=dm;
		this.am=am;
		this.sm=sm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAssignments = new JLabel("Assignments");
		lblAssignments.setBounds(10, 103, 93, 14);
		contentPane.add(lblAssignments);
		
		txtAssignments = new JTextArea();
		txtAssignments.setBounds(10, 128, 383, 94);
		contentPane.add(txtAssignments);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(304, 227, 89, 23);
		contentPane.add(btnExit);
		
		lblAssingnmentID = new JLabel("Assingnment ID:");
		lblAssingnmentID.setBounds(10, 11, 103, 14);
		contentPane.add(lblAssingnmentID);
		
		txtID = new JTextField();
		txtID.setBounds(119, 8, 103, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickSearch();
			}
		});
		btnSearch.setBounds(261, 7, 89, 23);
		contentPane.add(btnSearch);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickRefreshAssignments();

			}
		});
		btnRefresh.setBounds(88, 99, 89, 23);
		contentPane.add(btnRefresh);
	}
	public void btn_clickRefreshAssignments() {
		am.sortSet(dm, sm);
		txtAssignments.setText(am.StringOfAllAssignments());
	}
	public void btn_clickSearch() {
		am.sortSet(dm, sm);
		GradebookAssignmentIDGUI gai=new GradebookAssignmentIDGUI(dm,am,sm,txtID.getText());
		gai.setVisible(true);
	}
}
