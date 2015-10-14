// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answern = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(answern);
		// Ask the user how many dimes they have, and convert their answer
String answerd = JOptionPane.showInputDialog("How many dimes od you have?");
int dimes = Integer.parseInt(answerd);
		// Ask the user how many quarters they have, and convert their answer
String answerq = JOptionPane.showInputDialog("How many quarters do you have?");
int quarters = Integer.parseInt(answerq);
		// Calculate how much money the user has and save it in a double variable 
int n = (5 * nickels);
int d = (10 * dimes);
int q = (25 * quarters);
double money = (n + d + q);
double total = (money / 100);
		// Tell the user how much money they have
 
 JOptionPane.showMessageDialog(null, "You have $" + total + "! Have a good sandwich!");
 
	}
}

