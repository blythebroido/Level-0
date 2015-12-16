import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class ChristmasTree {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		ChristmasTree ohChristmasTree = new ChristmasTree();
		ohChristmasTree.drawStar();
		ohChristmasTree.drawTreeBody();
		ohChristmasTree.drawTreeTrunk();
	}

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree increases with
						// each layer down

	void drawTreeBody() {
		// 8. Change the color of the line the tortoise draws to forest green
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		// 1. Make a variable for turnAmount and set it to 175
		int a = 175;
		// 2. Start the Tortoise facing to the right
		Tortoise.turn(90);
		// 5. Repeat steps 3 through 11, 11 times
		for (int i = 0; i < 11; i = i + 1) {
			// 3. Move the tortoise the width of the tree
			Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
			Tortoise.turn(a);
			// 6. Set the treeWidth to the current treeWidth times the scale
			treeWidth = treeWidth * scale;
			// 7. Move the tortoise the width of a tree again
			Tortoise.move(treeWidth);
			// 9. Turn the tortoise the current turn amount to the LEFT
			Tortoise.turn(-a);
			// 10. Set the treeWidth to the current treeWidth times the scale
			// again
			treeWidth = treeWidth * scale;
			// 11. Decrease turnAmount by 1
			a = a - 1;
		}
	}

	void drawTreeTrunk() {
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(.5 * treeWidth);
		// 2. Change the tortoise so that it is pointing straight down
		Tortoise.turn(90);
		// 4. Set the pen width to the tree width divided by 10
		Tortoise.setPenWidth(.1 * treeWidth);
		// 5. Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(Color.black);
		// 3. Move the tortoise a quarter the tree width
		Tortoise.move(.25 * treeWidth);
	}

	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees
		// makes a star.
for (int i = 0; i < 5; i++) {
Tortoise.setPenColor(Colors.Yellows.Gold);
	Tortoise.move(20);
Tortoise.turn(144);
}
	}

}
