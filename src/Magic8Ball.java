// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random
		// number into this variable using "new Random().nextInt(4)"
		int number = new Random().nextInt(4);
		// 3. Print out this variable
		System.out.println(number);
		// 4. Get the user to enter a question for the 8 ball
		String blah = JOptionPane
				.showInputDialog("Please enter a question for the 8 ball.");
		// 5. If the random number is 0
		if (number == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		if (number == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (number == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (number == 3) {
			JOptionPane.showMessageDialog(null, "Possible. Ask again.");
		}
		// -- write your own answer

	}
}
