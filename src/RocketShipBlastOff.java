import java.io.IOException;

import javax.swing.JOptionPane;

public class RocketShipBlastOff {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		int rocket = 10;
		for (int i = 10; i > 0; i--) {
			Runtime.getRuntime().exec("say " + i).waitFor();
			// JOptionPane.showMessageDialog(null, ( ""+ i));

		}
		Runtime.getRuntime().exec("say " + "BLASTOFF!!!").waitFor();
		// JOptionPane.showMessageDialog(null, "BLASTOFF!!!");

	}
}