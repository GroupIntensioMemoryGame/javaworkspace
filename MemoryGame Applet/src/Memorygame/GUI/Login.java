// Author         : Jason Purcell
// Student Number : J00379276
// Date Submitted : Mar 21, 2013
// file           : Login.java
// Class          :
// Identification : Login.java
// Purpose        :
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// test to from eclipse


public class Login extends JFrame
{
	// class variables
	JButton Jbt;
	JButton Jbt2;
	JButton Jbt3;
	JLabel sSays;
	JLabel entr;
	JLabel Hscr;
	JTextField	Jtx;
	
	public Login()
	{
		
		// set size of layout
		setLayout(new BorderLayout());

		// labels and buttons
		sSays = new JLabel("Simon Says");
		sSays.setFont(new Font("SansSerif",Font.PLAIN, 30));
		entr = new JLabel("Please Enter Username to begin:");
		Jtx = new JTextField(15);
		Jbt = new JButton("Login");
		Jbt2 = new JButton("Create New User");
		Hscr = new JLabel("High Scores");
		
		// set panels
		JPanel labl = new JPanel(new FlowLayout());
	
		JPanel sel	= new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 50));
		
		// set panel colors
		labl.setBackground(Color.WHITE);
		sel.setBackground(Color.lightGray);
		
			
		// add lable to labl panel
		labl.add(sSays);

		
		// add to sel Panel 
		sel.add(entr);
		sel.add(Jtx);
		sel.add(Jbt);
		Jbt.setBackground(Color.orange);
		sel.add(Jbt2);
		Jbt2.setBackground(Color.orange);
		sel.add(Hscr);
		
		//sel.setBorder(border);
		
		// add panels to frame 
		add(labl,BorderLayout.NORTH);
		
		add(sel,BorderLayout.CENTER);

		setLocationRelativeTo(null);
		// set size
		setSize(400,500);
		// set frame default on close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// set frame to visible
		setVisible(true);
		
	}// end constructor

	public static void main(String[] args)
	{
		new Login();
	}// end of main 

}// end of class
