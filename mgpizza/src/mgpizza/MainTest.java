package mgpizza;

import javax.swing.JFrame;

public class MainTest {
	
	public static void main(String[] args)
	{

		int SCREENWIDTH = 800;
		int SCREENHEIGHT = 600;
		Main mainTest = new Main();
		mainTest.setTitle("MG Pizza Main");

		mainTest.setSize(SCREENWIDTH,SCREENHEIGHT);
		mainTest.setVisible(true);
		mainTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
