  		// Program written in java

package cellphone_simulation;
import javax.swing.JFrame;
public class Cell_main 
{
		// mobile method that calls phone_display class and applet is started 
 public static void mobile()
    {
	        JFrame frame = new JFrame("Mobile_display");								// using JFrame to display the applet
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        phone_display newContentPane = new phone_display();							
	        newContentPane.setOpaque(true); 											//content panes must be opaque
	        frame.setContentPane(newContentPane);
	        frame.setSize(250,400);														// applet frame size
	        frame.setResizable(false);													// applet frame size
	        frame.setLocation(10,10);													// applet frame size
	        frame.setVisible(true);														// applet frame size
    }
 		// main class to run thread
 public static void main(String[] args) 
 {
			  javax.swing.SwingUtilities.invokeLater(new Runnable() {          //Runnable is thread class
			   public void run() 
			            {
			                mobile();        // calling method mobile
			            }
			        });
		    	}
}
