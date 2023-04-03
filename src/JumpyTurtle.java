public class JumpyTurtle extends IntelligentTurtle {
	public void moveForward(double d) {
		for (double steps = 0; steps < d;) {
			if (d <= 4) { // If distance left to move is 4 or less, move the distance.
				super.moveForward(d);
				return;
			}
			super.moveForward(4);
			this.tailUp();
			steps += 4; // Every 4 steps moved is added to the counter of steps initialized in line 3.
			d -= 4; // Every 4 steps moved is subtracted from the given distance.

			// For every 4 steps moved the turtle moves tail up or down.
			if (d <= 4) { // If distance left to move is 4 or less, move the distance.
				super.moveForward(d);
				return;
			} else {
				super.moveForward(4);
				this.tailDown();
				steps += 4;
				d -= 4;
			}
		}
		return;
	}

	public void normalForward(double d) {
		super.moveForward(d);
	}
}