import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class My_frame extends JFrame implements ActionListener
{
	
	JLabel Name_student,Roll_no,Select_sem,Maths_marks,Java_marks,Physics_marks,SE_marks,ES_marks;
	JTextField name_stud,roll_no,java_marks,maths_marks,physics_marks,se_marks,es_marks;
	JComboBox sem;
	JButton submit;
	JTextArea output;
	
	My_frame()
	{
		setTitle("Mark Sheet Genration");
		setSize(700,400); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		Container c=getContentPane();
		c.setLayout(null);
		Name_student=new JLabel("Enter your name: ");
		Name_student.setBounds(30,50,100,20);
		c.add(Name_student);
		
		
		name_stud = new JTextField();
		name_stud.setBounds(180,50,100,20);
		c.add(name_stud);
		
		
		Roll_no =new JLabel("Enter your Roll number: ");
		Roll_no.setBounds(30,80,140,20);
		c.add(Roll_no);
		
		
		roll_no=new JTextField();
		roll_no.setBounds(180,80,100,20);
		c.add(roll_no);
		
		
		Select_sem=new JLabel("Select your Semester: ");
		Select_sem.setBounds(30,110,150,20);
		c.add(Select_sem);
		
		
		String semester[]={"Sem 1","Sem 2","Sem 3","Sem 4","Sem 5","Sem 6","Sem 7","Sem 8"};
		sem=new JComboBox(semester);
		sem.setBounds(180,110,100,20);
		c.add(sem);
		
		
		Maths_marks =new JLabel("Enter Maths Marks: ");
		Maths_marks.setBounds(30,140,140,20);
		c.add(Maths_marks);
		
		
		maths_marks=new JTextField();
		maths_marks.setBounds(180,140,100,20);
		c.add(maths_marks);
		
		
		Java_marks =new JLabel("Enter Java Marks: ");
		Java_marks.setBounds(30,170,140,20);
		c.add(Java_marks);
		
		
		java_marks=new JTextField();
		java_marks.setBounds(180,170,100,20);
		c.add(java_marks);
		
		
		Physics_marks=new JLabel("Enter Physics Marks: ");
		Physics_marks.setBounds(30,200,150,20);
		c.add(Physics_marks);
		
		
		physics_marks=new JTextField();
		physics_marks.setBounds(180,200,100,20);
		c.add(physics_marks);
		
		SE_marks=new JLabel("Enter SE Marks: ");
		SE_marks.setBounds(30,230,120,20);
		c.add(SE_marks);
		
		se_marks=new JTextField();
		se_marks.setBounds(180,230,100,20);
		c.add(se_marks);
		
		
		ES_marks=new JLabel("Enter ES Marks: ");
		ES_marks.setBounds(30,260,100,20);
		c.add(ES_marks);
		
		es_marks=new JTextField();
		es_marks.setBounds(180,260,100,20);
		c.add(es_marks);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(30,290,100,20);
		c.add(submit);
		submit.addActionListener(this);
		
		output=new JTextArea();
		output.setBounds(300,35,300,300);
		c.add(output);
		
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String Name=name_stud.getText();
		String roll=roll_no.getText();
		String maths1=maths_marks.getText();
		String java1=java_marks.getText();
		String phy1=physics_marks.getText();
		String se1=se_marks.getText();
		String es1=es_marks.getText();
		int maths=Integer.parseInt(maths1);
		int java=Integer.parseInt(java1);
		int phy=Integer.parseInt(phy1);
		int se=Integer.parseInt(se1);
		int es=Integer.parseInt(es1);
		int total=maths+java+phy+se+es;
		double per=total/5;
		output.setText("                                L.J      UNIVERSITY"+
	                   "\n\n NAME:                                          "+Name+
		               "\n\n ROLL NUMBER:                        "+roll+
		               "\n\n MATHS MARKS:                          "+maths+
		               "\n\n JAVA MARKS:                              "+java+
		               "\n\n PHYSICS MARKS:                      "+phy+
		               "\n\n SE MARKS:                                  "+se+
		               "\n\n ES MARKS:                                  "+es+
					   "\n\n TOTAL MARKS OUT OF 500:             "+total+
					   "\n PERCENTAGE:                                   "+per+" %");
		}
}
class ui_marksheet_gen
{
	public static void main(String args[])
	{
		My_frame frame=new My_frame();
	}
}