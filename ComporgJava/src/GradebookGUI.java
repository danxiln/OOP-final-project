import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class GradebookGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAcessInput;
	private JLabel lblClassrooms;
	private JButton btnAddClassroom;
	private JButton btnAcessClassroom;
	private JLabel lblClassroomID;
	private DataModel dm;
	private JTextArea txtClassroom;
	private JButton btnViewAllAssignments;
	private JButton btnViewStudents;
	private JButton btnRefresh;
	private AssignmentModel am;
	private StudentModel sm;
	private JScrollPane scrollPane;
	
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public GradebookGUI(DataModel dm,AssignmentModel am,StudentModel sm) {
		this.dm=dm;
		this.am=am;
		this.sm=sm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 300);
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
				btn_clickAddClassroom();
			}
		});
		btnAddClassroom.setBounds(260, 76, 150, 29);
		contentPane.add(btnAddClassroom);
		
		txtAcessInput = new JTextField();
		txtAcessInput.setBounds(110, 6, 130, 26);
		contentPane.add(txtAcessInput);
		txtAcessInput.setColumns(10);
		
		btnAcessClassroom = new JButton("Access Classroom");
		btnAcessClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickAccessClassroom();
			}
		});
		btnAcessClassroom.setBounds(260, 5, 150, 29);
		contentPane.add(btnAcessClassroom);
		
		lblClassroomID = new JLabel("Clasroom ID:");
		lblClassroomID.setBounds(6, 11, 102, 16);
		contentPane.add(lblClassroomID);
		
		txtClassroom = new JTextArea();
		txtClassroom.setEditable(false);
		txtClassroom.setBounds(31, 109, 379, 100);
		txtClassroom.setFont(new Font("Monospaced", Font.PLAIN, 12));
		JScrollPane scrollPane = new JScrollPane(txtClassroom);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBounds(31,109,379,100);
                contentPane.add(scrollPane);

		// contentPane.add(txtClassroom);
		
		
		btnViewAllAssignments = new JButton("View Assignments");
		btnViewAllAssignments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickViewAssignments();
			}
		});
		btnViewAllAssignments.setBounds(28, 220, 161, 23);
		contentPane.add(btnViewAllAssignments);
		
		btnViewStudents = new JButton("View Students");
		btnViewStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickViewStudents();
			}
		});
		btnViewStudents.setBounds(247, 220, 150, 23);
		contentPane.add(btnViewStudents);
		
		btnRefresh = new JButton("refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_refreshClassrooms();
			}
		});
		btnRefresh.setBounds(100, 79, 89, 23);
		contentPane.add(btnRefresh);
		
		
		
		
	}
	public void btn_refreshClassrooms() {
		if(dm!=null) {
			String x=dm.StringOfAllClasses();
			txtClassroom.setText(x);
		}
		}
	private void btn_clickAccessClassroom() {
		Classroom currentClassroom = dm.selectClass(txtAcessInput.getText());
		if(currentClassroom!=null) {
			classroomGUI cg=new classroomGUI(dm,currentClassroom);
			cg.setVisible(true);
		}
		// error message to display when classroom with ID was not found
		else {
			JOptionPane.showMessageDialog(contentPane, "Classroom with ID " + 
			txtAcessInput.getText() + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

		}
	}
	public void btn_clickAddClassroom() {
		Gradebook_AdderGUI gb =new Gradebook_AdderGUI(dm);
		gb.setVisible(true);
	}
	public void btn_clickViewStudents() {
		ClassroomStudentsGUI cs=new ClassroomStudentsGUI(dm,sm);
		cs.setVisible(true);
	}
	public void btn_clickViewAssignments() {
		GradebookAssignmentsGUI ga=new GradebookAssignmentsGUI(dm,am,sm);
		ga.setVisible(true);
	}
}
