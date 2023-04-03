import Turtle.*;

public class DrunkTurtle extends Turtle {
	public void moveForward(double d) {
		super.moveForward(Math.random() * d); // Calculates random distance between 0 and given distance and moves
												// forward.
		if (Math.random() <= 0.35) { // 35% to also turn 90 degrees right when told to move forward.
			super.turnRight(90);
		}
		if (Math.random() <= 0.45) { // 45% to move backwards calculated random distance between 0 and given distance
										// and moves forward.
			super.turnRight(180);
			super.moveForward(Math.random() * d);
			super.turnRight(180);
		} else
			super.moveForward(Math.random() * d); // 55% to move forward calculated random distance between 0 and given
													// distance and moves forward.
	}

	public void normalForward(double d) {
		super.moveForward(d);
	}

	public void normalLeft(int deg) {
		super.turnLeft(deg);
	}

	public void normalRight(int deg) {
		super.turnRight(deg);
	}

	public void turnRight(double deg) {
		double turnDeg = (Math.random() * 2 * deg); // Calculates random degree between 0 and 2 times given degrees.
		super.turnRight((int) turnDeg);
	}

	public void turnLeft(double deg) {
		double turnDeg = (Math.random() * 2 * deg); // Calculates random degree between 0 and 2 times given degrees.
		super.turnLeft((int) turnDeg);
	}

}
