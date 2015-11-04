import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		int userMood = JOptionPane.showOptionDialog(null,
				"Are you happy today?", "Happy", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "No",
						"Yes" }, null);
		if (userMood == 1) {
			JOptionPane.showMessageDialog(null,
					"Keep doing whatever you're doing.");
		} else {
			int unhappy = JOptionPane.showOptionDialog(null,
					"Do you want to be happy?", "No", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "No",
							"Yes" }, null);
			;
			if (unhappy == 0) {
				JOptionPane
						.showMessageDialog(null, "Whatever. You're hopless.");
			} else {
				JOptionPane.showMessageDialog(null,
						"Chanae something, dude. Duh!");
			}
		}
	}
}
