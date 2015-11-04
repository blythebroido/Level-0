import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String catty = JOptionPane.showInputDialog("How many cats do you have");
		// 2. Convert their answer into an int
int cats = Integer.parseInt(catty);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(cats > 3){
	JOptionPane.showMessageDialog(null, "You are a crazy cat lady, dude.");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
else{
	playVideo("https://www.youtube.com/watch?v=8HVWitAW-Qg");
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
