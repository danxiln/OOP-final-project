import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GradebookGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtClassroom;
	private JTextField txtAcessInput;
	private JLabel lblClassrooms;
	private JButton btnAddClassroom;
	private JButton btnAcessClassroom;
	private JLabel lblClassroomID;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public GradebookGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtClassroom = new JTextField();
		txtClassroom.setBounds(21, 100, 389, 143);
		contentPane.add(txtClassroom);
		txtClassroom.setColumns(10);
		
		lblClassrooms = new JLabel("Classrooms:");
		lblClassrooms.setBounds(21, 82, 111, 16);
		contentPane.add(lblClassrooms);
		
		btnAddClassroom = new JButton("Add Classroom");
		btnAddClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gradebook_AdderGUI gb =new Gradebook_AdderGUI();
				gb.setVisible(true);
				
			}
		});
		btnAddClassroom.setBounds(260, 46, 150, 29);
		contentPane.add(btnAddClassroom);
		
		txtAcessInput = new JTextField();
		txtAcessInput.setBounds(110, 6, 130, 26);
		contentPane.add(txtAcessInput);
		txtAcessInput.setColumns(10);
		
		btnAcessClassroom = new JButton("Access Classroom");
		btnAcessClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classroomGUI cg=new classroomGUI();
				cg.setVisible(true);
			}
		});
		btnAcessClassroom.setBounds(260, 6, 150, 29);
		contentPane.add(btnAcessClassroom);
		
		lblClassroomID = new JLabel("Clasroom ID:");
		lblClassroomID.setBounds(6, 11, 102, 16);
		contentPane.add(lblClassroomID);
	}
}
