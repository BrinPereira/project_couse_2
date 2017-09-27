/*package assignment_1;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer 
{
	double counter= 10;
	
	Timer timer = new Timer();
	TimerTask task=new TimerTask() {
		
		public void run()
		{
			counter--;
			System.out.println(counter);
		}
	};

	public String start()
	{
		timer.scheduleAtFixedRate(task, 1000, 1000);
		return null;
		
	}

 public static void main(String args[])
 {
	 MyTimer startProject = new MyTimer();
	 startProject.start();
 }
    	
	
}
*/