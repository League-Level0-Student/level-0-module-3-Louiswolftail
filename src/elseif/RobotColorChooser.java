//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
Robot ez = new Robot();
		// 3. Ask the user what color they would like the robot to draw
String userColor = JOptionPane.showInputDialog("What color would you like the robot to draw");

	

		// 5. Use an if/else statement to set the pen color that the user requested
 if(userColor.equals("red")) {
	ez.penDown();
	ez.setPenColor(Color.red);
 }
 else if(userColor.equals("Blue")) {
	 ez.penDown();
	 ez.setPenColor(Color.blue);
 }
 else if(userColor.equals("Yellow")) {
	 ez.penDown();
	 ez.setPenColor(Color.yellow);
 }
		// 6. If the user doesn’t enter anything, choose a random color
 else if(userColor.equals("green")) {
	 System.out.println("Green");
 }
 else {
	 System.out.println();
 }
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
ez.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
 for (int i = 0; i < 8; i++) {
	ez.move(100);
	ez.turn(360/8);
	ez.setSpeed(100);

 }	
	}
}