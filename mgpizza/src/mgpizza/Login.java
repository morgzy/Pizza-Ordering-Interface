/*
 * A GUI Login Page
 * with "secure" login checks
 * by Morgan Hopkins
 * 200818327
 * 17/10/2022
 */

package mgpizza;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class Login extends JFrame implements ActionListener
{
	// Initialise elements
	private JLabel lblTitle,lblUsername,lblPassword,lblResult;
	private JTextField txtUsername,txtPassword;
	private JButton btnExit,btnLogin;
	private JPanel pnlOne,pnlTwo,pnlThree,pnlFour,pnlFive;
	private JPasswordField pwdPassword;
	
	private Color cDark = new Color(0,93,93);
	private Color cLight = new Color(200,200,200);
	private Color cHeading = new Color(255,0,0);
	private Color cHeadPnl = new Color(155,0,0);
	
	// Initialise Container
	Container pane = getContentPane();

	public Login()
	{

		// Create labels
		lblTitle = new JLabel("MG PIZZA");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setForeground(cHeading);
		
		lblUsername = new JLabel("User name:");
		lblPassword = new JLabel("Password:");
		lblResult = new JLabel("");

		// Create text fields
		txtUsername = new JTextField(10);

		// Create buttons
		btnExit = new JButton("Exit");
		btnLogin = new JButton("Login");
		
		// Create password field
		pwdPassword = new JPasswordField(10);

		// Create panels
		pnlOne = new JPanel();
		pnlTwo = new JPanel();
		pnlThree = new JPanel();
		pnlFour = new JPanel();
		pnlFive = new JPanel();

		// Set layout
		pane.setLayout(new GridLayout(5,1));
		pnlOne.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlTwo.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnlThree.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnlFour.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pane.setBackground(cDark);
		pnlOne.setBackground(cHeadPnl);
		pnlTwo.setBackground(cDark);
		pnlThree.setBackground(cDark);
		pnlFour.setBackground(cDark);
		pnlFive.setBackground(cDark);
		
		lblUsername.setForeground(cLight);
		lblPassword.setForeground(cLight);
		lblResult.setForeground(cLight);
		
		
		// Panel One (Heading)
		pnlOne.add(lblTitle);

		// Panel Two (User name)
		pnlTwo.add(lblUsername);
		pnlTwo.add(txtUsername);

		// Panel Three (Password)
		pnlThree.add(lblPassword);
//		pnlThree.add(txtPassword);
		pnlThree.add(pwdPassword);

		// Panel Four (Exit/Login Buttons)
		pnlFour.add(btnExit);
		pnlFour.add(btnLogin);

		// Panel Five (Result message)
		pnlFive.add(lblResult);

		// Add panels to pane
		pane.add(pnlOne);
		pane.add(pnlTwo);
		pane.add(pnlThree);
		pane.add(pnlFour);
		pane.add(pnlFive);

		// Add Listeners
//		txtUsername.addActionListener(this);
		btnLogin.addActionListener(this);
		btnExit.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		
//		// Get username
		String username = txtUsername.getText();

		// Login button has been clicked
		if(e.getSource()==btnLogin)
		{
			char[] password = pwdPassword.getPassword();
			char[] correctPass = new char[] {'t', 'e', 's', 't'};
			
			if (Arrays.equals(password, correctPass)) 
			{
				JOptionPane.showMessageDialog(pane, "Welcome, "+username+"!");
			}
			else
			{
				JOptionPane.showMessageDialog(pane,  "Incorrect password!");
			}

		}

		// Exit button has been clicked, time to say bye
		if(e.getSource()==btnExit)
		{
			lblResult.setText("Bye, Felicia!");
		}

	}

}
