import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's to do it...");
		// Get the user to enter an adjective
String adjective= JOptionPane.showInputDialog("Please enter adjective.");
		// Get the user to enter a type of liquid
String liquid= JOptionPane.showInputDialog("Please enter a type of liquid.");
		// Get the user to enter a body part
String bodypart= JOptionPane.showInputDialog("Please enter a body part.");
		// Get the user to enter a verb
String verb= JOptionPane.showInputDialog("Please enter a verb.");
		// Get the user to enter a place
String place= JOptionPane.showInputDialog("Please enter a place.");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, " Piranhas are more " + adjective +" during the day, so cross the river at night. Piranhas are attracted to fresh "
		+ liquid + ", \n and will most likely take a bite out of your " + bodypart +" if you " + verb + ". Whatever you do, if you have an open wound, \n try to find another way to get back to the " + place + ". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next line.

	}
}




