public class LazyTurtle extends DrunkTurtle {
	public LazyTurtle() {
		super();
		super.show(); // Forces to show the turtle on initialization.
	}

	public void moveForward(double d) {
		double chance = Math.random();
		if (chance <= 0.2) { // 20% to move forward like a drunk turtle.
			super.moveForward(d);
		} else if (chance > 0.6) { // 40% to move forward like a normal turtle.
			super.normalForward(d);
		} else // 40% to do nothing.
			return;
	}

	public void turnRight(int deg) {
		double chance = Math.random();
		if (chance <= 0.2) { // 20% to turn right like a drunk turtle.
			super.turnRight(deg);
		} else if (chance > 0.6) { // 40% to turn right like a normal turtle.
			super.normalRight(deg);
		} else // 40% to do nothing.
			return;
	}

	public void turnLeft(int deg) {
		double chance = Math.random();
		if (chance <= 0.2) { // 20% to turn left like a drunk turtle.
			super.turnLeft(deg);
		} else if (chance > 0.6) { // 40% to turn left like a normal turtle.
			super.normalLeft(deg);
		} else // 40% to do nothing.
			return;
	}

	// Drunk and simple Turtle use hide with the same method.
	public long hide() {
		if (Math.random() <= 0.6) { // 60% to hide.
			super.hide();
		}
		return 0; // 40% to do nothing.
	}

	public void normalHide() {
		super.hide();
	}

	// Drunk and simple Turtle use show with the same method.
	public long show() {
		if (Math.random() <= 0.6) { // 60% to hide.
			super.show();
		}
		return 0; // 40% to do nothing.
	}

	// Drunk and simple Turtle use tailUp with the same method.
	public void tailUp() {
		if (Math.random() <= 0.6) {
			super.tailUp();
		}
	}

	// Drunk and simple Turtle use tailDown with the same method.
	public void tailDown() {
		if (Math.random() <= 0.6) {
			super.tailDown();
		}
	}
}
