import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {

			int a = 10 + new Random().nextInt(39);
			System.out.println(a);
			
		}
	}
}