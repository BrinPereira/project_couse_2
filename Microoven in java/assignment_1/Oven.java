	/*------ Oven.java---------    */
package assignment_1;

import javax.swing.JFrame;

public class Oven {

	public static void micro() {
		JFrame frame = new JFrame("MicroOven"); // using JFrame to display the
												// applet
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Display newContentPane = new Display();
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);
		frame.setSize(250, 250); // applet frame size
		frame.setResizable(false); // applet frame size
		frame.setLocation(10, 10); // applet frame size
		frame.setVisible(true); // applet frame size
	}

	// main class to run thread and timer
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				micro(); // calling method micro
			}
		});
	}
}
