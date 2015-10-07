import java.io.IOException;

public class POTATO {
	public static void main(String[] args) throws InterruptedException,
			IOException {
		for (int i = 1; i < 9; i++) {

			if (i == 4) {
				Runtime.getRuntime().exec("say four").waitFor();

			} else if (i == 8) {
				Runtime.getRuntime().exec("say more").waitFor();

			} else {
				Runtime.getRuntime().exec("say " + i + "potato").waitFor();
			}
		}
	}
}