package section3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What is your name?");
		String age=JOptionPane.showInputDialog("What is your age");
		String adress=JOptionPane.showInputDialog("What is your adress?");
		String gender=JOptionPane.showInputDialog("Are you a boy or a girl or other");
		
		JOptionPane.showMessageDialog(null, name+" has been targeted my government satalite M3M3. The target's age is"+age+" The target's gender is "+gender+" Special forces are on their way. Don't share your information online ya noob!");
		
		
	}

}
