import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Gradebook_AdderGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtClassName;
	private JTextField txtYear;
	private JTextField txtClassID;
	private JTextArea txtClassNotes;
	private JLabel lblClassID;
	private JLabel lblClassNotes;
	private JLabel lblYear;
	private JLabel lblClassName;
	private JButton btnAddClassroom ;
	private JButton btnExit;
	private DataModel dm;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Gradebook_AdderGUI(DataModel dm) {
		this.dm=dm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblClassName = new JLabel("Class Name:");
		lblClassName.setBounds(33, 20, 95, 16);
		contentPane.add(lblClassName);
		
		btnAddClassroom = new JButton("Add ");
		btnAddClassroom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_clickSave();
			}
		});
		btnAddClassroom.setBounds(64, 219, 117, 29);
		contentPane.add(btnAddClassroom);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(260, 219, 117, 29);
		contentPane.add(btnExit);
		
		lblYear = new JLabel("Year:");
		lblYear.setBounds(32, 58, 61, 16);
		contentPane.add(lblYear);
		
		txtClassName = new JTextField();
		txtClassName.setBounds(140, 15, 130, 26);
		contentPane.add(txtClassName);
		txtClassName.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setBounds(140, 53, 130, 26);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		lblClassNotes = new JLabel("Class Notes:");
		lblClassNotes.setBounds(33, 128, 95, 16);
		contentPane.add(lblClassNotes);
		
		lblClassID = new JLabel("Class ID:");
		lblClassID.setBounds(33, 96, 61, 16);
		contentPane.add(lblClassID);
		
		txtClassID = new JTextField();
		txtClassID.setBounds(140, 85, 130, 26);
		contentPane.add(txtClassID);
		txtClassID.setColumns(10);
		
		txtClassNotes = new JTextArea();
		txtClassNotes.setBounds(105, 124, 257, 90);
		scrollPane = new JScrollPane(txtClassNotes);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBounds(105,124, 257, 90);
                contentPane.add(scrollPane);
		
		//contentPane.add(txtClassNotes);
	}
	public void btn_clickSave() {
		String id=txtClassID.getText();
		String name=txtClassName.getText();
		String year=txtYear.getText();
		String notes=txtClassNotes.getText();
		Classroom newClass =new Classroom(id,name,year,notes);
		dm.addClass(newClass);	
		dispose();
	}
}
