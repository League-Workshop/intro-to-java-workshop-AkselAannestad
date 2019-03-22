package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null,"you are taking a test to prove your worth. no capital letters allowed. failure will not be tolerated");
		String one=JOptionPane.showInputDialog("what is PewDiePie's real name?");
		if(one.equals("felix")) {
			JOptionPane.showMessageDialog(null, "you somehow got it correct");
		}
		String two=JOptionPane.showInputDialog("if the area of a square is 16, how long is a side?");
		if(two.equals("4")) {
			JOptionPane.showMessageDialog(null, "you are somewhat competent");
		}
		String three=JOptionPane.showInputDialog("how do you spell bambooozle?");
		if(three.equals("bamboozle")) {
			JOptionPane.showMessageDialog(null, "looks like i didn't bamboozle you");
		}
		String four=JOptionPane.showInputDialog("when did rome fall?");
		if(four.equals("432 bc")) {
			JOptionPane.showMessageDialog(null, "how did you know that you nerd");
		}
		String five=JOptionPane.showInputDialog("would you rather be a gamer or a furry?");
		if(five.equals("gamer")) {
			JOptionPane.showMessageDialog(null, "ayy gamer time");
		}
		String six=JOptionPane.showInputDialog("what games did the developers at respawn make before apex and titanfall?");
		if(six.equals("call of duty")) {
			JOptionPane.showMessageDialog(null, "respawn is the best tbh");
		}
		String eight=JOptionPane.showInputDialog("who played dark helmet in spaceballs?");
		if(eight.equals("rick moranis")) {
			JOptionPane.showMessageDialog(null, "i see your a man of culture as well. spaceballs is great.");
		}
		String nine=JOptionPane.showInputDialog("who chuckled because they were in danger?");
		if(nine.equals("ralph")) {
			JOptionPane.showMessageDialog(null, "*chuckles* nice");
		}
		String ten=JOptionPane.showInputDialog("what is the powerhouse of the cell?");
		if(ten.equals("mitochondria")) {
			JOptionPane.showMessageDialog(null, "I probably spelled this wrong but nice anyway");
		}
		
		
		String seven=JOptionPane.showInputDialog("Did you succeed this test?");
		
	

	
		
	}
}
