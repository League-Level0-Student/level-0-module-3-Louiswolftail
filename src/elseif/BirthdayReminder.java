
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 17th";
		String dadsBirthday = "May 1st Happy Birthday to your Dad!";
		String myBirthday = "July 2nd";

		// 2. Find out which birthday the user wants and store their response in a variable
	String input = JOptionPane.showInputDialog("Which Birthday do u want to know?");
		// 3. Print out what the user typed
		System.out.println(input);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(input.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
		else if(input.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		else if(input.equals("Timmy")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		
			
			
		}
	} 

