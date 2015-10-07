// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration
 * information at the check-in counter and print their boarding pass. You need
 * to collect the following information: First name Last name Destination
 * airport Birthday (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY,
 * M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your first name?");
		String lastname = JOptionPane
				.showInputDialog("What is your last name?");
		String destination = JOptionPane
				.showInputDialog("What is your destination airport?");
		String birthday = JOptionPane
				.showInputDialog("When is your birthday? (for security purposes)");
		String gender = JOptionPane
				.showInputDialog("Are you male or female? (for security purposes)");
		JOptionPane.showMessageDialog(null, lastname + " / " + name + " ( "
				+ birthday + ", " + gender + ")" + " \nTraveling to: "
				+ destination);
	}
}
