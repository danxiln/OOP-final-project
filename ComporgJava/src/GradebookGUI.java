import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JTextArea;
public class GradebookGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAcessInput;
	private JLabel lblClassrooms;
	private JButton btnAddClassroom;
	private JButton btnAcessClassroom;
	private JLabel lblClassroomID;
	private DataModel newdm;
	private JButton btnRefresh;
	private JTextArea txtClassroom;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public GradebookGUI(DataModel dm) {
		newdm=dm;
		if(Classroom.getClassAmount()!=0) {
			refreshClassrooms();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblClassrooms = new JLabel("Classrooms:");
		lblClassrooms.setBounds(21, 82, 111, 16);
		contentPane.add(lblClassrooms);
		
		btnAddClassroom = new JButton("Add Classroom");
		btnAddClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gradebook_AdderGUI gb =new Gradebook_AdderGUI(dm);
				gb.setVisible(true);
			}
		});
		btnAddClassroom.setBounds(260, 76, 150, 29);
		contentPane.add(btnAddClassroom);
		
		txtAcessInput = new JTextField();
		txtAcessInput.setEditable(false);
		txtAcessInput.setBounds(110, 6, 130, 26);
		contentPane.add(txtAcessInput);
		txtAcessInput.setColumns(10);
		
		btnAcessClassroom = new JButton("Access Classroom");
		btnAcessClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Classroom currentClassroom=dm.searchClass(txtAcessInput.getText());
				if(currentClassroom!=null) {
					classroomGUI cg=new classroomGUI(currentClassroom);
					cg.setVisible(true);
				}
			}
		});
		btnAcessClassroom.setBounds(260, 5, 150, 29);
		contentPane.add(btnAcessClassroom);
		
		lblClassroomID = new JLabel("Clasroom ID:");
		lblClassroomID.setBounds(6, 11, 102, 16);
		contentPane.add(lblClassroomID);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshClassrooms();
			}
		});
		btnRefresh.setBounds(98, 77, 117, 29);
		contentPane.add(btnRefresh);
		
		txtClassroom = new JTextArea();
		txtClassroom.setEditable(false);
		txtClassroom.setBounds(31, 110, 379, 156);
		contentPane.add(txtClassroom);
	}
	public void refreshClassrooms() {
		String x=newdm.StringOfAllClasses();
		txtClassroom.setText(x);
		}
}
