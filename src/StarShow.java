import java.awt.Color;

import javafx.scene.layout.Background;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShow {

	Robot b = new Robot("batman");
	Robot tortoise = new Robot ("june");

	void makeStars() {

		String color = JOptionPane.showInputDialog("What color star would you like? Please pick only: red, orange, yelloe, green, or blue.");
		if(color.equals ("red")){
			b.setPenColor(Color.WHITE);
		}
		if(color.equals ("orange")){
			b.setPenColor(Color.CYAN);
		}
		if(color.equals ("yellow")){
			b.setPenColor(Color.BLUE);
		}
		if(color.equals ("green")){
			b.setPenColor(Color.magenta);
		}
		if(color.equals ("blue")){
			b.setPenColor(Color.PINK);
		}
		// 13. Set the speed to 8
		tortoise.setWindowColor(Color.CYAN);
b.setSpeed(10);

		// 6. Make a variable to hold the X position of the Robot and set it to
		// 10

b.sparkle();

int blah = 10;
		// 7. Make a variable to hold the Y position of the Robot and set it to
		// 950
int bleh = 950;
		// 8. Make a variable to hold the star size and set it to 25
int starry = 25;
		// 12. Repeat the steps #19 to #18, 30 times
for (int i = 0; i < 30; i++) {
	

		// 19. Set the pen width to i
b.setPenWidth(i);
		// 10. Set the X position of the robot to your X variable
b.setX(blah);
		// 11. Set the Y position of the robot to your Y variable
b.setY(bleh);
		// 9. Call the drawStar() method with your star size variable
drawStar(starry);
		// 14. Increase the X position by star size. See Figure 2.
blah= blah + starry;
		// 15. decrease the Y position by star size. See Figure 3.
bleh= bleh - starry;
		// 16. Increase the star size by 20
starry=starry + 20;
		// 17. Turn the robot 12 degrees
b.turn(12);

}
	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		b.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at
		// http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {

			// 1. Move the robot the distance of the starSize variable
			b.move(starSize);
			// 3. Turn the robot 144 degrees
			b.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
