
package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimonSaysGame extends JApplet 
{
 //*****************login Menu***************************
	// **for login*** 
			private JButton Jbt, Jbt2, Jbt3;
			private JLabel sSays, entr, Hscr, JlName;
			private JTextField	Jtx;
			private JTextArea	JArea;
			
			//******for CreateUser Window********
			private JLabel jlName;
			private JTextField jtName;
			private JButton jbUser;
			public void init()
			{
				try
				{
					SimonSaysGame();
			
				}
				catch(Exception e)
				{
					System.err.println("Unable to start Game");
				}// end try/catch 
			}// end init
			
			
			private void SimonSaysGame()
			{
				//create frame for login
				
				final JPanel lg = new JPanel(new BorderLayout());
				JPanel labl = new JPanel(new FlowLayout());
				JPanel sel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 50));
				
				// ***create User Frame***
				final JFrame cUser = new JFrame();
				cUser.setTitle("Create User");
				cUser.setSize(400,200);
				JPanel cUser1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 20,50));
				cUser1.add(jlName = new JLabel("Enter New Username:"));
				cUser1.add(jtName= new JTextField(15));
				cUser1.add(jbUser = new JButton("Create"));
				cUser1.setBackground(Color.lightGray);
				jbUser.setBackground(Color.ORANGE);
				// add to JFrame 
				cUser.add(cUser1);
				
				
				//***Settings and panels for login frame***
				setSize(400,500);
				labl.setBackground(Color.white);
				sel.setBackground(Color.lightGray);
				
				// labels and buttons
				labl.add(sSays = new JLabel("Simon Says"),BorderLayout.PAGE_START);
						sSays.setFont(new Font("SansSerif",Font.PLAIN, 30));
				sel.add(entr = new JLabel("Please Enter Username to begin:"));
				sel.add(Jtx = new JTextField(15));
				sel.add(Jbt = new JButton("Login"));
				sel.add(Jbt2 = new JButton("Create New User"));
				sel.add(Hscr = new JLabel("High Scores"));
				sel.add(JArea = new JTextArea("                               <<Scores go in this JTextArea>>", 600,50),BorderLayout.PAGE_END);
				
				JArea.setBackground(Color.gray);
				Jbt.setBackground(Color.ORANGE);
				Jbt2.setBackground(Color.ORANGE);
				lg.add(labl,BorderLayout.PAGE_START);
				lg.add(sel,BorderLayout.CENTER);
				
				add(lg);
			
			
	//************************options Menu************************************************
			// **for options**
			final JLabel userName, user;
			final JButton play, logout;
			// for panel 1
			final JLabel gOptions, NObjects;
			final JComboBox numObj;
			// for panel 2
			final JLabel shapes;
			final JCheckBox Sqr, Tri, Cir;
			
			// for panel 3
			final  JLabel Colors;
			final JCheckBox Red, Blue, Green, Purple, Orange, Yellow;
			
			// panel 4
			final JLabel layout;
			final JRadioButton grid, diamond;
			// panel 5
			final JLabel ObSize;
			final JComboBox size;
					
				
			// create main frame 
			   final JPanel opt = new JPanel(new FlowLayout(FlowLayout.CENTER,100,50));
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
			   
			   //******************Action Listeners and events******************************
			
				//***** Login / create User menu's******
				//Create User action Event
				Jbt2.addActionListener(new ActionListener()
						{

							@Override
							public void actionPerformed(ActionEvent e)
							{
								cUser.setVisible(true);
				                
							}
					
						});
				
			   
				// Login Action event 
				Jbt.addActionListener(new ActionListener()
				{
				
					public void actionPerformed(ActionEvent e)
					{
						// adds user and goes to options menu
						add(opt);
						setSize(400,900);
						lg.setVisible(false);
						opt.setVisible(true);
						
					
						
					}
				});
				
				//********Options Menu***********
				logout.addActionListener(new ActionListener()
				{
				
					public void actionPerformed(ActionEvent e)
					{
						// returns to login screen
						add(lg);
						setSize(400,500);
						lg.setVisible(true);
						opt.setVisible(false);
					}

					
				});
					
			   
		}// end of GUI's 	
			
	
}// end class
