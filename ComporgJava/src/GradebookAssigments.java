import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradebookAssigments extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblAssigments;
	private JTextArea txtAssignments;
	private JButton btnExit;
	DataModel newdm;
	public GradebookAssigments(DataModel dm) {
		newdm=dm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAssigments = new JLabel("Assignments");
		lblAssigments.setBounds(10, 61, 93, 14);
		contentPane.add(lblAssigments);
		
		txtAssignments = new JTextArea();
		txtAssignments.setBounds(10, 86, 383, 136);
		contentPane.add(txtAssignments);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(304, 227, 89, 23);
		contentPane.add(btnExit);
		refreshAssignments();
	}
	public void refreshAssignments() {
		txtAssignments.setText(newdm.StringOfAllAssignments());
	}
}
