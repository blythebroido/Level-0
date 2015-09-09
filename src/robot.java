import org.jointheleague.graphical.robot.Robot;

public class robot {
	public static void main(String[] args) {
		Robot regular = new Robot();
		regular.penDown();
		regular.move(300);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		regular.turn(15);
		regular.move(20);
		for (int i = 0; i < 10; i++) {
			regular.turn(15);
			regular.move(20);
			regular.move(10);
			regular.turn(180);
			for (int j = 0; j < 20; j++) {
				for (int a = 0; a < 10; a++) {
					regular.turn(15);
					regular.move(20);
				}
			}
		}
	}
}