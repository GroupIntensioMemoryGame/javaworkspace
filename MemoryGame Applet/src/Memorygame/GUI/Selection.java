// Author         : Jason Purcell
// Student Number : J00379276
// Date Submitted : Apr 3, 2013
// file           : Selection.java
// Class          : 
// Identification : Selection.java
// Purpose        :
import javax.swing.*;
import java.awt.*;

/// checking to see if this update the repository

public class Selection extends JFrame
{
	
	// class variables
	JLabel sSays;
	JLabel userName;
	JLabel user;
	JButton play;
	JButton logout;
	// for panel 1
	JLabel gOptions;
	JLabel NObjects;
	JComboBox numObj;
	// for panel 2
	JLabel shapes;
	JCheckBox sqr;
	JCheckBox Tri;
	JCheckBox Cir;
	// for panel 3
	JLabel Colors;
	JCheckBox Red;
	JCheckBox Blue;
	JCheckBox green;
	JCheckBox purple;
	JCheckBox orange;
	JCheckBox yellow;
	// panel 4
	JLabel layout;
	JRadioButton grid;
	JRadioButton diamond;
	// panel 5
	JLabel ObSize;
	JComboBox size;
	
	
	
	public Selection()
	{
	
		// create layout for frame 
		setLayout (new FlowLayout(FlowLayout.CENTER,100,30));
		
		// *****Label panel*******
		JPanel lbl = new JPanel(new FlowLayout());
		lbl.setBackground(Color.WHITE);
		lbl.setSize(300,100);
		// for label screen 
		sSays = new JLabel("        Simon Says         ");
		userName = new JLabel("UserName: ");
		play = new JButton("Play!");
		logout = new JButton("Logout");
		gOptions = new JLabel("Game Options");
		//will insert user here
		user = new JLabel("user");
		sSays.setFont(new Font("SansSerif", Font.PLAIN, 30));
		// add label 
		lbl.add(sSays);
	
		// add to frame
		add(lbl);
		add(userName);
		add(user);
		add(play);
		play.setBackground(Color.orange);
		add(logout);
		logout.setBackground(Color.orange);
		add(gOptions);
		
		
		//******Panel 1 ******
		JPanel Opt = new JPanel(new FlowLayout());
		Opt.setBackground(Color.darkGray);
		// add to panel 1
		NObjects = new JLabel("Number Of Objects");
		// comboBox
		//NumObj = new JComboBox();
		
		
		
		
		//setLocationRelativeTo(null);
		
		setSize(400,800);
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}// end of constructor
	
	public static void main(String[] args)
	{
		new Selection();
		
		
	}// end of main method
	
	
}// end of class
