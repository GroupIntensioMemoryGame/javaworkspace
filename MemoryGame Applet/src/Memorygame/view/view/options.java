package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class options extends JApplet
{
	// **for options**
		
		private JLabel sSays, userName, user;
		private JButton play, logout;
		// for panel 1
		private JLabel gOptions, NObjects;
		private JComboBox numObj;
		// for panel 2
		private JLabel shapes;
		private JCheckBox Sqr, Tri, Cir;
		
		// for panel 3
		private JLabel Colors;
		private JCheckBox Red, Blue, Green, Purple, Orange, Yellow;
		
		// panel 4
		private JLabel layout;
		private JRadioButton grid, diamond;
		// panel 5
		private JLabel ObSize;
		private JComboBox size;
		
		public void init()
		{
			setSize(400,900);
			
			setVisible(true);
			
		}
		
	
		
		public options()
		{
			
			
		// create main frame 
		  JPanel opt = new JPanel(new FlowLayout(FlowLayout.CENTER,100,50));
		  JPanel label = new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
		  JPanel sp = new JPanel(new GridLayout(3,2));
		  JPanel col = new JPanel(new GridLayout(3,2));
		  JPanel lay = new JPanel(new GridLayout(2,2));
		  
		  // create option frames 
		  
		  label.add(sSays = new JLabel(" Simon Says"));
		  sSays.setFont(new Font("SansSerif",Font.PLAIN, 30));
		  label.setBackground(Color.white);
		  gOptions = new JLabel("Game Options");
		  gOptions.setFont(new Font( "SansSerif",Font.PLAIN, 20));
		   
		    
		   opt.add(label);
		   opt.add(userName = new JLabel("UserName: "));
		   opt.add(user = new JLabel("<<user>>"));
		   opt.add(logout = new JButton("Logout"));
		   logout.setBackground(Color.orange);
		   opt.add(play = new JButton("Play! "));
		   play.setBackground(Color.orange);
		   opt.add(gOptions);
		   // panel 2
		   opt.add(NObjects = new JLabel("Number of Objects: "));
		   opt.add(numObj = new JComboBox(new Object[]
				   {"1", "2","3","4","5"}));
		   // add to main jpanel 
		  
		   // panel 3
		   opt.add(shapes = new JLabel ("Shapes"));
		   sp.add(Sqr = new JCheckBox("Sqaure"));
		   sp.add(Tri = new JCheckBox("Triangle"));
		   sp.add(Cir = new JCheckBox("Circle"));
		   // add check boxes to panel
		   opt.add(sp);
		   
		   //Panel 4
		   opt.add(Colors = new JLabel("Colors"));
		   col.add(Red = new JCheckBox("Red"));
		   col.add(Blue = new JCheckBox("Blue"));
		   col.add(Green = new JCheckBox("Green"));
		   col.add(Purple = new JCheckBox("Purple"));
		   col.add(Orange = new JCheckBox("Orange"));
		   col.add(Yellow = new JCheckBox("Yellow"));
		   // add to panel
		   opt.add(col);
		   
		   // Panel 5
		   opt.add(layout = new JLabel("Layout"));
		   lay.add(grid = new JRadioButton("Grid"));
		   lay.add(diamond = new JRadioButton("Diamond"));
		   //add to panel
		   opt.add(lay);
		   
		   //object size
		   opt.add(ObSize = new JLabel("Object Size: "));
		   opt.add(size = new JComboBox( new Object[]
		   {"small", "Medium", "Large"}));
		 
		   
		   opt.setBackground(Color.lightGray);
		   
		   add(opt);
		  
			
		}
	
}// end of class
