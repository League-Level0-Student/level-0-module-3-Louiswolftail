//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
 String Dizzy = JOptionPane.showInputDialog("How you dizzy want the robot from 1-10?");
 // 1. Use the dance method to make the robot spin.
if(Dizzy.equals("1")) {	
 dance(1);
}
else if (Dizzy.equals("2")) {
	dance(2);
}
else if (Dizzy.equals("3")) {
	dance(3);
}
else if (Dizzy.equals("4")) {
	dance(4);
}
else if (Dizzy.equals("5")) {
	dance(5);
}
else if (Dizzy.equals("6")) {
	dance (6);
}
else if (Dizzy.equals("7")) {
	dance (7);
}
else if (Dizzy.equals("8")) {
dance(8);	
}
else if (Dizzy.equals("9")) {
	dance(9);
}
else if (Dizzy.equals("10")) {
	dance(10);
}
}
	
	
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}


}