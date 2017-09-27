
/*-------- phone_display.java--------*/


package cellphone_simulation;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class phone_display extends JPanel implements ActionListener 
{
		      		JButton zero, one, two,three,four,five,six,seven,eight,nine,star, hash , erase , call , backspace;    //  buttons
		      		JTextField screen , screen1 , screen2;																 //   textArea
		      		String str_phonenumber="";
		      		Thread thread_hang;
// Cellphone Display model
        
    public phone_display()
    	{ 	
//   Creation of TextArea 
		    	
		        	screen = new JTextField(100);
		        	screen.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		        	add(screen);
		        	screen1 = new JTextField(100);
		        	screen1.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		        	add(screen1);
		        	screen2 = new JTextField(100);
		        	screen2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		        	add(screen2);
		        
//  layout
		        	setLayout(new GridLayout(6,3));  				
// Creation of buttons
		        	
//------  ONE BUTTON ----------//
		        	one = new JButton("1");
		        	one.setActionCommand("b_one");
		        	add(one);
		        	
//------  TWO BUTTON ----------//
		        	two = new JButton("2");
		        	two.setActionCommand("b_two");
		        	add(two);
		        	
//------  THREE BUTTON ----------//
		        	three = new JButton("3");
		        	three.setActionCommand("b_three");
		        	add(three);
		        	
//------  FOUR BUTTON ----------//
		        	four = new JButton("4");
		        	four.setActionCommand("b_four");
		        	add(four);
		        	
 //------  FIVE BUTTON ----------//
		        	five = new JButton("5");
		        	five.setActionCommand("b_five");
		        	add(five);
		        	
//------  SIX BUTTON ----------//
		        	six = new JButton("6");
		        	six.setActionCommand("b_six");
		        	add(six);
		        	
//------ SEVEN BUTTON ----------//
		        	seven = new JButton("7");
		        	seven.setActionCommand("b_seven");
		        	add(seven);    
		        	
//------  EIGHT BUTTON ----------//
		        	eight = new JButton("8");
		        	eight.setActionCommand("b_eight");
		        	add(eight);
		        	
//------  NINE BUTTON ----------//
		        	nine = new JButton("9");
		        	nine.setActionCommand("b_nine");
		        	add(nine);
		        	
//------  STAR BUTTON ----------//
		        	star = new JButton("*");
		        	star.setActionCommand("b_star");
		        	add(star);
		        	
//------  ZERO BUTTON ----------//
		        	zero = new JButton("0");
		        	zero.setActionCommand("b_zero");
		        	add(zero);
		        	
//------  HASH BUTTON ----------//
		         	hash = new JButton("#");
		        	hash.setActionCommand("b_hash");
		        	add(hash);
		        	
//------  ERASE BUTTON ----------//
		        	erase = new JButton("Erase");
		        	erase.setActionCommand("b_erase");
		         	add(erase);
		         	
//------  CALL BUTTON ----------//
		        	call = new JButton("Call");
		        	call.setActionCommand("b_call");
		        	add(call);
		        	
//------  BACKSPACE BUTTON ----------//
		        	backspace = new JButton("<=");
		        	backspace.setActionCommand("b_backspace");
		        	add(backspace);
		        	
//------ CREATION OF ACTIONlISTENER TO BUTTONS ----------//  
		        	one.addActionListener(this);
		        	two.addActionListener(this);
		        	three.addActionListener(this);
		        	four.addActionListener(this);
		        	five.addActionListener(this);
		        	six.addActionListener(this);
		        	seven.addActionListener(this);
		        	eight.addActionListener(this);
		        	nine.addActionListener(this);
		        	star.addActionListener(this);
		       		zero.addActionListener(this);
		       		hash.addActionListener(this);
		       		erase.addActionListener(this);
		       		call.addActionListener(this);
		       		backspace.addActionListener(this);
    	}
    
  public void actionPerformed(ActionEvent e) 
    	{
 //method for erase button to erase everything from the screen 
	  
		    	 if ("b_erase".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 screen.setText("");
		    	 }	 
// method for backspace
		    	 
		    	 if ("b_backspace".equals(e.getActionCommand())) 
		    	 {
		    		 if (str_phonenumber != null && str_phonenumber.length() > 0 )
		    		 {
			    		   str_phonenumber = str_phonenumber.substring(0,str_phonenumber.length()-1);
			    		   screen.removeAll();
			               screen.setText(str_phonenumber);
		    		 }
		    	   else
		    	   	{
			    		   screen.removeAll();
			       		   screen.setText(""); 
		    	   	}     
		    	  }	 
		    	 
// method for button one
		    	 
		    	 if ("b_one".equals(e.getActionCommand())) 
		    	 {   
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "1";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button two
		    	 
		    	 if ("b_two".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "2";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button three 
		    	 
		    	 if ("b_three".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "3";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button four
		    	 
		    	 if ("b_four".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "4";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button five
		    	 
		    	 if ("b_five".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "5";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button six
		    	 
		    	 if ("b_six".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "6";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button seven
		    	 
		        if ("b_seven".equals(e.getActionCommand())) 
		    	 {
				        screen.removeAll();
				        str_phonenumber= screen.getText() + "7";
				        screen.setText(formatting());
		    	 }
		        
// method for button eight
		        
		    	 if ("b_eight".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "8";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button nine
		    	 
		    	 if ("b_nine".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "9";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button zero
		    	 
		    	 if ("b_zero".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "0";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button star
		    	 
		    	 if ("b_star".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "*";
			    		 screen.setText(formatting());
		    	 }
		    	 
// method for button hash
		    	 
		    	 if ("b_hash".equals(e.getActionCommand())) 
		    	 {
			    		 screen.removeAll();
			    		 str_phonenumber= screen.getText() + "#";
			    		 screen.setText(formatting());
		    	 }
		    	 
 // method for button call
		    	 
		    	 if ("b_call".equals(e.getActionCommand())) 
		    	 {		
// invalid number code
		    		 
			    			if(str_phonenumber.contains("*")||str_phonenumber.contains("#"))
			    			{
			    				 screen.removeAll();
			    				 screen.setText("Invalid no.");
			    			}
			    			else
			    			{
			    				screen.setText("Calling..");
// disabling button while call is going on...
			    				buttonEnable(false);
			    				call.setActionCommand("b_EndCall");
			    				
			    	
			    			}
			    }
		    	 
// method for end call 
		    	 
		    	 if ("b_EndCall".equals(e.getActionCommand()))
		    	 {
// calling endCall function in Thread
		    		 thread_hang=new Thread(()->EndCall());       
				    thread_hang.start();
		    	 }
    	}
  
// method for ending call
  
     void EndCall()
	 	{
		    	screen.setText("HangingUp..");
				try 
					{
						Thread.sleep(5000);
					}
					catch (InterruptedException e1)
					{
						e1.printStackTrace();
					}
				screen.removeAll();
		    	screen.setText("");
// Enabling button after call ends up...
	    		 buttonEnable(true);
		    
	 	}
     
// method for formatting the str_phonenumber
     
    private String formatting() 
		{
// removing white spaces
				String str_format = str_phonenumber.replaceAll("-", "").trim();							
				
				if(str_format.length()>10)
					{
// to avoid more than 10 digits 
						str_phonenumber = str_phonenumber.substring(0, str_phonenumber.length()-1)  ;    
					}
					else if(str_format.length()>3 && str_format.length() <= 7)							
					{
// format for phone number "###-####'					
						str_phonenumber = str_format.substring(0,3)+ "-" + str_format.substring(3);		
					}
					else if(str_format.length() > 7)
					{
// format for phone number "###-###-####"
						str_phonenumber = str_format.substring(0,3)+ "-" + str_format.substring(3,6) + "-" + str_format.substring(6);
					}
			return str_phonenumber;
		}
    
 // method for enabling or disabling the buttons during call
    
    void buttonEnable(boolean a)
    {
			    	backspace.setEnabled(a);
					star.setEnabled(a);
					hash.setEnabled(a);
					zero.setEnabled(a);
					one.setEnabled(a);
					two.setEnabled(a);
					three.setEnabled(a);
					four.setEnabled(a);
					five.setEnabled(a);
					six.setEnabled(a);
					seven.setEnabled(a);
					eight.setEnabled(a);
					nine.setEnabled(a);
					erase.setEnabled(a);
    }
 }
  
    	 
    