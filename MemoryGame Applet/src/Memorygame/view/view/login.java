package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class login extends JApplet
{
	// **for login*** 
		private JButton Jbt, Jbt2, Jbt3;
		private JLabel sSays, entr, Hscr, JlName;
		private JTextField	Jtx;
		private JTextArea	JArea;
		//**for CreateUser
		private JLabel jlName;
		private JTextField jtName;
		private JButton jbUser;
		public void init()
		{
			try
			{
				login();
		
				/*SwingUtilities.invokeAndWait(new Runnable()
				{
					public void run()
					{
						login();
					}
				});*/
			}
			catch(Exception e)
			{
				System.err.println("Unable to start Game");
			}// end try/catch 
		}// end init
		
		
		private void login()
		{
			//create frame for login
			JPanel lg = new JPanel(new BorderLayout());
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
			
			//***Action Listeners for buttons******
			Jbt2.addActionListener(new ActionListener()
					{

						@Override
						public void actionPerformed(ActionEvent e)
						{
							cUser.setVisible(true);
						}
				
					});
			Jbt.addActionListener(new ActionListener()
			{
			
				public void actionPerformed(ActionEvent e)
				{
					
					
					stop();
					
				}
			});
					
		
		}// end of login
		
		public void stop()
		{
		  login();
		}
		
		public void start()
		{
			//options.init();
		}
		
	

}
