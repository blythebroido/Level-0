import javax.swing.JOptionPane;

public class myadventure {
	public static void main(String[] args) {
		int choice1 = JOptionPane.showOptionDialog(null,
				"You are in a house in a bad storm. You see two doors, each with a window. You see spiders"
						+ " in one room, and crickets in the other room. Do you go into the spider room, or the cricket room?",
				" ", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Spider", "Cricket" }, null);
		if (choice1 == 0) {
			int choice2 = JOptionPane.showOptionDialog(null,
					"You see a room with either chocolate or candy corn. Which do you go into?", " ", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Chocolate", "Candy Corn" }, null);
			if (choice2 == 0) {
				int choice4 = JOptionPane.showOptionDialog(null,
						"You see this wierd old guy that tells you that you have to die. How do you want to die your painful death?",
						" ", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Electricuted", "T-Rex, 450 million years ago" }, null);
				if(choice4 == 0){
					JOptionPane.showMessageDialog(null, "Great. You remembered that the power was out from the storm. You live!");}
					else{
						JOptionPane.showMessageDialog(null, "You were eaten by the T-Rex. How come you didn't remember the power was out? ");
					}
			} else {
				int choice5= JOptionPane.showOptionDialog(null,
						"You see this wierd old guy that tells you that you have to die. How do you want to die your painful death?", " ", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Electricuted", "T-Rex, 450 million years ago" }, null);
			if(choice5 == 0){
				JOptionPane.showMessageDialog(null, "Great. You remembered that the power was out from the storm. You live!");
			}
			else{
				JOptionPane.showMessageDialog(null, "You were eaten by the T-Rex. How come you didn't remember the power was out? ");
			}
			}
		
			}
		 else {

			int choice3 = JOptionPane.showOptionDialog(null,
					"You now see a room with Little Eintseins show on and a room with Barney on. Which one?", " ", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Little Einsteins", "Barney" }, null);

		if(choice3 == 0){
			JOptionPane.showMessageDialog(null, "How are you watching TV? The power's out from the storm!");
		}
		if(choice3 == 1){
			JOptionPane.showMessageDialog(null, "How are you watching TV? The power's out from the storm!");
		}
		}
	}
}
