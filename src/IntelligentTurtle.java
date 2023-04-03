import Turtle.*;

public class IntelligentTurtle extends Turtle {
	public void draw(int sides, double size) {
		this.tailDown();
		if (sides < 3)
			return;
		int deg = turnDeg(sides);
		for (int i = 0; i < sides; i++) {
			this.moveForward(size);
			this.turnLeft(180 + deg);
		}
		this.tailUp();
	}

	protected int turnDeg(int sides) {
		int deg = ((sides - 2) * 180) / sides; // Math formula to calculate degrees between sides of a polygon.
		return deg;
	}
}
