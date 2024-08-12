import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentGUI extends JFrame {

        private JPanel contentPane;
        private JTextField txtStudentID;
        private JTextField txtStudentName;
        private JTextField txtStudentGPA;
        private JTextField txtExamGrade;
        private JTextField txtProjectGrade;
        private JTextField txtQuizGrade;
        private JTextField txtHomeworkGrade;
        private JTextField txtID;
        private JLabel lblStudentID ;
        private JLabel lblStudentName;
        private JLabel lblStudentNotes;

        private JLabel lblStudentGPA;
        private JLabel lblExamGrade;
        private JLabel lblProjectGrade;
        private JLabel lblQuizGrade;
        private JLabel lblHomeworkGrade;

        private JTextArea txtStudentNotes;
        private JLabel lblAssignmentID;
        private JLabel lblAssignments;
        private JButton btnAddAssignment;
        private JButton btnEditStudent;
        private JButton btnAccessAssignment;
        private JTextArea txtAssignments;

        private Student currentStudent;
        private Classroom currentClassroom;
        private JButton btnExit;
        private JButton btnRefresh;

        /**
         * Launch the application.
         */
        /**
         * Create the frame.
         */
        public studentGUI(Student currentStudent,Classroom currentClassroom) {
                this.currentStudent=currentStudent;
                this.currentClassroom=currentClassroom;
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 722, 300);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                setContentPane(contentPane);
                contentPane.setLayout(null);

                lblStudentID = new JLabel("Student ID:");
                lblStudentID.setBounds(10, 11, 66, 14);
                contentPane.add(lblStudentID);

                txtStudentID = new JTextField();
                txtStudentID.setEditable(false);
                txtStudentID.setBounds(83, 8, 86, 20);
                contentPane.add(txtStudentID);
                txtStudentID.setColumns(10);

                lblStudentName = new JLabel("Student Name:");
                lblStudentName.setBounds(193, 11, 86, 14);
                contentPane.add(lblStudentName);

                txtStudentName = new JTextField();
                txtStudentName.setEditable(false);
                txtStudentName.setBounds(289, 8, 135, 20);
                contentPane.add(txtStudentName);
                txtStudentName.setColumns(10);

                lblStudentNotes = new JLabel("Student Notes:");
                lblStudentNotes.setBounds(0, 36, 98, 14);
                contentPane.add(lblStudentNotes);

                lblStudentGPA = new JLabel("Student GPA:");
                lblStudentGPA.setBounds(289, 39, 113, 14);
                contentPane.add(lblStudentGPA);

                txtStudentGPA = new JTextField();
                txtStudentGPA.setEditable(false);
                txtStudentGPA.setBounds(289, 55, 135, 20);
                contentPane.add(txtStudentGPA);
                txtStudentGPA.setColumns(10);

                lblExamGrade = new JLabel("Exam GPA:");
                lblExamGrade.setBounds(434, 93, 113, 14);
                contentPane.add(lblExamGrade);

                txtExamGrade = new JTextField();
                txtExamGrade.setEditable(false);
                txtExamGrade.setBounds(545, 90, 100, 20);
                contentPane.add(txtExamGrade);
                txtExamGrade.setColumns(10);

                lblProjectGrade = new JLabel("Project GPA:");
                lblProjectGrade.setBounds(434, 58, 113, 14);
                contentPane.add(lblProjectGrade);

                txtProjectGrade = new JTextField();
                txtProjectGrade.setEditable(false);
                txtProjectGrade.setBounds(545, 62, 100, 20);
                contentPane.add(txtProjectGrade);
                txtProjectGrade.setColumns(10);

                lblQuizGrade = new JLabel("Quiz GPA:");
                lblQuizGrade.setBounds(434, 36, 113, 14);
                contentPane.add(lblQuizGrade);

                txtQuizGrade = new JTextField();
                txtQuizGrade.setEditable(false);
                txtQuizGrade.setBounds(545, 33, 100, 20);
                contentPane.add(txtQuizGrade);
                txtQuizGrade.setColumns(10);

                lblHomeworkGrade = new JLabel("Homework GPA:");
                lblHomeworkGrade.setBounds(437, 11, 113, 14);
                contentPane.add(lblHomeworkGrade);

                txtHomeworkGrade = new JTextField();
                txtHomeworkGrade.setEditable(false);
                txtHomeworkGrade.setBounds(545, 8, 100, 20);
                contentPane.add(txtHomeworkGrade);
                txtHomeworkGrade.setColumns(10);

                txtStudentNotes = new JTextArea();
                txtStudentNotes.setEditable(false);
                txtStudentNotes.setBounds(83, 39, 190, 49);
                contentPane.add(txtStudentNotes);

                lblAssignmentID = new JLabel("Assignment ID:");
                lblAssignmentID.setBounds(10, 108, 86, 14);
                contentPane.add(lblAssignmentID);


                lblAssignments = new JLabel("Assignments:");
                lblAssignments.setBounds(10, 133, 88, 14);
                contentPane.add(lblAssignments);

                btnAddAssignment = new JButton("Add Assignment");
                btnAddAssignment.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                               btn_clickAdd();
			
                        }
                });

                btnAddAssignment.setBounds(103, 129, 150, 23);
                contentPane.add(btnAddAssignment);

                btnEditStudent = new JButton("Edit Student");
                btnEditStudent.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                btn_clickEditStudent();
                        }
                });
                btnEditStudent.setBounds(289, 129, 135, 23);
                contentPane.add(btnEditStudent);

                btnAccessAssignment = new JButton("Access Assignment");
                btnAccessAssignment.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	btn_clickViewSpecificAssignment();

                        }
                });
                btnAccessAssignment.setBounds(272, 104, 152, 23);
                contentPane.add(btnAccessAssignment);

                txtAssignments = new JTextArea();
                txtAssignments.setBounds(10, 158, 414, 92);
                contentPane.add(txtAssignments);
                
                btnExit = new JButton("Exit");
                btnExit.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		dispose();
                		
                	}
                });
                btnExit.setBounds(449, 215, 89, 23);
                contentPane.add(btnExit);
                
                txtID = new JTextField();
                txtID.setBounds(93, 105, 160, 20);
                contentPane.add(txtID);
                txtID.setColumns(10);
                
                btnRefresh = new JButton("Refresh");
                btnRefresh.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		btn_clickRefreshGUI();
                	}
                });
                btnRefresh.setBounds(449, 178, 89, 23);
                contentPane.add(btnRefresh);
                btn_clickRefreshGUI();
        }
        public void btn_clickRefreshGUI() {
        	setStudentDetail();
                if(currentStudent!=null) {
                	setAssignmentList();
                }
        }
        public void setStudentDetail () {
            txtStudentID.setText(currentStudent.getstudentID());
            txtStudentName.setText(currentStudent.getName());
            txtStudentGPA.setText(currentStudent.getGrade());
            txtStudentNotes.setText(currentStudent.getNotes());
        }
        public void setAssignmentList () {
        	 String x=currentStudent.StringOfAllAssigments();
             txtAssignments.setText(x);
             txtStudentGPA.setText(String.format("%.2f", currentStudent.calcGrade()));
             txtExamGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Exam")));
             txtProjectGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Project")));
             txtQuizGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Quiz")));
             txtHomeworkGrade.setText(String.format("%.2f",currentStudent.calcGradeByType("Homework")));
        }
        public void btn_clickViewSpecificAssignment() {
        	String id=txtID.getText();
            Assignment currentAssignment = currentStudent.selectAssignment(id);
            if(currentAssignment!=null) {
                    assignmentGUI ag=new assignmentGUI(currentAssignment,currentStudent);
                    ag.setVisible(true);
                    
            }
            // error message to display when assignment with ID was not found
            else {
                    JOptionPane.showMessageDialog(contentPane, "Assignment with ID " +
                    		txtID.getText() + " not found.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        	
        }
        public void btn_clickAdd() {
        	 StudentGUIAdder sga=new StudentGUIAdder(currentStudent);
             sga.setVisible(true);

             // calculate grade after entering assignments
             currentStudent.calcGrade();
             txtStudentGPA.setText(currentStudent.getGrade());
             txtExamGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Exam")));
             txtProjectGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Project")));
             txtQuizGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Quiz")));
             txtHomeworkGrade.setText(String.format("%.2f", currentStudent.calcGradeByType("Homework")));
        }
        public void btn_clickEditStudent() {
        	studentGUIEditor sge=new studentGUIEditor(currentStudent,currentClassroom);
            sge.setVisible(true);
        }
}



