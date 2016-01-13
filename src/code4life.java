import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class code4life {
	 //* Ask the user how many hours they spent coding this week.
	  
	 //* 1. If it's more than 3, tell them they're a Code Ninja.
	  
	// * 2. If it's less than 2, tell them to stop watching YouTube and write code
	 //* instead.
	 //* 
	 //* 3. If it's more than 5, play the Batman theme song.
	 //*/

	public static void main(String[] args) {
	
		String a = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		int b = Integer.parseInt(a);
		if (b == 4) {
			JOptionPane.showMessageDialog(null, "You are a Code Ninga");
		}
		if (b == 1) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube, and write code instead.");
		}
		if(b > 5){
			playBatmanTheme();
		}
		if (b == 2) {
			JOptionPane.showMessageDialog(null, "Get a move on.");
		}
		if (b == 3) {
			JOptionPane.showMessageDialog(null, "You can do better.");
		}
		if (b == 5) {
			JOptionPane.showMessageDialog(null, "GO CODE SOME MORE OBVIOUSLY YOU LIKE IT");
		}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
