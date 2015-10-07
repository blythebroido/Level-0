
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the variable in
 * this recipe. 2. ask students what robot commands they think they will use to
 * make picture in the laminated hand-outs.
 */

public class FlamingNingaStar {
	private static final Color YELLOW = null;

	public static void main(String[] args) {

		int baseSize = 300; // the size of the black part of the star
		int flameSize = 200; // the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the
		// center of the screen

		// *15. Make some adjustments to see what other kinds of shapes you can
		// make.

		// 1. Make a new robot, and set it's pen down.
		Robot b = new Robot();
		// 12. Set the robot speed to 10
		b.setSpeed(10);
		b.setX(1000);
		b.setY(300);
		// 13. Make all the code below repeat 25 times
		for (int i = 0; i < 19; i++) {

			// 2. Turn the robot 1/8 of a circle
			b.turn(360 / 8);
			b.penDown();
			b.setPenWidth(10);
			// 3. Move the robot 64 pixels
			b.move(64);

			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will
			// turn the robot counter-clockwise.)
			b.turn(-40);
			b.setPenColor(Color.yellow);
			// 5. Move the robot the distance in the variable flameSize
			b.move(200);
			b.setPenColor(Color.YELLOW);
			// 6. Turn the robot 170 degrees
			b.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			b.move(200);
			// 8. Turn the robot 64 degrees to the right
			b.turn(64);
			// 9. Move the robot the distance in the variable baseSize
			b.setPenColor(Color.BLACK);
			b.move(300);
			// 10. Check that your shape is the same as Figure 1. This is one
			// arm of the ninja star.
			// 11. Color your ninja star like Figure 2. // 2. Turn the robot 1/8
			// of a circle
			b.turn(360 / 8);
			b.penDown();
			b.penUp();

			// 3. Move the robot 64 pixels

		}
		b.move(-175);
	}
}
