package mgpizza;

import javax.swing.JFrame;

public class LoginTest extends JFrame 
{

	public static void main(String[] args)
	{

		int SCREENWIDTH = 400;
		int SCREENHEIGHT = 250;
		Login loginTest = new Login();
		loginTest.setTitle("MG Pizza");

		loginTest.setSize(SCREENWIDTH,SCREENHEIGHT);
		loginTest.setVisible(true);
		loginTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
