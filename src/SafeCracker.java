import java.net.URL;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		/*
		 * Your mission: use the tryCode method to crack the safe by trying all
		 * possible combinations
		 */
		for (int i = 99999900; i < 10000000; i++) {

			tryCode(i);
		}
	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			//playSoundFromInternet("http://10.0.1.75/sounds/megusta.wav");
			JOptionPane.showMessageDialog(null,
					"Congratulations! You cracked the safe with " + guess);
			System.exit(0);
		}
	}

	public static void playSoundFromInternet(String soundURL) {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new URL(soundURL));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);

}
