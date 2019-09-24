//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String Banana = JOptionPane.showInputDialog("Do u like Bananas?");
		//2. if they say no, 
if(Banana.equals("no")) { 
	JOptionPane.showMessageDialog(null, "U Hate Bananas, PP head!");
	System.out.println("END QUIZ!!");
}
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
else if(Banana.equals("yes")) {
	String oofa = JOptionPane.showInputDialog("mmmmmmmmmmm! btw Whats your favorite hobby?");
	JOptionPane.showMessageDialog(null, oofa +" is much better with bananas!");
}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than â€œyesâ€? or â€œnoâ€?
		//	show a pop up that says â€œYou are bananas!â€?
	
	}

}
